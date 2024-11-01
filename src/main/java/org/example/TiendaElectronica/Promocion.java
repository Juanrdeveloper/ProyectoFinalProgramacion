package org.example.TiendaElectronica;

import java.time.LocalDateTime;

public class Promocion {
    private int id;
    private Producto producto;
    private double descuento;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    public Promocion(int id, Producto producto, double descuento, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        this.id = id;
        this.producto = producto;
        this.descuento = descuento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public boolean estaVigente() {
        LocalDateTime ahora = LocalDateTime.now();
        return (ahora.isAfter(fechaInicio) && ahora.isBefore(fechaFin));
    }

    // Getters y Setters
}

