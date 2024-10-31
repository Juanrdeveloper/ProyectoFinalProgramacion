package org.example.TiendaElectronica;

public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadEnStock;

    public Producto(int id, String nombre, String descripcion, double precio, int cantidadEnStock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void actualizarCantidadEnStock(int cantidad) {
        this.cantidadEnStock += cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadEnStock=" + cantidadEnStock +
                '}';
    }
}
