package com.utn;

import java.time.LocalDate;

public class Alquiler {

  private static int i = 1;

  private int id;
  private Film film;
  private Cliente cliente;
  private LocalDate prestamo;
  private LocalDate devolucion;

  public Alquiler(Film film, Cliente cliente, LocalDate prestamo) {
    this.id = i++;
    this.film = film;
    this.cliente = cliente;
    this.prestamo = prestamo;
    this.devolucion = prestamo.plusDays(2);
  }

  public int getId() {
    return id;
  }

  public Film getFilm() {
    return film;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public LocalDate getPrestamo() {
    return prestamo;
  }

  public LocalDate getDevolucion() {
    return devolucion;
  }

  @Override
  public String toString() {
    return "Alquiler{" +
            "id=" + id +
            ", film=" + film +
            ", cliente=" + cliente +
            ", prestamo=" + prestamo +
            ", devolucion=" + devolucion +
            '}';
  }
}
