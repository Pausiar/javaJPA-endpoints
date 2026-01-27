package com.pausiar.APIinicial.model;

import jakarta.persistence.*;

@Entity
@Table
public class Habilitat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private String descripcio;
    private String tecla;
    private String imatge;

    @ManyToOne
    @JoinColumn(name = "personatge_id")
    private Personatge personatge;

    public Habilitat() {
    }

    public Habilitat(String nom, String descripcio, String tecla, String imatge) {
        this.nom = nom;
        this.descripcio = descripcio;
        this.tecla = tecla;
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

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getTecla() {
        return tecla;
    }

    public void setTecla(String tecla) {
        this.tecla = tecla;
    }

    public String getImatge() {
        return imatge;
    }

    public void setImatge(String imatge) {
        this.imatge = imatge;
    }

    public Personatge getPersonatge() {
        return personatge;
    }

    public void setPersonatge(Personatge personatge) {
        this.personatge = personatge;
    }
}
