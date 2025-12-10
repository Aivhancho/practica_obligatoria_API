package com.ivan.practica_obligatoria_api_ivan_herrero.entities;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idHotel")
    private int idHotel;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "categoria")
    private int categoria;
    @Column(name = "piscina")
    private boolean piscina;
    @Column(name = "localidad")
    private String localidad;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Habitacion> habitaciones;


    public Hotel() {}
    public Hotel(int idHotel, String nombre, String descripcion, int categoria,  boolean piscina, String localidad) {
        this.idHotel = idHotel;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.piscina = piscina;
        this.localidad = localidad;
    }

    public void setIdHotel(int idHotel) {this.idHotel = idHotel;}
    public int getIdHotel() {return idHotel;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getNombre() {return nombre;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public String getDescripcion() {return descripcion;}
    public void setCategoria(int categoria) {this.categoria = categoria;}
    public int getCategoria() {return categoria;}
    public void setPiscina(boolean piscina) {this.piscina = piscina;}
    public boolean getPiscina() {return piscina;}
    public void setLocalidad(String localidad) {this.localidad = localidad;}
    public String getLocalidad() {return localidad;}
}
