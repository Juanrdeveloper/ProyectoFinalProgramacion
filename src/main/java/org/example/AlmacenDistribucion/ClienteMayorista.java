package org.example.AlmacenDistribucion;

import java.util.ArrayList;
import java.util.List;

public class Proveedor {
    private int id;
    private String nombre;
    private String contacto;
    private List<Producto> productos;

    // Constructor
    public Proveedor(int id, String nombre, String contacto) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
        this.productos = new ArrayList<>();
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    // Métodos para agregar, modificar y eliminar productos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void modificarProducto(int index, Producto producto) {
        if (index >= 0 && index < productos.size()) {
            productos.set(index, producto);
        }
    }

    public void eliminarProducto(int index) {
        if (index >= 0 && index < productos.size()) {
            productos.remove(index);
        }
    }
}


