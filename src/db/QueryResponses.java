/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author Aleja
 */
public class QueryResponses {
    private boolean isError;
    private String message;
    
    public QueryResponses (boolean isError, String message) {
        this.isError = isError;
        this.message = message;
    }
    
    public boolean checkErrors() {
        return this.isError;
    }
    
    public String getMessage() {
        return this.message;
    }
}
