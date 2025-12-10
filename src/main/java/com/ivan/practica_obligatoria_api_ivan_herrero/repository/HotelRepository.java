package com.ivan.practica_obligatoria_api_ivan_herrero.repository;

import com.ivan.practica_obligatoria_api_ivan_herrero.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HotelRepository extends JpaRepository<Hotel, Integer> { }
