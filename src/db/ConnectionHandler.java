/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.*;


/**
 *
 * @author Aleja
 */
public class ConnectionHandler {
    private final String url = "jdbc:mysql://localhost:3306/health_sphere";
    private final String username = "root";
    private final String password = "";
        
    public ConnectionHandler() {
        try {
            Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            System.out.println("Se ha conectado bien");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM medico");
            
            while(rs.next()) {
                int id = rs.getInt("id");
                String fullname = rs.getString("nombre_completo");
                System.out.println("EL id es: " + id + " y el nombre es: " + fullname);
                
            }
            rs.close();
            statement.close();
            conn.close();
        } catch(SQLException e) {
        }
    }
}
