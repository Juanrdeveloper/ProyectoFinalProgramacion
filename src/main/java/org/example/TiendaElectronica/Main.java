package org.example.TiendaElectronica;

package org.example.TiendaElectronica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private static List<Producto> inventario = new ArrayList<>();
    private static List<Venta> ventas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Crear algunos productos de ejemplo
        inventario.add(new Producto(1, "Televisor", "Televisor 4K", 499.99, 10));
        inventario.add(new Producto(2, "Laptop", "Laptop Gamer", 899.99, 5));

        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    realizarVenta();
                    break;
                case 3:
                    generarInformes();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("=== Menú ===");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Realizar Venta");
        System.out.println("3. Generar Informes");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción: ");
    }

    private static void agregarProducto() {
        System.out.print("Ingrese el ID del producto: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la descripción del producto: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la cantidad en stock: ");
        int cantidad = scanner.nextInt();

        inventario.add(new Producto(id, nombre, descripcion, precio, cantidad));
        System.out.println("Producto agregado exitosamente.");
    }

    private static void realizarVenta() {
        System.out.print("Ingrese el ID de la venta: ");
        int idVenta = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese la fecha y hora de la venta: ");
        String fechaHora = scanner.nextLine();

        Venta venta = new Venta(idVenta, fechaHora);
        while (true) {
            System.out.print("Ingrese el ID del producto a vender (0 para terminar): ");
            int idProducto = scanner.nextInt();
            if (idProducto == 0) break;

            for (Producto producto : inventario) {
                if (producto.getId() == idProducto && producto.getCantidadEnStock() > 0) {
                    venta.agregarProducto(producto);
                    producto.actualizarCantidadEnStock(-1); // Disminuir stock
                    System.out.println("Producto agregado a la venta.");
                    break;
                } else {
                    System.out.println("Producto no disponible o no existe.");
                }
            }
        }

        ventas.add(venta);
        System.out.println("Venta realizada. Total: " + venta.calcularTotal());
    }

    private static void generarInformes() {
        Informe informe = new Informe();
        System.out.println("--- Informe de Ventas ---");
        informe.generarInformeVentas(ventas);
        System.out.println("--- Informe de Inventario ---");
        informe.generarInformeInventario(inventario);
    }
}
