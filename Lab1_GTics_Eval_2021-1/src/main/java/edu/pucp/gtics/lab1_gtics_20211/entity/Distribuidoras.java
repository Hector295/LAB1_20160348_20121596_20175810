package edu.pucp.gtics.lab1_gtics_20211.entity;
import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name="distribuidoras")
public class Distribuidoras {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="iddistribuidora")
    public int iddistribuidora;

    @Column(name="nombre")
    public String nombreDistribuidora;

    @Column(name="descripcion")
    public String descripcionDistribuidora;

    @Column(name="fundacion", nullable = false)
    public int fundacion;

    @Column(name="sede")
    public String sede;

    public int getIddistribuidora() {
        return iddistribuidora;
    }

    public void setIddistribuidora(int iddistribuidora) {
        this.iddistribuidora = iddistribuidora;
    }

    public String getNombreDistribuidora() {
        return nombreDistribuidora;
    }

    public void setNombreDistribuidora(String nombreDistribuidora) {
        this.nombreDistribuidora = nombreDistribuidora;
    }

    public String getDescripcionDistribuidora() {
        return descripcionDistribuidora;
    }

    public void setDescripcionDistribuidora(String descripcionDistribuidora) {
        this.descripcionDistribuidora = descripcionDistribuidora;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

}
