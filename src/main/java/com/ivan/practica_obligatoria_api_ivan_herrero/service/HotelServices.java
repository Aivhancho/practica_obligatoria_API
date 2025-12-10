package com.ivan.practica_obligatoria_api_ivan_herrero.service;

import com.ivan.practica_obligatoria_api_ivan_herrero.entities.Hotel;
import com.ivan.practica_obligatoria_api_ivan_herrero.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServices {
    private final HotelRepository hotelRepository;

    public HotelServices(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
    //buscar hotel por localidad
    public List<Hotel> buscarHotelPorLocalidad(String localidad) {
        return hotelRepository.findByLocalidad(localidad);
    }

    //buscar hotel por categoria
    public List<Hotel> buscarHotelPorCategoria(int categoria) {
        return hotelRepository.findByCategoria(categoria);
    }

    //registrar nuevo hotel
    public Hotel registrarHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}
