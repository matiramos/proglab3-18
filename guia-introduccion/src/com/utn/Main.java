package com.utn;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static PrintStream salida = System.out;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner menuScanner = new Scanner(System.in);
        int ejercicio = 1;

        while (ejercicio != 0) {
            salida.println("\nIngrese el numero de ejercicio a resolver o 0 para salir: ");
            ejercicio = menuScanner.nextInt();

            switch (ejercicio) {
                case 0:
                    salida.println("\nEjecucion finalizada");
                    break;
                case 1:
                    salida.println("\nEjercicio 1\n===========");
                    haciendoElEjercicio1();
                    break;
                case 2:
                    salida.println("\nEjercicio 2\n===========");
                    haciendoElEjercicio2();
                    break;
                case 3:
                    salida.println("\nEjercicio 3\n===========");
                    haciendoElEjercicio3();
                    break;
                case 4:
                    salida.println("\nEjercicio 4\n===========");
                    haciendoElEjercicio4();
                    break;
                case 5:
                    salida.println("\nEjercicio 5\n===========");
                    haciendoElEjercicio5();
                    break;
                case 6:
                    salida.println("\nEjercicio 6\n===========");
                    haciendoElEjercicio6();
                    break;
                case 7:
                    salida.println("\nEjercicio 7\n===========");
                    haciendoElEjercicio7();
                    break;
                case 8:
                    salida.println("\nEjercicio 8\n===========");
                    haciendoElEjercicio8();
                    break;
                case 9:
                    salida.println("\nEjercicio 9\n===========");
                    haciendoElEjercicio9();
                    break;
                case 10:
                    salida.println("\nEjercicio 10\n===========");
                    haciendoElEjercicio10();
                    break;
                case 11:
                    salida.println("\nEjercicio 11\n===========");
                    haciendoElEjercicio11();
                    break;
                case 12:
                    salida.println("\nEjercicio 12\n===========");
                    haciendoElEjercicio12();
                    break;
                case 13:
                    salida.println("\nEjercicio 13\n===========");
                    haciendoElEjercicio13();
                    break;
                case 14:
                    salida.println("\nEjercicio 14\n===========");
                    haciendoElEjercicio14();
                    break;
                case 15:
                    salida.println("\nEjercicio 15\n===========");
                    haciendoElEjercicio15();
                    break;
                case 16:
                    salida.println("\nEjercicio 16\n===========");
                    haciendoElEjercicio16();
                    break;
                case 17:
                    salida.println("\nEjercicio 17\n===========");
                    haciendoElEjercicio17();
                    break;
                case 18:
                    salida.println("\nEjercicio 18\n===========");
                    haciendoElEjercicio18();
                    break;
                default:
                    salida.println("\nNo es un ejercicio valido!");
                    break;
            }
        }
    }

    private static void haciendoElEjercicio1() {
        int N = 3;
        double A = 25.36;
        char C = 't';

        salida.println(String.format("N: %s A: %s C: %s", N, A, C));
        salida.println(String.format("N+A: %s", N + A));
        salida.println(String.format("N+A: %s", A - N));
        salida.println(String.format("C: %s", Integer.valueOf(C)));
    }

    private static void haciendoElEjercicio2() {
        int X = 10;
        int Y = 20;
        double N = 2.0;
        double M = 120.5;

        salida.println(String.format("X: %s Y: %s N: %s M: %s", X, Y, N, M));
        salida.println(String.format("X*Y: %s", X * Y));
        salida.println(String.format("N+M: %s", N + M));
        salida.println(String.format("M/X: %s", M / X));
    }

    private static void haciendoElEjercicio3() {
        int N = 10;

        salida.println(String.format("N: %s ", N));
        salida.println(String.format("N+77: %s ", N + 77));
        salida.println(String.format("N-3: %s ", N - 3));
        salida.println(String.format("N*2: %s ", N * 2));
    }

    private static void haciendoElEjercicio4() {
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;

        salida.println(String.format("A: %s B: %s C: %s D: %s", A, B, C, D));
        B = C;
        salida.println(String.format("B: %s ", B));
        C = A;
        salida.println(String.format("C: %s ", C));
        A = D;
        salida.println(String.format("A: %s ", A));
        D = B;
        salida.println(String.format("D: %s ", D));
    }

    private static void haciendoElEjercicio5() {
        int A = (int) (Math.random() * 1000);

        String paridad = "par";
        if (A % 2 != 0) {
            paridad = "impar";
        }

        salida.println(String.format("A: %s es un número %s", A, paridad));
    }

    private static void haciendoElEjercicio6() {
        Random random = new Random();
        int B = random.nextInt(20000) - 10000;

        String rta;
        if (B > 0) {
            rta = "positivo";
        } else if (B < 0) {
            rta = "negativo";
        } else {
            rta = "que no se considera ni positivo ni negativo";
        }

        salida.println(String.format("B: %s es un número %s", B, rta));
    }

    private static void haciendoElEjercicio7() {
        Random random = new Random();
        int C = random.nextInt();

        String positivo = (C > 0) ? "positivo" : "negativo";
        String paridad = (C % 2 == 0) ? "par" : "impar";
        String multiplo5 = (C % 5 == 0) ? "multiplo de 5" : "no es multiplo de 5";
        String multiplo10 = (C % 10 == 0) ? "multiplo de 10" : "no es multiplo de 10";

        salida.println(String.format("C: %s, es un numero %s, %s, %s y %s.", C, positivo, paridad, multiplo5, multiplo10));
    }

    private static void haciendoElEjercicio8() {
        scanner.reset();

        salida.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        salida.println(String.format("Buenos dias, %s.", nombre));
    }

    private static void haciendoElEjercicio9() {
        scanner.reset();

        salida.println("Ingrese un numero entero: ");
        int N = scanner.nextInt();

        int NN = N * 2;
        int NNN = N * 3;
        salida.println(String.format("N: %s, N*2: %s, N*3: %s", N, NN, NNN));
    }

    private static void haciendoElEjercicio10() {
        scanner.reset();

        salida.println("Ingrese una temperatura en Farenheit: ");
        int F = scanner.nextInt();
        double C = (F - 32) / 1.8;
        salida.println(String.format("%s °F, son %s °C", F, C));
    }

    private static void haciendoElEjercicio11() {
        scanner.reset();

        salida.println("Ingrese el radio de una circunferencia: ");
        double R = scanner.nextDouble();

        double L = 2 * R * Math.PI;
        double A = Math.pow(R, 2) * Math.PI;
        salida.println(String.format("Su longitud es, %s y su area es %s.", L, A));
    }

    private static void haciendoElEjercicio12() {
        scanner.reset();

        salida.println("Ingrese una velocidad en km/h: ");
        int K = scanner.nextInt();
        double M = K / 3.6;
        salida.println(String.format("%s km/h, son %s m/s", K, M));
    }

    private static void haciendoElEjercicio13() {
        scanner.reset();

        salida.println("Ingrese la longitud del 1er cateto ");
        double l1 = scanner.nextDouble();

        salida.println("Ingrese la longitud del 2do cateto ");
        double l2 = scanner.nextDouble();

        double h = Math.sqrt(Math.pow(l1, 2) + Math.pow(l2, 2));
        salida.print("El valor de la hipotenusa es " + h + ".");
    }

    private static void haciendoElEjercicio14() {
        scanner.reset();

        salida.println("Ingrese el radio de una esfera: ");
        double r = scanner.nextDouble();

        double v = 4 / 3 * Math.pow(r, 3);
        salida.println("El volumen de la esfera es " + v + ".");
    }

    private static void haciendoElEjercicio15() {
        scanner.reset();

        salida.println("Ingrese el 1er lado: ");
        double l1 = scanner.nextDouble();

        salida.println("Ingrese el 2do lado: ");
        double l2 = scanner.nextDouble();

        salida.println("Ingrese el 3er lado: ");
        double l3 = scanner.nextDouble();

        double P = (l1 + l2 + l3) / 2;
        double A = Math.sqrt((P * (P - l1) * (P - l2) * (P - l3)));

        salida.println("El area del triangulo es: " + A + ".");
    }

    private static void haciendoElEjercicio16() {
        scanner.reset();

        salida.println("Ingrese un numero de 3 cifras: ");
        int n = scanner.nextInt();

        String number = String.valueOf(n);
        char[] digits = number.toCharArray();
        salida.println(digits[0] + " " + digits[1] + " " + digits[2]);
    }

    private static void haciendoElEjercicio17() {
        scanner.reset();

        salida.println("Ingrese un numero entero de 5 cifras: ");
        int numero = scanner.nextInt();

        int[] digitos = new int[5];
        int count = 0;

        while (numero > 0) {
            digitos[count] = numero % 10;
            numero = numero / 10;
            count++;
        }

        for (int i = digitos.length - 1; i >= 0; i--) {
            if (digitos[i] % 2 != 0) {
                salida.print(digitos[i]);
            }
        }
    }

    private static void haciendoElEjercicio18() {
        scanner.reset();

        salida.println("Ingrese las horas: ");
        int H = scanner.nextInt();
        salida.println("Ingrese los minutos: ");
        int M = scanner.nextInt();
        salida.println("Ingrese los segundos: ");
        int S = scanner.nextInt();

        boolean formato = false;

        if (H >= 0 && H <= 24) {
            if (M >= 0 && M <= 60) {
                if (S >= 0 && S <= 60) {
                    formato = true;
                }
            }
        }

        if (formato) {
            salida.println(String.format("La hora es: %s:%s:%s", H, M, S));
        } else {
            salida.println("Formato incorrecto.");
        }
    }
}
