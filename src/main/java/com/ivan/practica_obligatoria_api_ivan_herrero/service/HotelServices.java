package com.ivan.practica_obligatoria_api_ivan_herrero.service;

import com.ivan.practica_obligatoria_api_ivan_herrero.entities.Hotel;
import com.ivan.practica_obligatoria_api_ivan_herrero.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HotelServices {
    private final HotelRepository hotelRepository;

    public HotelServices(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public Optional<Hotel> findHotelById(Integer idHotel) {
        return hotelRepository.findById(idHotel);
    }
}
