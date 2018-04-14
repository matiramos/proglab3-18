package com.utn.ejercicio3;

public class Cuadrado extends Rectangulo {

    public Cuadrado() {
        super(1.0, 1.0);
    }

    /**
     * @param color
     * @param lado  inicializo la base y altura, atributos de rectangulo, pasandole
     *              un solo parametro. De esta forma me aseguro que el cuadrado, tenga
     *              la misma longitud en sus lados.
     */
    public Cuadrado(String color, double lado) {
        super(color, lado, lado);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "base=" + base +
                ", altura=" + altura +
                ", color='" + color + '\'' +
                '}';
    }
}
