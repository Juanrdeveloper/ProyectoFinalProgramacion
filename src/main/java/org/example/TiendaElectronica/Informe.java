package org.example.TiendaElectronica;

import java.util.List;

public class Informe {
    public void generarInformeVentas(List<Venta> ventas) {
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }

    public void generarInformeInventario(List<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}

