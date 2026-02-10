package com.pausiar.APICompleta.models.Entitats;

import jakarta.persistence.*;

@Entity
@Table
public class Arma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private String categoria;
    private int preu;
    private String descripcio;
    private String imatge;

    public Arma() {
    }

    public Arma(String nom, String categoria, int preu, String descripcio, String imatge) {
        this.nom = nom;
        this.categoria = categoria;
        this.preu = preu;
        this.descripcio = descripcio;
        this.imatge = imatge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getImatge() {
        return imatge;
    }

    public void setImatge(String imatge) {
        this.imatge = imatge;
    }
}
