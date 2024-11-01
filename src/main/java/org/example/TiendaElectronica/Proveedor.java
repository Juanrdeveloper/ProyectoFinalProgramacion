package org.example.TiendaElectronica;

import java.util.ArrayList;
import java.util.List;

public class Proveedor {
    private int id;
    private String nombre;
    private String contacto;
    private List<Producto> productos;

    public Proveedor(int id, String nombre, String contacto) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        this.productos.remove(producto);
    }

    // Getters y Setters
}

