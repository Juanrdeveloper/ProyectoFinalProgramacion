package org.example.AlmacenDistribucion;

public class Envio {
    private int id;
    private Pedido pedido;
    private String transportista;
    private String ruta;
    private String estado; // (en tránsito, entregado, etc.)

    // Getters y Setters
    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
}

