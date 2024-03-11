/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.entities;

/**
 *
 * @author Aleja
 */
import java.util.Date;

public class Patient {
    private String phoneNumber1;
    private String phoneNumber2;
    private String fullName;
    private String ID;
    private String dbID;
    private String address;
    private Date birthdate;
    private String email;
    private Doctor doc;
    // Constructor
    public Patient(String phoneNumber1, String phoneNumber2, String fullName, String ID,
                   Integer dbID, String address, Date birthdate, String email, Doctor doc) {
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.fullName = fullName;
        this.ID = ID;
        this.dbID = null;
        this.address = address;
        this.birthdate = birthdate;
        this.email = email;
        this.doc = doc;
    }
    
    

    // Getters and setters
    
    public Doctor getDoctor() {
        return this.doc;
    }
    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDbID() {
        return dbID;
    }

    public void setDbID(String dbID) {
        this.dbID = dbID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

