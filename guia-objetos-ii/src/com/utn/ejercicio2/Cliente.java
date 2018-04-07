package com.utn.ejercicio2;

import java.util.UUID;

public class Cliente {

    private UUID uuid;
    private String nombre;
    private String email;
    private double descuento;

    public Cliente(String nombre, String email, double descuento) {
        this.uuid = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public double getDescuento() {
        return descuento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "uuid=" + uuid +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", descuento=" + descuento +
                '}';
    }
}
