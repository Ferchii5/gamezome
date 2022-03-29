package com.ferchi.gamezone.models;

import javax.persistence.*;

@Entity
@Table(name = "juegoszone")
public class ModelJuegosZone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    String nombre;
    String descripcion;
    String categoria;

    public ModelJuegosZone() {
    }

    public ModelJuegosZone(int id, String nombre, String descripcion, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "modelJuegosZone{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
