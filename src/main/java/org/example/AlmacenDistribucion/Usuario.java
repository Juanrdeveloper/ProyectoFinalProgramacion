package org.example.AlmacenDistribucion;

public class Usuario {
    private String nombreDeUsuario;
    private String contraseña;
    private String rol; // Puede ser "Administrador", "Almacenero", "Contador"

    // Constructor
    public Usuario(String nombreDeUsuario, String contraseña, String rol) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    // Getters y Setters
    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public String getRol() {
        return rol;
    }

    public boolean verificarContraseña(String contraseña) {
        return this.contraseña.equals(contraseña);
    }
}
