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
class ConnectionHandler {
    private final String url = "jdbc:mysql://localhost:3306/health_sphere";
    private final String username = "xxx";
    private final String password = "xxx";
    private Connection conn;
    
    public ConnectionHandler() {
        try {
            this.conn = DriverManager.getConnection(this.url, this.username, this.password);
            System.out.println("Se ha conectado bien");     
        } catch(SQLException e) {
        }
    }
    
    public Connection getConn() {
        return this.conn;
    }
}
