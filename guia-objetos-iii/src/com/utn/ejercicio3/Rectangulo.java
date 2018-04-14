package com.utn.ejercicio3;

public class Rectangulo extends Figura {

    protected double base;
    protected double altura;

    public Rectangulo() {
        this.base = 1.0;
        this.base = 2.0;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return (this.base * this.altura);
    }

    @Override
    public double calcularPerimetro() {
        return (2 * (this.base + this.altura));
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", color='" + color + '\'' +
                '}';
    }
}
