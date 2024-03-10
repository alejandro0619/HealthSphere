/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.dao;

import db.QueryResponses;
import db.entities.Doctor;
import static db.sec.PasswordHashing.hashPassword;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import db.ConnectionHandler;

/**
 *
 * @author Aleja
 */
public class DoctorDAO {
    
    private Connection conn;
    
    public DoctorDAO() {
        this.conn = new ConnectionHandler().getConn();
    }
    
    public boolean check_existence(Doctor medico) throws SQLException {
        String query = "SELECT id FROM medico WHERE cedula = ? OR correo_electronico = ?";
        PreparedStatement statement = this.conn.prepareStatement(query);
        statement.setString(1, medico.getCedula());
        statement.setString(2, medico.getCorreoElectronico());
        
        ResultSet rs = statement.executeQuery();
        
        return rs.next();

    }
    
    public QueryResponses insertDoctor(Doctor medico) throws SQLException, NoSuchAlgorithmException {
        String query = "INSERT INTO medico (id, nombre_completo, correo_electronico, cedula, direccion, especialidad, contrasena) VALUES (?,?,?,?,?,?,?)";

        String hashedPassword = hashPassword(medico.getContrasena());
        
        
        PreparedStatement statement = this.conn.prepareStatement(query);
        
        // Set values for the parameters
            statement.setNull(1, java.sql.Types.INTEGER); // id
            statement.setString(2, medico.getNombreCompleto()); // nombre_completo
            statement.setString(3, medico.getCorreoElectronico()); // correo_electronico
            statement.setString(4, medico.getCedula()); // cedula
            statement.setString(5, medico.getDireccion()); // direccion
            statement.setString(6, medico.getEspecialidad()); // especialidad
            statement.setString(7, hashedPassword); // contrasena
            
            if (this.check_existence(medico)) {
                return new QueryResponses(true, "La cédula o el correo electrónico ya existe en la DB");
                
            } else {
                int insertedRows = statement.executeUpdate();
                this.conn.close();
                if (insertedRows > 0) {
                   return new QueryResponses(false, "Se ha añadido correctamente el usuario");
                } else {
                    return new QueryResponses(true, "Un error inesperado ha sucedido, contacte a los administradores del sistema");
                }
            }
    }
    
    
    public Doctor getDoctor(String email, String password) throws SQLException, NoSuchAlgorithmException {
        Doctor doctor = null;
        String query = "SELECT * FROM medico WHERE correo_electronico = ? AND contrasena = ?";
        String hashedPassword = hashPassword(password);
        
        try (PreparedStatement statement = this.conn.prepareStatement(query)) {
            statement.setString(1, email);
            statement.setString(2, hashedPassword);
            
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("id");
                    String nombreCompleto = rs.getString("nombre_completo");
                    String cedula = rs.getString("cedula");
                    String direccion = rs.getString("direccion");
                    String especialidad = rs.getString("especialidad");
                    doctor = new Doctor(id, nombreCompleto, email, cedula, direccion, especialidad, password);
                }
                // Close resources
            }
        }
        return doctor;
    }
}
