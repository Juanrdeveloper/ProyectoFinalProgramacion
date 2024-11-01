package org.example.AlmacenDistribucion;

import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class Producto {
    private static final Logger logger = LogManager.getLogger(Producto.class);
    private String nombreProducto;
    private double precio;
    private int cantidadStock;

    // Constructor
    public Producto(String nombreProducto, double precio, int cantidadStock) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    // Getters
    public String getNombreProducto() { return nombreProducto; }
    public double getPrecio() { return precio; }
    public int getCantidadStock() { return cantidadStock; }

    // Método para crear productos
    public static Producto crearProducto() {
        Faker faker = new Faker();
        Random random = new Random();
        String nombre = faker.commerce().productName();
        double precio = 10 + (100 - 10) * random.nextDouble(); // Precio entre 10 y 100
        int cantidadStock = random.nextInt(100); // Cantidad entre 0 y 99
        Producto producto = new Producto(nombre, precio, cantidadStock);
        logger.info("Producto creado: " + producto.getNombreProducto() + " a $" + producto.getPrecio());
        return producto;
    }
}


