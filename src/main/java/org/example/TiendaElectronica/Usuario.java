package org.example.TiendaElectronica;

import com.github.javafaker.Faker;

public class Usuario {
    private String nombreUsuario;
    private String correo;
    private String direccion;

    public Usuario(String nombreUsuario, String correo, String direccion) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public static Usuario[] generarUsuarios(int cantidad) {
        Faker faker = new Faker();
        Usuario[] usuarios = new Usuario[cantidad];
        for (int i = 0; i < cantidad; i++) {
            usuarios[i] = new Usuario(faker.name().username(),
                    faker.internet().emailAddress(),
                    faker.address().fullAddress());
        }
        return usuarios;
    }
}


