package com.utn.ejercicio3;

public class Circulo extends Figura {

    private double radio;

    public Circulo() {
        this.radio = 1.0;
    }

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return (Math.PI * Math.pow(this.radio, 2));
    }

    @Override
    public double calcularPerimetro() {
        return (2 * Math.PI * this.radio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
