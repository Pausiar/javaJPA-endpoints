package com.pausiar.APIinicial.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table
public class Personatge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private String rol;
    private String descripcio;
    private String imatge;

    @OneToMany(mappedBy = "personatge")
    @JsonIgnore
    private List<Habilitat> habilitats;

    public Personatge() {
    }

    public Personatge(String nom, String rol, String descripcio, String imatge) {
        this.nom = nom;
        this.rol = rol;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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

    public List<Habilitat> getHabilitats() {
        return habilitats;
    }

    public void setHabilitats(List<Habilitat> habilitats) {
        this.habilitats = habilitats;
    }
}
