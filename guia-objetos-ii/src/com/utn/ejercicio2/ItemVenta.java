package com.utn.ejercicio2;

import java.util.UUID;

public class ItemVenta {

    private UUID uuid;
    private String nombre;
    private String descripcion;
    private double precioUnitario;
    private int cantidad;

    public ItemVenta(String nombre, String descripcion, double precioUnitario, int cantidad) {
        this.uuid = UUID.randomUUID();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return precioUnitario * cantidad;
    }

    @Override
    public String toString() {
        return "ItemVenta{" +
                "uuid=" + uuid +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", cantidad=" + cantidad +
                '}';
    }
}
