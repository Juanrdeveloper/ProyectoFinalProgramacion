package org.example.AlmacenDistribucion;

public class ConfiguracionPedido {
    private int nivelBajo;
    // Getters y Setters
    public boolean verificarInventarioBajo(Producto producto) {
        return producto.getCantidadStock() < nivelBajo;
    }
}
