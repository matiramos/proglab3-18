package com.utn;

import com.utn.ejercicio1.Rectangulo;
import com.utn.ejercicio2.Empleado;
import com.utn.ejercicio3.ItemVenta;
import com.utn.ejercicio4.Cuenta;
import com.utn.ejercicio5.Hora;

public class Main {

    public static void main(String[] args) {

        // Ejercicio 1
        System.out.println("==== Ejercicio 1 ==== \n");
        Rectangulo rectangulo = new Rectangulo(20, 10);
        System.out.println("La altura es: " + rectangulo.getAlto());
        System.out.println("La base es: " + rectangulo.getAncho());

        System.out.println("\nEl area es: " + rectangulo.calcularArea());
        System.out.println("El perimetro es: " + rectangulo.calcularPerimetro());

        rectangulo.setAncho(20.5);
        rectangulo.setAlto(12.5);

        System.out.println("\nEl area es: " + rectangulo.calcularArea());
        System.out.println("El perimetro es: " + rectangulo.calcularPerimetro());

        Rectangulo rectanguloDefault = new Rectangulo();
        System.out.println("\nLa altura del rectangulo default es: " + rectanguloDefault.getAlto());
        System.out.println("La base del rectangulo default es: " + rectanguloDefault.getAncho());

        // Ejercicio 2
        System.out.println("\n==== Ejercicio 2 ==== \n");
        Empleado carlosG = new Empleado(23456345, "Carlos", "Gutierrez", 25000);
        Empleado anaS = new Empleado(34234123, "Ana", "Sanchez", 27500);

        System.out.println(carlosG.getEmpleado());
        System.out.println(anaS.getEmpleado());

        carlosG.aumentarSalario(15);
        System.out.println("\nEl salario anual de " + carlosG.getNombre() + " es, " + carlosG.calcularSalarioAnual());

        // Ejercicio 3
        System.out.println("\n==== Ejercicio 3 ==== \n");
        ItemVenta itemVenta = new ItemVenta(1, "Boligrafo de punta fina", 10, 10.50);
        System.out.println(itemVenta);

        // Ejercicio 4
        System.out.println("\n==== Ejercicio 4 ==== \n");
        Cuenta cuenta = new Cuenta(1, "Carlos Gutierrez", 1500);
        System.out.println("Se realizo un deposito, el balance es de " + cuenta.credito(2500));
        System.out.println("Se realizo una compra, el balance es de " + cuenta.debito(1500));
        System.out.println(", el balance es " + cuenta.debito(30000));
        System.out.println(cuenta);

        // Ejercicio 5
        System.out.println("\n==== Ejercicio 5 ==== \n");
        Hora hora = new Hora(23, 59, 2);
        System.out.println(hora);

        /*
        while (true) {
            hora.sumarSeg();
            System.out.println(hora);
        }
        */

    }
}
