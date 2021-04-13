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


}
