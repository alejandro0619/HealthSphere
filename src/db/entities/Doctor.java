/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.entities;

/**
 *
 * @author Aleja
 */
public class Doctor {
    private Integer id;
    private String nombreCompleto;
    private String correoElectronico;
    private String cedula;
    private String direccion;
    private String especialidad;
    private String contrasena;

    // Constructor
    public Doctor(Integer id, String nombreCompleto, String correoElectronico, String cedula, String direccion, String especialidad, String contrasena) {
        this.id = null;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.cedula = cedula;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.contrasena = contrasena;
    }

    // Getter methods
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getContrasena() {
        return contrasena;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    // Setter methods (if needed)
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}

