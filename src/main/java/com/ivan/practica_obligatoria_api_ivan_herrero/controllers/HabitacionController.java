package com.ivan.practica_obligatoria_api_ivan_herrero.controllers;

import com.ivan.practica_obligatoria_api_ivan_herrero.entities.Habitacion;
import com.ivan.practica_obligatoria_api_ivan_herrero.entities.Hotel;
import com.ivan.practica_obligatoria_api_ivan_herrero.service.HabitacionService;

import com.ivan.practica_obligatoria_api_ivan_herrero.service.HotelServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/habitaciones")
public class HabitacionController {
    private final HabitacionService habitacionService;

    public HabitacionController(HabitacionService habitacionService) {
        this.habitacionService = habitacionService;
    }

    @GetMapping("/Libres")
    public List<Habitacion> buscarHabitacionLibre(
            @RequestParam int idHotel,
            @RequestParam int tamaño,
            @RequestParam double precioMin,
            @RequestParam double precioMax){
        return habitacionService.buscarHabitacionesLibres(idHotel, tamaño, precioMin, precioMax);
    }

    @PostMapping("/{idHotel}")
    public Habitacion registrarHabitacion(@PathVariable int idHotel, @RequestBody Habitacion habitacion) {
       return  habitacionService.registrarHabitacion(idHotel, habitacion);
    }

    @DeleteMapping("/{idHabitacion}")
    public void eliminarHabitacion(@PathVariable int idHabitacion) {
        habitacionService.eliminarHabitacion(idHabitacion);
    }

    @PutMapping("/{idHabitacion}/ocupada")
    public Habitacion ocuparHabitacion(@PathVariable int idHabitacion) {
        return habitacionService.ocuparHabitacion(idHabitacion);
    }
}
