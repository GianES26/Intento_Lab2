package com.example.lab2_jueves.entidad;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seleccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSeleccion", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 45)
    private String nombre;

    @Column(name = "tecnico", length = 45)
    private String tecnico;

    /*@Column(name = "estadios_idEstadios", length = 45)
    private String estadios_idEstadios;*/

    @ManyToOne
    @JoinColumn(name = "estadios_idEstadios")
    private Estadio estadio;

}
