package org.example.AlmacenDistribucion;

import java.util.List;

public class Informe {
    public void generarInformeDePedidos(List<Pedido> pedidos) {
        // Lógica para generar informe de pedidos
        for (Pedido pedido : pedidos) {
            System.out.println("Pedido ID: " + pedido.getEstado());
            // Añadir más detalles según sea necesario
        }
    }

    public void generarInformeDeInventario(List<Producto> productos) {
        // Lógica para generar informe de inventario
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() + ", Stock: " + producto.getCantidadEnStock());
        }
    }
}
