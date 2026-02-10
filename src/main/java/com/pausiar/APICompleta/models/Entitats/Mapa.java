package com.pausiar.APICompleta.models.Entitats;

import jakarta.persistence.*;

@Entity
@Table
public class Mapa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private String descripcio;
    private String imatge;

    @ManyToOne
    @JoinColumn(name = "modo_juego_id")
    private ModoJuego modoJuego;

    public Mapa() {
    }

    public Mapa(String nom, String descripcio, String imatge) {
        this.nom = nom;
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

    public ModoJuego getModoJuego() {
        return modoJuego;
    }

    public void setModoJuego(ModoJuego modoJuego) {
        this.modoJuego = modoJuego;
    }
}
