package com.utn;

public class Arma {

  private int danio;

  public Arma(int danio) {
    this.danio = danio;
  }

  public int getDanio() {
    return danio;
  }

  @Override
  public String toString() {
    return "danio=" + danio;
  }
}
