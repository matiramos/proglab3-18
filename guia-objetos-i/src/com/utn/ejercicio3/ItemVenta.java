package com.utn.ejercicio3;

public class ItemVenta {

    private int id;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;
    private double precioTotal;

    public ItemVenta(int id, String descripcion, int cantidad, double precioUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioTotal = precioUnitario * cantidad;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    @Override
    public String toString() {
        return "ItemVenta{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", pUnitario=" + precioUnitario +
                ", pTotal=" + precioTotal +
                '}';
    }
}
