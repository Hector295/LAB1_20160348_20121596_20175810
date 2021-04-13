package edu.pucp.gtics.lab1_gtics_20211.entity;

import javax.persistence.*;

@Entity
@Table(name = "juegos")
public class Juegos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idjuego")
    public int idJuego;

    @Column(name="nombre")
    public String nombreJuego;

    @Column(name="descripcion")
    public String descripcionJuego;

    @Column(name="precio", nullable = false)
    public double precio;

    @Column(name="idplataforma")
    public int idplataforma;



    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String getDescripcionJuego() {
        return descripcionJuego;
    }

    public void setDescripcionJuego(String descripcionJuego) {
        this.descripcionJuego = descripcionJuego;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdplataforma() {
        return idplataforma;
    }

    public void setIdplataforma(int idplataforma) {
        this.idplataforma = idplataforma;
    }


}
