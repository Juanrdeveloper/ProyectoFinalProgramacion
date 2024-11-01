package org.example.TiendaElectronica;

import org.apache.log4j.Logger;

public class LoggerUtil {
    private static final Logger logger = Logger.getLogger(LoggerUtil.class);

    public static void logUsuarioCreado(Usuario usuario) {
        logger.info("Usuario creado: " + usuario);
    }

    public static void logProductoCreado(Producto producto) {
        logger.info("Producto creado: " + producto);
    }
}

