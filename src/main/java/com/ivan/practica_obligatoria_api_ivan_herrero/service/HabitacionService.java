package com.ivan.practica_obligatoria_api_ivan_herrero.service;

import com.ivan.practica_obligatoria_api_ivan_herrero.entities.Habitacion;
import com.ivan.practica_obligatoria_api_ivan_herrero.entities.Hotel;
import com.ivan.practica_obligatoria_api_ivan_herrero.repository.HabitacionRepository;
import com.ivan.practica_obligatoria_api_ivan_herrero.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HabitacionService {
    private final HabitacionRepository habitacionRepository;
    private final HotelRepository hotelRepository;

    public HabitacionService(HabitacionRepository habitacionRepository, HotelRepository hotelRepository) {
        this.habitacionRepository = habitacionRepository;
        this.hotelRepository = hotelRepository;
    }
    // Buscar habitaciones libres
    public List<Habitacion> buscarHabitacionesLibres(int idHotel, int tamaño, double  precioMin, double precioMax){
        return habitacionRepository.buscarHabitacion(idHotel, tamaño, precioMin, precioMax);
    }
    // Registrar una nueva habitación a un hotel
    public Habitacion registrarHabitacion(int idHotel, Habitacion habitacion){
        Hotel hotel = hotelRepository.findById(idHotel).orElseThrow(() -> new RuntimeException("Hotel no encontrado"));
        habitacion.setHotel(hotel);
        return habitacionRepository.save(habitacion);
    }
    // Eliminar una habitación
    public void eliminarHabitacion(Integer idHabitacion){
        habitacionRepository.deleteById(idHabitacion);
    }
    // Marcar habitación como ocupada
    public Habitacion ocuparHabitacion(Integer idHabitacion){
        Habitacion habitacion = habitacionRepository.findById(idHabitacion).orElseThrow(() -> new RuntimeException("Habitacion no encontrada"));
        habitacion.setOcupada(true);
        return habitacionRepository.save(habitacion);
    }
}
