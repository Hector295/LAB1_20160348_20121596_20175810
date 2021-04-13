package edu.pucp.gtics.lab1_gtics_20211.entity;

import javax.persistence.*;

@Entity
@Table(name="plataformas")
public class Plataformas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idplataforma;
    @Column(name = "nombre")
    private String nombrePlataforma;
    @Column(name = "descripcion")
    private String descripcionPlataforma;

    public int getIdplataforma() {
        return idplataforma;
    }

    public void setIdplataforma(int idplataforma) {
        this.idplataforma = idplataforma;
    }

    public String getNombrePlataforma() {
        return nombrePlataforma;
    }

    public void setNombrePlataforma(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
    }

    public String getDescripcionPlataforma() {
        return descripcionPlataforma;
    }

    public void setDescripcionPlataforma(String descripcionPlataforma) {
        this.descripcionPlataforma = descripcionPlataforma;
    }
}
