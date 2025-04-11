package com.example.lab2_jueves.repositorio;

import com.example.lab2_jueves.entidad.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JugadorRepository extends JpaRepository<Jugador, Integer> {
}
