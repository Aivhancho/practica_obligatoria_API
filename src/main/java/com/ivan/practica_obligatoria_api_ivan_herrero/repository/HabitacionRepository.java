package com.ivan.practica_obligatoria_api_ivan_herrero.repository;

import com.ivan.practica_obligatoria_api_ivan_herrero.entities.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HabitacionRepository extends JpaRepository<Habitacion, Integer> {
    @Query("SELECT h FROM Habitacion h WHERE h.idhabitacion = :idhabitacion")
    List<Habitacion> findHabitacionById(Integer idhabitacion);
}
