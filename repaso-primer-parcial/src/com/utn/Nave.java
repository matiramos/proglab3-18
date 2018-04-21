package com.utn;

public abstract class Nave {

  private int salud;
  private Arma arma;

  public Nave(Arma arma) {
    this.salud = 100;
    this.arma = arma;
  }

  public int getSalud() {
    return salud;
  }

  public Arma getArma() {
    return arma;
  }

  public abstract int atacar();

  public void recibirAtaque(int danio) {
    this.salud = this.salud - danio;
  }

  @Override
  public String toString() {
    return  " salud=" + salud +
            ", arma=" + arma;
  }
}
