package org.example.TiendaElectronica;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Generar usuarios
        Usuario[] usuarios = Usuario.generarUsuarios(20);
        for (Usuario usuario : usuarios) {
            LoggerUtil.logUsuarioCreado(usuario);
        }

        // Generar productos
        Producto[] productos = Producto.generarProductos(20);
        for (Producto producto : productos) {
            LoggerUtil.logProductoCreado(producto);
        }

        // Simular una venta y generar factura
        Factura factura = new Factura(usuarios[0], Arrays.copyOf(productos, 3)); // Ejemplo con 3 productos
        factura.generarPDF("factura_cliente_" + usuarios[0].getNombreUsuario() + ".pdf");
    }
}
