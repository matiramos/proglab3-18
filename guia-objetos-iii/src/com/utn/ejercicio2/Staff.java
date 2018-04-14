package com.utn.ejercicio2;

public class Staff extends Persona {

    private double salario;
    private char turno;

    public Staff(int dni, String nombre, String apellido, String email, String direccion, double salario, char turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public double salarioAnual() {
        return this.salario * 12;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salario=" + salario +
                ", turno=" + turno +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
