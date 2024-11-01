package org.example.TiendaElectronica;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nombre;
    private String contacto;
    private int puntosFidelidad;
    private List<Venta> ventas;

    public Cliente(int id, String nombre, String contacto) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
        this.puntosFidelidad = 0;
        this.ventas = new ArrayList<>();
    }

    public void agregarPuntos(int puntos) {
        this.puntosFidelidad += puntos;
    }

    public void canjearPuntos(int puntos) {
        if (puntos <= this.puntosFidelidad) {
            this.puntosFidelidad -= puntos;
        } else {
            // Manejo de error: no hay suficientes puntos
        }
    }

    // Getters y Setters
}

