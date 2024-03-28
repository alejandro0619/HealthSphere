/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.dao;

/**
 *
 * @author Aleja
 */
import db.ConnectionHandler;
import db.QueryResponses;
import db.entities.Patient;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import views.SessionManager;

public class PatientDAO {
    private Connection conn;

    public PatientDAO() {
        this.conn = new ConnectionHandler().getConn();
    }
    
    // Method to insert a new patient into the database
    public Integer insertPatient(Patient patient) throws SQLException {
        String query = "INSERT INTO paciente (celular_1, celular_2, nombre_completo, cedula, id, direccion, fecha_nacimiento, correo_electronico, id_doctor, lugar_nacimiento, genero) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ? ,? ,?)";
        try (PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, patient.getPhoneNumber1());
            statement.setString(2, patient.getPhoneNumber2());
            statement.setString(3, patient.getFullName());
            statement.setString(4, patient.getID());
            statement.setNull(5, java.sql.Types.INTEGER);
            statement.setString(6, patient.getAddress());
            statement.setDate(7, new java.sql.Date(patient.getBirthdate().getTime()));
            statement.setString(8, patient.getEmail());
            statement.setInt(9, patient.getDoctor().getId()); // wtf
            statement.setString(10, patient.getLugarNacimiento());
            statement.setString(11, patient.getGenero());
            
            
            statement.executeUpdate();
            ResultSet genKeys = statement.getGeneratedKeys();
                  
           if (genKeys.next()) {
               return genKeys.getInt(1);
               
           } else {
               return null;
           }    
        
        }
    }
}
