/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import db.entities.Doctor;

/**
 *
 * @author Aleja
 */
public class SessionManager {
    private static SessionManager instance;
    private boolean isLoggedIn;
    private Doctor currentUser;

    private SessionManager() {
        // Private constructor to prevent instantiation
        isLoggedIn = false;
        currentUser = null;
    }

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public Doctor getCurrentUser() {
        return currentUser;
    }

    public void login(Doctor user) {
        // Perform authentication here if needed
        currentUser = user;
        isLoggedIn = true;
    }

    public void logout() {
        isLoggedIn = false;
        currentUser = null;
    }
}

