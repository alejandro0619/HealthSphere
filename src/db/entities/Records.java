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

public class Records{
    private Integer id;
    private Date fecha_emision;
    private String alergias;
    private String descrip_alergias;
    private String patologias;
    private String descrip_patologias;
    private String descrip_reporte;
    private Integer id_paciente;
    private Integer id_medico;
    
    public Records(int id, Date fecha_emision, String alergias, String descrip_alergias, String patologias, String descrip_patologias, String descrip_reporte,Integer id_paciente,Integer id_medico){
        this.id = id;
        this.fecha_emision = fecha_emision;
        this.alergias = alergias;
        this.descrip_alergias = descrip_alergias;
        this.patologias = patologias;
        this.descrip_patologias = descrip_patologias;
        this.descrip_reporte = descrip_reporte;
        this.id_paciente = id_paciente;
        this.id_medico = id_medico;
    
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
    public int getIdMedico() {
        return id_medico;
    }

    public void setIdMedico(int id) {
        this.id_medico = id_medico;
    }
    
}
