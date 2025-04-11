package com.example.lab2_jueves.controlador;

import com.example.lab2_jueves.entidad.Jugador;
import com.example.lab2_jueves.repositorio.EstadioRepository;
import com.example.lab2_jueves.repositorio.JugadorRepository;
import com.example.lab2_jueves.repositorio.SeleccionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class JugadorController {

    final JugadorRepository jugadorRepository;
    final EstadioRepository estadioRepository;
    final SeleccionRepository seleccionRepository;

    public JugadorController(JugadorRepository jugadorRepository, EstadioRepository estadioRepository, SeleccionRepository seleccionRepository) {
        this.jugadorRepository = jugadorRepository;
        this.estadioRepository = estadioRepository;
        this.seleccionRepository = seleccionRepository;
    }

    @GetMapping(value = "/listaJugador")
    public String listaJugador(Model model) {

        List<Jugador> listaJugador = jugadorRepository.findAll();
        model.addAttribute("listaJugador", listaJugador);

        return "jugador/list";
    }


}
