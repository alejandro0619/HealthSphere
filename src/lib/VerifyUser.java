/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

/**
 *
 * @author Aleja
 */
public class VerifyUser {
    private String email;
    private String password;
    private boolean verified;
    
    public VerifyUser(String email, String password) {
        // Fetch
        this.email = email;
        this.password = password;
        
    }
    
    
    private void verify() {
       // Fetch DB
       this.verified = true;
    }
    
    public boolean isVerified() {
        return this.verified;
    }
}
