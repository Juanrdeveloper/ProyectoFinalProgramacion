package org.example.AlmacenDistribucion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        logger.info("Usuario creado: " + usuario.getNombreUsuario());

        Producto producto = new Producto();
        logger.info("Producto creado: " + producto.getNombre());
    }
}

