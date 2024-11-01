package org.example.AlmacenDistribucion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        List<Producto> productos = new ArrayList<>();

        // Crear 20 usuarios
        for (int i = 0; i < 20; i++) {
            usuarios.add(Usuario.crearUsuario());
        }

        // Crear 20 productos
        for (int i = 0; i < 20; i++) {
            productos.add(Producto.crearProducto());
        }
    }
}


