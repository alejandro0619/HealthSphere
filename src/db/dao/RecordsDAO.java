/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.dao;

import db.ConnectionHandler;
import db.QueryResponses;
import db.entities.Doctor;
import db.entities.Patient;
import java.sql.Connection;
import db.entities.Record;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nyderlin Rivas
 */
public class RecordsDAO {
    private Connection conn;
    
    public RecordsDAO(){
        this.conn = new ConnectionHandler().getConn();
    }
    public Integer getLastInsertId() throws SQLException{
        ResultSet rs = this.conn.createStatement().executeQuery("SELECT LAST_INSERT_ID()");
        if(rs.next()){
            return rs.getInt(1);
        }
        return null;
    }
 
    public QueryResponses insertRecord(Record reporte)throws SQLException{
        String query = "INSERT INTO reporte (id, fecha_emision, alergias, descrip_alergias, patologias, descrip_patologias, descrip_reporte, id_paciente ,id_medico, estado, tipo_sangre) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement statement = this.conn.prepareStatement(query);

         statement.setNull(1, java.sql.Types.INTEGER); // id
         statement.setDate(2, (Date) reporte.getFechaEmision()); // preguntarrr
         statement.setString(3, reporte.getAlergias());
         statement.setString(4, reporte.getDescripAlergias());
         statement.setString(5, reporte.getPatologias());
         statement.setString(6, reporte.getDescripPatologias());
         statement.setString(7, reporte.getDescripReporte());
         statement.setInt(8, reporte.getIdPaciente());
         statement.setInt(9, reporte.getMedico().getId());
         statement.setString(10, reporte.getEstado());
         statement.setString(11, reporte.getTipoSangre());
         statement.setString(11, reporte.getSeguro());
         
         int insertedRows = statement.executeUpdate(); // filas afectadas 
         this.conn.close();
            if (insertedRows > 0) {
                return new QueryResponses(false, "Se ha obtenido el reporte");
            } else {
                return new QueryResponses(true, "No se ha podido obtener reporte");
            }
    }
    public Record getRecordByID(String ID) throws SQLException {
        String query = "SELECT * FROM reporte WHERE id = ?";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, ID);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                   //return extractRecords(rs);
                }
            }
        }
        return null;// no se encontro el reporte
    }
  
    
    public List<Record> getAllRecords() throws SQLException {
        List<Record> Records = new ArrayList<>();
        String query = "SELECT * FROM reporte WHERE id_medico = ? AND id_paciente = ?";
        try (PreparedStatement statement = conn.prepareStatement(query)){
             statement.setInt(1, Doctor.getIdMedico());
             statement.setString(2, Patient.getIdPaciente());
            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    //Records.add(extractRecords(rs));
                }
            }
            return Records;
        }
    }
    
    

    

}
