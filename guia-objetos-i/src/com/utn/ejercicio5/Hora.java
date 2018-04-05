package com.utn.ejercicio5;

public class Hora {

    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = (hora >= 0 && hora < 24) ? hora : 0;
        this.minuto = (minuto >= 0 && minuto < 60) ? minuto : 0;
        this.segundo = (segundo >= 0 && segundo < 60) ? segundo : 0;
    }

    private void sumarHora() {
        if (this.hora == 23) {
            this.hora = 0;
        } else {
            this.hora++;
        }
    }

    private void sumarMinuto() {
        if (this.minuto == 59) {
            this.minuto = 0;
            sumarHora();
        } else {
            this.minuto++;
        }
    }

    public Hora sumarSeg() {
        if (this.segundo == 59) {
            this.segundo = 0;
            sumarMinuto();
        } else {
            this.segundo++;
        }
        return this;
    }

    @Override
    public String toString() {
        String hh = String.format("%02d", hora);
        String mm = String.format("%02d", minuto);
        String ss = String.format("%02d", segundo);

        return hh + ":" + mm + ":" + ss;
    }
}
