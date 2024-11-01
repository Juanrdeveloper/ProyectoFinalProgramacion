package org.example.AlmacenDistribucion;

import java.util.List;

public class Pedido {
    private int idPedido;
    private List<Producto> productosSolicitados;
    private String estado; // (pendiente, enviado, entregado)
    private String fechaHora;

    // Getters y Setters
    public int getIdPedido() { return idPedido; }
    public void setIdPedido(int idPedido) { this.idPedido = idPedido; }
    public List<Producto> getProductosSolicitados() { return productosSolicitados; }
    public void setProductosSolicitados(List<Producto> productosSolicitados) { this.productosSolicitados = productosSolicitados; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getFechaHora() { return fechaHora; }
    public void setFechaHora(String fechaHora) { this.fechaHora = fechaHora; }

    public void agregarProducto(Producto producto) {
        this.productosSolicitados.add(producto);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
}



