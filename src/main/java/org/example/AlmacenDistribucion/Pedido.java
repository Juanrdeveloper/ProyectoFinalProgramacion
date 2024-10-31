package org.example.AlmacenDistribucion;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int idDePedido;
    private List<Producto> productosSolicitados;
    private String estado; // Puede ser "pendiente", "enviado", "entregado"
    private String fechaYHora;

    // Constructor
    public Pedido(int idDePedido, String fechaYHora) {
        this.idDePedido = idDePedido;
        this.productosSolicitados = new ArrayList<>();
        this.estado = "pendiente";
        this.fechaYHora = fechaYHora;
    }

    // Métodos
    public void agregarProducto(Producto producto) {
        this.productosSolicitados.add(producto);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public List<Producto> getProductosSolicitados() {
        return productosSolicitados;
    }

    public String getEstado() {
        return estado;
    }
}

