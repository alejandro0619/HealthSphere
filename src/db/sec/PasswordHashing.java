/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.sec;

/**
 *
 * @author Aleja
 */

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class PasswordHashing {
    // Fixed salt value for demonstration purposes
    private static final String SALT = "ThisIsMyFixedSalt";

    // Method to hash a password using SHA-256 and a fixed salt
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        // Concatenate the password and salt
        String saltedPassword = password + SALT;

        // Create SHA-256 message digest instance
        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        // Generate the hash value
        byte[] hashedBytes = digest.digest(saltedPassword.getBytes());

        // Convert the byte array to a base64 encoded string
        return Base64.getEncoder().encodeToString(hashedBytes);
    }
}

