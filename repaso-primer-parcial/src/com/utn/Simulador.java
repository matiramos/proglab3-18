package com.utn;

public class Simulador {
  private Nave aliado;
  private Nave rebelde;

  public Simulador(Nave aliado, Nave rebelde) {
    this.aliado = aliado;
    this.rebelde = rebelde;
  }

  public void simular() {
    int i = 0;
    while (aliado.getSalud() > 0 && rebelde.getSalud() > 0) {
      System.out.println("\n ==== Vuelta numero " + i + " ====");
      int aa = aliado.atacar();
      rebelde.recibirAtaque(aa);
      System.out.println("La nave rebelde recibio un ataque de " + aa + " puntos. Su salud es " + rebelde.getSalud());

      int ar = rebelde.atacar();
      aliado.recibirAtaque(ar);
      System.out.println("La nave aliada recibio un ataque de " + ar + " puntos. Su salud es " + aliado.getSalud() + "\n");

      i++;
    }
    if (aliado.getSalud() > rebelde.getSalud()) {
      System.out.println("Los aliados ganaron la batalla!!");
    } else {
      System.out.println("Los rebeldes ganaron la batalla!!");
    }
  }
}
