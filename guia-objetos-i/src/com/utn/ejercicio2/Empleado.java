package com.utn.ejercicio2;

public class Empleado {

    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(int dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularSalarioAnual() {
        return this.salario * 12;
    }

    public void aumentarSalario(double porcentaje) {
        this.salario = this.salario + (this.salario * (porcentaje / 100));
    }

    public String getEmpleado() {
        return "Empleado[dni=" + this.dni + " nombre=" + this.nombre + " apellido=" + this.apellido + " salario=" + this.salario + "]";
    }
}
