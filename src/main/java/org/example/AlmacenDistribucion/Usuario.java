package org.example.AlmacenDistribucion;

import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Usuario {
    private static final Logger logger = LogManager.getLogger(Usuario.class);
    private String nombreUsuario;
    private String correo;
    private String direccion;

    // Constructor
    public Usuario(String nombreUsuario, String correo, String direccion) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.direccion = direccion;
    }

    // Getters
    public String getNombreUsuario() { return nombreUsuario; }
    public String getCorreo() { return correo; }
    public String getDireccion() { return direccion; }

    // Metodo para crear usuarios
    public static Usuario crearUsuario() {
        Faker faker = new Faker();
        Usuario usuario = new Usuario(faker.name().username(), faker.internet().emailAddress(), faker.address().fullAddress());
        logger.info("Usuario creado: " + usuario.getNombreUsuario());
        return usuario;
    }
}


