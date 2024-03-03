/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author Aleja
 */
import java.sql.*;
import db.entities.Doctor;

public class QueriesHandler {
    private Connection conn;
    
    public QueriesHandler(Connection conn) {
        this.conn = conn;
    }
    
    public boolean insertDoctor(Doctor medico, String password) throws SQLException {
        String query = "INSERT INTO medico (id, nombre_completo, correo_electronico, cedula, direccion, especialidad, contrasena) VALUES (?,?,?,?,?,?,?)";
        
        PreparedStatement statement = this.conn.prepareStatement(query);
        
        // Set values for the parameters
            statement.setNull(1, java.sql.Types.INTEGER); // id
            statement.setString(2, medico.getNombreCompleto()); // nombre_completo
            statement.setString(3, medico.getCorreoElectronico()); // correo_electronico
            statement.setString(4, medico.getCedula()); // cedula
            statement.setString(5, medico.getDireccion()); // direccion
            statement.setString(6, medico.getEspecialidad()); // especialidad
            statement.setString(7, medico.getContrasena()); // contrasena
            
            int rowsInserted = statement.executeUpdate();
            
            if (rowsInserted > 0) {
                System.out.print("Nueva fila");
                return true;
            } else {
                System.out.print("nada");
                return false;
            }
    }
    
    public Doctor getDoctor(String email, String password) throws SQLException {
        Doctor doctor = null;
        
        String query = "SELECT * FROM medico WHERE correo_electronico = ? AND contrasena = ?";
        try (PreparedStatement statement = this.conn.prepareStatement(query)) {
            statement.setString(1, email);
            statement.setString(2, password);
            
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    String nombreCompleto = rs.getString("nombre_completo");
                    String cedula = rs.getString("cedula");
                    String direccion = rs.getString("direccion");
                    String especialidad = rs.getString("especialidad");
                    doctor = new Doctor(null, nombreCompleto, email, cedula, direccion, especialidad, password);
                }
                // Close resources
            }
        }
        return doctor;
    }
}
