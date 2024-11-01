package org.example.TiendaElectronica;

public class Transaccion{
    private int id;
    private Cliente cliente;
    private int puntos;
    private String tipo; // "ganancia" o "canje"

    public Transaccion(int id, Cliente cliente, int puntos, String tipo) {
        this.id = id;
        this.cliente = cliente;
        this.puntos = puntos;
        this.tipo = tipo;
    }

    // Getters y Setters
}

