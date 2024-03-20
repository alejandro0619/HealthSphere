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
    public QueryResponses insertPatient(Patient patient) throws SQLException {
        String query = "INSERT INTO paciente (celular_1, celular_2, nombre_completo, cedula, id, direccion, fecha_nacimiento, correo_electronico, id_doctor) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, patient.getPhoneNumber1());
            statement.setString(2, patient.getPhoneNumber2());
            statement.setString(3, patient.getFullName());
            statement.setString(4, patient.getID());
            statement.setNull(5, java.sql.Types.INTEGER);
            statement.setString(6, patient.getAddress());
            statement.setDate(7, new java.sql.Date(patient.getBirthdate().getTime()));
            statement.setString(8, patient.getEmail());
            statement.setInt(9, patient.getDoctor().getId()); // wtf
            int insertedRows = statement.executeUpdate();
            this.conn.close();
            
            if (insertedRows > 0) {
                return new QueryResponses(false, "Se ha registrado al paciente correctamente.");
            } else {
                return new QueryResponses(true, "No se ha podido registrar al paciente");
            }
        }
    }

    // Method to retrieve a patient by ID
    public Patient getPatientByID(String ID) throws SQLException {
        String query = "SELECT * FROM patients WHERE cedula = ?";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, ID);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    return extractPatientFromResultSet(rs);
                }
            }
        }
        return null; // Patient not found
    }

    // Method to retrieve all patients
    public List<Patient> getAllPatients() throws SQLException {
        List<Patient> patients = new ArrayList<>();
        String query = "SELECT * FROM patients";
        try (Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(query)) {
            while (rs.next()) {
                patients.add(extractPatientFromResultSet(rs));
            }
        }
        return patients;
    }

    // Helper method to extract patient information from the ResultSet
    private Patient extractPatientFromResultSet(ResultSet rs) throws SQLException {
        String phoneNumber1 = rs.getString("celular_1");
        String phoneNumber2 = rs.getString("celular_2");
        String fullName = rs.getString("nombre_completo");
        String ID = rs.getString("cedula");
        int dbID = rs.getInt("id");
        String address = rs.getString("direccion");
        java.util.Date birthdate = rs.getDate("fecha_nacimiento");
        String email = rs.getString("correo_electronico");
        int doc = rs.getInt("id_doctor");
        return new Patient(phoneNumber1, phoneNumber2, fullName, ID, dbID, address, birthdate, email, new DoctorDAO().getDoctorById(doc));
    }
}
