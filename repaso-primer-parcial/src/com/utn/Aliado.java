package com.utn;

public class Aliado extends Nave {

  private boolean canionprotones;

  public Aliado(Arma arma, boolean canionprotones) {
    super(arma);
    this.canionprotones = canionprotones;
  }

  @Override
  public int atacar() {
    if (canionprotones) {
      return (int) (super.getArma().getDanio() * 1.5);
    }
    return super.getArma().getDanio();
  }

  @Override
  public String toString() {
    return "Aliado{" +
            "canionprotones=" + canionprotones +
            super.toString() +
            '}';
  }
}
