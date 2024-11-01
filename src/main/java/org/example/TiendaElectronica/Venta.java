package org.example.TiendaElectronica;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private int idVenta;
    private List<Producto> productosVendidos;
    private double total;
    private String fechaHora;
    private Cliente cliente;

    public Venta(int idVenta, Cliente cliente) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.productosVendidos = new ArrayList<>();
        this.total = 0;
        this.fechaHora = java.time.LocalDateTime.now().toString();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            this.productosVendidos.add(producto);
        }
        this.total += producto.getPrecio() * cantidad;
        cliente.agregarPuntos((int) (producto.getPrecio() * cantidad)); // Ejemplo: 1 punto por cada dólar
    }

    // Otros métodos
}



