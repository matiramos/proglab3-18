package com.utn.ejercicio3;

import java.util.UUID;

public class Cuenta {

    private UUID uuid;
    private double balance;
    private Titular titular;

    private static final int MAX_OPS = 10;
    private int contadorOperaciones = 0;
    private String operaciones[] = new String[MAX_OPS];


    public Cuenta(double balance, Titular titular) {
        this.uuid = UUID.randomUUID();
        this.balance = balance;
        this.titular = titular;
    }

    public UUID getUuid() {
        return uuid;
    }

    public double getBalance() {
        return balance;
    }

    public Titular getTitular() {
        return titular;
    }

    public String[] getOperaciones() {
        return operaciones;
    }

    public double depositar(double monto) {
        documentarDeposito(monto);
        return this.balance += monto;
    }

    public double extraer(double monto) {
        double tempBalance = this.balance - monto;
        if (tempBalance >= -2000) {
            this.balance -= monto;
            documentarRetiro(monto);
        } else {
            System.out.println("Monto insuficiente");
        }
        return this.balance;
    }

    private void documentarDeposito(double monto) {
        if (this.contadorOperaciones == MAX_OPS) {
            this.contadorOperaciones = 0;
        }
        operaciones[contadorOperaciones] = "El cliente " + titular.getNombre() + ", depositó " + monto;
        this.contadorOperaciones++;
    }

    private void documentarRetiro(double monto) {
        if (this.contadorOperaciones == 10) {
            this.contadorOperaciones = 0;
        }
        operaciones[contadorOperaciones] = "El cliente" + titular.getNombre() + ", retiró " + monto;
        this.contadorOperaciones++;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "uuid=" + uuid +
                ", balance=" + balance +
                ", titular=" + titular +
                '}';
    }
}
