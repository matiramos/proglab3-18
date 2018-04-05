package com.utn.ejercicio4;

public class Cuenta {

    private int id;
    private String nombre;
    private double balance;

    public Cuenta(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getBalance() {
        return balance;
    }

    public double credito(double monto) {
        this.balance = this.balance + monto;
        return this.balance;
    }

    public double debito(double monto) {
        if (this.balance < monto) {
            System.out.print("Monto insuficiente");
        } else {
            this.balance = this.balance - monto;
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }
}
