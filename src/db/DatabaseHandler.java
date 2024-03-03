/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author Aleja
 */
public class DatabaseHandler {
    private ConnectionHandler ch;
    private QueriesHandler qh;
    
    public DatabaseHandler() {
        this.ch = new ConnectionHandler();
        this.qh = new QueriesHandler(this.ch.getConn());
    }
    
    public QueriesHandler queriesHandler() {
        return this.qh;
    }
}
