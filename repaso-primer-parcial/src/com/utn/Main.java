package com.utn;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Nave aliados = new Aliado(new Arma(ThreadLocalRandom.current().nextInt(1, 30)), ThreadLocalRandom.current().nextBoolean());
        Nave rebelde = new Rebelde(new Arma(ThreadLocalRandom.current().nextInt(1, 30)), ThreadLocalRandom.current().nextBoolean());

        Simulador simulador = new Simulador(aliados, rebelde);
        simulador.simular();

        System.out.println("\n=== Naves ===");
        System.out.println(aliados);
        System.out.println(rebelde);
    }
}
