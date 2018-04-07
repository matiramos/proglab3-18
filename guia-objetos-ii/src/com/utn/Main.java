package com.utn;

import com.utn.ejercicio1.Autor;
import com.utn.ejercicio1.Libro;
import com.utn.ejercicio2.Cliente;
import com.utn.ejercicio2.Factura;
import com.utn.ejercicio2.ItemVenta;
import com.utn.ejercicio3.Cuenta;
import com.utn.ejercicio3.Titular;

public class Main {

    public static void main(String[] args) {

        // Ejercicio 1
        System.out.println("\n==== Ejercicio 1 ==== \n");
        Autor jBloch = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        System.out.println(jBloch);

        Autor[] autores = new Autor[2];
        autores[0] = jBloch;

        Libro eJava = new Libro("Effective Java", 500.0, 150, autores);
        System.out.println(eJava);

        eJava.setPrecio(500.0);
        eJava.setStock(eJava.getStock() + 50);

        System.out.println(eJava.getAutor());
        System.out.println(eJava.imprimirMsj());

        // Ejercicio 1h
        System.out.println("\n==== Ejercicio 1h ==== \n");
        Autor jLong = new Autor("Josh", "Long", "josh@email.com", 'M');
        System.out.println(jLong);

        autores[1] = jLong;

        Libro eJavaH = new Libro("Effective Java", 500.0, 150, autores);
        System.out.println(eJavaH);

        System.out.println(eJavaH.imprimirMsj());

        // Ejercicio 2
        System.out.println("\n==== Ejercicio 2 ==== \n");
        Cliente cliente = new Cliente("Pablo", "pablo@email.com", 10);
        ItemVenta itemVenta1 = new ItemVenta("Lapiz", "Lapiz numero 3", 15, 3);
        ItemVenta itemVenta2 = new ItemVenta("Hojas A4", "Hojas A4 x150", 175.50, 2);
        ItemVenta itemVenta3 = new ItemVenta("Carpeta A4", "Carpeta negra A4", 25, 2);

        ItemVenta[] items = new ItemVenta[3];
        items[0] = itemVenta1;
        items[1] = itemVenta2;
        items[2] = itemVenta3;

        Factura factura = new Factura(cliente, items);
        System.out.println(factura);

        // Ejercicio 3
        System.out.println("\n==== Ejercicio 3 ==== \n");
        Titular titular = new Titular("Pablo Perez", 'M');
        Cuenta cuenta = new Cuenta(10000, titular);
        System.out.println(cuenta);

        System.out.println("\nDeposito 150.50, el balance es " + cuenta.depositar(150.50) + "\n");
        System.out.println("Retiro 150, el balance es " + cuenta.extraer(150) + "\n");
        System.out.println("Retiro 11000.50, el balance es " + cuenta.extraer(11000.50) + "\n");
        System.out.println("Deposito 1250.50, el balance es " + cuenta.depositar(1250.50) + "\n");

        System.out.println("\nOperaciones realizadas:");
        for (String ops : cuenta.getOperaciones()) {
            if (ops != null) System.out.println(ops);
        }
    }
}
