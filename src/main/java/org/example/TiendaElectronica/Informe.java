package org.example.TiendaElectronica;

import java.util.List;

public class Informe {

    public static void generarInformeProveedores(List<Proveedor> proveedores) {
        System.out.println("=== Informe de Proveedores ===");
        if (proveedores.isEmpty()) {
            System.out.println("No hay proveedores registrados.");
            return;
        }
        for (Proveedor proveedor : proveedores) {
            System.out.println("ID: " + proveedor.getId() +
                    ", Nombre: " + proveedor.getNombre() +
                    ", Contacto: " + proveedor.getContacto() +
                    ", Productos: " + proveedor.getProductos().size());
            for (Producto producto : proveedor.getProductos()) {
                System.out.println("   - Producto ID: " + producto.getId() +
                        ", Nombre: " + producto.getNombre());
            }
        }
    }

    public static void generarInformeClientes(List<Cliente> clientes) {
        System.out.println("=== Informe de Clientes ===");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        for (Cliente cliente : clientes) {
            System.out.println("ID: " + cliente.getId() +
                    ", Nombre: " + cliente.getNombre() +
                    ", Contacto: " + cliente.getContacto() +
                    ", Puntos de Fidelidad: " + cliente.getPuntosFidelidad() +
                    ", Ventas: " + cliente.getVentas().size());
            for (Venta venta : cliente.getVentas()) {
                System.out.println("   - Venta ID: " + venta.getIdVenta() +
                        ", Total: " + venta.calcularTotal());
            }
        }
    }

    public static void generarInformePromociones(List<Promocion> promociones) {
        System.out.println("=== Informe de Promociones ===");
        if (promociones.isEmpty()) {
            System.out.println("No hay promociones registradas.");
            return;
        }
        for (Promocion promocion : promociones) {
            System.out.println("ID: " + promocion.getId() +
                    ", Producto: " + promocion.getProducto().getNombre() +
                    ", Descuento: " + promocion.getDescuento() +
                    "%, Vigente: " + promocion.estaVigente());
        }
    }
}




