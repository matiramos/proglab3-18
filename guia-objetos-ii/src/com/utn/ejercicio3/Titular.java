package com.utn.ejercicio3;

import java.util.UUID;

public class Titular {

    private UUID uuid;
    private String nombre;
    private char genero;

    public Titular(String nombre, char genero) {
        this.uuid = UUID.randomUUID();
        this.nombre = nombre;
        this.genero = genero;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Titular{" +
                "uuid=" + uuid +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                '}';
    }
}
