package com.ivan.practica_obligatoria_api_ivan_herrero.repository;

import com.ivan.practica_obligatoria_api_ivan_herrero.entities.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HabitacionRepository extends JpaRepository<Habitacion, Integer> {
    List<Habitacion> buscarHabitacion(int idHotel, int tamano, double precioMin, double precioMax);
}
