package com.utn;

public class Rebelde extends Nave {

  private boolean laserpotenciado;

  public Rebelde(Arma arma, boolean laserpotenciado) {
    super(arma);
    this.laserpotenciado = laserpotenciado;
  }

  @Override
  public int atacar() {
    if (laserpotenciado) {
      return (int)(super.getArma().getDanio() * 1.7);
    }
    return super.getArma().getDanio();
  }

  @Override
  public String toString() {
    return "Rebelde{" +
            "laserpotenciado=" + laserpotenciado +
            super.toString() +
            '}';
  }
}
