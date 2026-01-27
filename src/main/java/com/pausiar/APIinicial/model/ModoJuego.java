package com.pausiar.APIinicial.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table
public class ModoJuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private String descripcio;

    @OneToMany(mappedBy = "modoJuego")
    @JsonIgnore
    private List<Mapa> mapes;

    public ModoJuego() {
    }

    public ModoJuego(String nom, String descripcio) {
        this.nom = nom;
        this.descripcio = descripcio;
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

    public List<Mapa> getMapes() {
        return mapes;
    }

    public void setMapes(List<Mapa> mapes) {
        this.mapes = mapes;
    }
}

