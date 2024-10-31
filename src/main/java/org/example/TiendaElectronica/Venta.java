package org.example.TiendaElectronica;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private int idVenta;
    private List<Producto> productosVendidos;
    private double total;
    private String fechaHora;

    public Venta(int idVenta, String fechaHora) {
        this.idVenta = idVenta;
        this.productosVendidos = new ArrayList<>();
        this.fechaHora = fechaHora;
        this.total = 0;
    }

    public void agregarProducto(Producto producto) {
        productosVendidos.add(producto);
        total += producto.getPrecio();
    }

    public double calcularTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "idVenta=" + idVenta +
                ", productosVendidos=" + productosVendidos +
                ", total=" + total +
                ", fechaHora='" + fechaHora + '\'' +
                '}';
    }
}

