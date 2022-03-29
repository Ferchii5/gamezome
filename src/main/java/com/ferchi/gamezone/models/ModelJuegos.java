package com.ferchi.gamezone.models;

import javax.persistence.*;

@Entity
@Table(name = "juegos")

public class ModelJuegos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int idjuegos;
    String nom_juegos;
    String descripcion;
    String categoria;
    int status;

    public ModelJuegos() {
    }

    public ModelJuegos(int idjuegos, String nom_juegos, String descripcion, String categoria, int status) {
        this.idjuegos = idjuegos;
        this.nom_juegos = nom_juegos;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.status = status;
    }

    public int getIdjuegos() {
        return idjuegos;
    }

    public void setIdjuegos(int idjuegos) {
        this.idjuegos = idjuegos;
    }

    public String getNom_juegos() {
        return nom_juegos;
    }

    public void setNom_juegos(String nom_juegos) {
        this.nom_juegos = nom_juegos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ModelJuegos{" +
                "idjuegos=" + idjuegos +
                ", nom_juegos='" + nom_juegos + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria=" + categoria +
                ", status=" + status +
                '}';
    }
}
