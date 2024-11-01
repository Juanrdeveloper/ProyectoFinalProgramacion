package org.example.TiendaElectronica;

import com.github.javafaker.Faker;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadEnStock=" + cantidadEnStock +
                '}';
    }

    public static Producto[] generarProductos(int cantidad) {
        Faker faker = new Faker();
        Producto[] productos = new Producto[cantidad];
        for (int i = 0; i < cantidad; i++) {
            String nombre = faker.commerce().productName();
            double precio = Double.parseDouble(faker.commerce().price(10.0, 1000.0));
            int cantidadEnStock = faker.number().numberBetween(1, 100);
            productos[i] = new Producto(nombre, precio, cantidadEnStock);
        }
        return productos;
    }
}


