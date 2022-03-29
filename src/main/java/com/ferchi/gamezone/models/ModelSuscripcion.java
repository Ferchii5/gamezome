package com.ferchi.gamezone.models;

import javax.persistence.*;

@Entity
@Table(name = "suscripciones")
public class ModelSuscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id_suscrip;
    int usuarios_id_us;
    String nombre;
    String apellido;
    int juegos_idjuegos;
    String nom_juegos;
    int status;

    public ModelSuscripcion() {
    }

    public ModelSuscripcion(int id_suscrip, int usuarios_id_us, String nombre, String apellido, int juegos_idjuegos, String nom_juegos, int status) {
        this.id_suscrip = id_suscrip;
        this.usuarios_id_us = usuarios_id_us;
        this.nombre = nombre;
        this.apellido = apellido;
        this.juegos_idjuegos = juegos_idjuegos;
        this.nom_juegos = nom_juegos;
        this.status = status;
    }

    public int getId_suscrip() {
        return id_suscrip;
    }

    public void setId_suscrip(int id_suscrip) {
        this.id_suscrip = id_suscrip;
    }

    public int getUsuarios_id_us() {
        return usuarios_id_us;
    }

    public void setUsuarios_id_us(int usuarios_id_us) {
        this.usuarios_id_us = usuarios_id_us;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getJuegos_idjuegos() {
        return juegos_idjuegos;
    }

    public void setJuegos_idjuegos(int juegos_idjuegos) {
        this.juegos_idjuegos = juegos_idjuegos;
    }

    public String getNom_juegos() {
        return nom_juegos;
    }

    public void setNom_juegos(String nom_juegos) {
        this.nom_juegos = nom_juegos;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ModelSuscripcion{" +
                "id_suscrip=" + id_suscrip +
                ", usuarios_id_us=" + usuarios_id_us +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", juegos_idjuegos=" + juegos_idjuegos +
                ", nom_juegos='" + nom_juegos + '\'' +
                ", status=" + status +
                '}';
    }
}
