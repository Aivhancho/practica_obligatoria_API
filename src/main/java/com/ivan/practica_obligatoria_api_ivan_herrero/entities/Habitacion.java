package com.ivan.practica_obligatoria_api_ivan_herrero.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Habitacion")
public class Habitacion {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idhabitacion")
    private int idhabitacion;

    @Column(name = "tamaño")
    private int tamaño;

    @Column(name = "precio")
    private double precio;

    @Column(name = "desayuno")
    private boolean desayuno;

    @Column(name = "ocupada")
    private boolean ocupada;

    @ManyToOne
    @JoinColumn(name = "idHotel", referencedColumnName = "idHotel")
    @JsonManagedReference
    private Hotel hotel;

    public Habitacion() {}

    public Habitacion(int idhabitacion, int tamaño, double precio, boolean desayuno, boolean ocupada) {
        this.idhabitacion = idhabitacion;
        this.tamaño = tamaño;
        this.precio = precio;
        this.desayuno = desayuno;
        this.ocupada = ocupada;
        this.hotel = new Hotel();
    }
    public int getIdhabitacion() {return idhabitacion;}
    public void setIdhabitacion(int idhabitacion) {this.idhabitacion = idhabitacion;}

    public int getTamaño(){return tamaño;}
    public void setTamaño(int tamaño) {this.tamaño = tamaño;}

    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}

    public boolean isDesayuno() {return desayuno;}
    public void setDesayuno(boolean desayuno) {this.desayuno = desayuno;}

    public boolean isOcupada() {return ocupada;}
    public void setOcupado(boolean ocupada) {this.ocupada = ocupada;}

    public Hotel getHotel() {return hotel;}
    public void setHotel(Hotel hotel) {this.hotel = hotel;}
}
