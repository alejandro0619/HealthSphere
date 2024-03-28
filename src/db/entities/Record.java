/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.entities;

/**
 *
 * @author Nyderlin Rivas
 */
import java.util.Date;

public class Record{
    private Integer id;
    private Date fecha_emision;
    private String alergias;
    private String descrip_alergias;
    private String patologias;
    private String descrip_patologias;
    private String descrip_reporte;
    private Integer id_paciente;
    private Doctor medico;
    private String estado;
    private String tipo_sangre;
    private String seguro;
    
    public Record(Integer id,Date fecha_emision, String alergias, String descrip_alergias, String patologias, String descrip_patologias, String descrip_reporte, Integer id_paciente, Doctor medico){
        this.id = id;
        this.fecha_emision = fecha_emision;
        this.alergias = alergias;
        this.descrip_alergias = descrip_alergias;
        this.patologias = patologias;
        this.descrip_patologias = descrip_patologias;
        this.descrip_reporte = descrip_reporte;
        this.id_paciente = id_paciente;
        this.medico = medico;
        this.estado = estado;
        this.tipo_sangre = tipo_sangre;
        this.seguro = seguro;
    
    }

   
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaEmision() {
        return fecha_emision;
    }

    public void setFechaEmision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getDescripAlergias() {
        return descrip_alergias;
    }

    public void setDescripAlergias(String descrip_alergias) {
        this.descrip_alergias = descrip_alergias;
    }

    public String getPatologias() {
        return patologias;
    }

    public void setPatologias(String patologias) {
        this.patologias = patologias;
    }

    public String getDescripPatologias() {
        return descrip_patologias;
    }

    public void setDescripPatologias(String descrip_patologias) {
        this.descrip_patologias = descrip_patologias;
    }

    public String getDescripReporte() {
        return descrip_reporte;
    }

    public void setDescripReporte(String descrip_reporte) {
        this.descrip_reporte = descrip_reporte;
    }
    
    public int getIdPaciente() {
        return id_paciente;
    }

    public void setIdPaciente(int id) {
        this.id_paciente = id_paciente;
    }
    
    public Doctor getMedico() {
        return medico;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoSangre() {
        return tipo_sangre;
    }

    public void setTipoSangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }
    
    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }
    
}
