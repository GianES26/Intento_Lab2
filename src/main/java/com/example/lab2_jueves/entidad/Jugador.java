package com.example.lab2_jueves.entidad;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idJugador", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 45)
    private String nombre;

    @Column(name = "edad", length = 45)
    private String edad;

    @Column(name = "posicion", length = 45)
    private String posicion;

    @Column(name = "club", length = 45)
    private String club;

    /*
    @Column(name = "sn_idSeleccion")
    private Integer sn_idSeleccion;
     */

    @ManyToOne
    @JoinColumn(name = "sn_idSeleccion")
    private Seleccion seleccion;

}
