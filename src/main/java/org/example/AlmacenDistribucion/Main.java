package org.example.AlmacenDistribucion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Producto> inventario = new ArrayList<>();
    private static List<Pedido> pedidos = new ArrayList<>();
    private static List<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        // Crear algunos usuarios
        usuarios.add(new Usuario("admin", "admin123", "Administrador"));
        usuarios.add(new Usuario("almacenero", "almacen123", "Almacenero"));
        usuarios.add(new Usuario("contador", "conta123", "Contador"));

        Scanner scanner = new Scanner(System.in);
        // Menú principal
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                // Lógica de inicio de sesión (simplificada)
                System.out.print("Nombre de usuario: ");
                String usuarioInput = scanner.next();
                System.out.print("Contraseña: ");
                String contraseñaInput = scanner.next();

                for (Usuario usuario : usuarios) {
                    if (usuario.getNombreDeUsuario().equals(usuarioInput) &&
                            usuario.verificarContraseña(contraseñaInput)) {
                        // Lógica para gestionar según rol
                        System.out.println("Bienvenido, " + usuarioInput);
                        // Aquí puedes agregar más lógica según el rol
                        break;
                    }
                }
            } else if (opcion == 2) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}

