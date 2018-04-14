package com.utn.ejercicio1;

public class Cilindro extends Circulo {

    private double altura = 1.0;

    public Cilindro() {
        super();
    }

    public Cilindro(double radio, String color) {
        super(radio, color);
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return ((2 * Math.PI * this.altura) + (2 * super.calcularArea()));
    }

    public double calcularVolumen() {
        return super.calcularArea() * this.altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "subclase de " + super.toString() +
                ", altura='" + altura + '\'' +
                '}';
    }
}
