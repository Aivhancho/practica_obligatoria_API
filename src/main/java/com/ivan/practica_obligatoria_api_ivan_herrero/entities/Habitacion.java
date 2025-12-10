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
    private int tamano;

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
}
