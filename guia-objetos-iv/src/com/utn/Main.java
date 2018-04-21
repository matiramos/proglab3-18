package com.utn;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {
    Film fims[] = new Film[50];
    fims[0] = new Film(123, 3, Audiencia.G, "Matrix", LocalDate.of(2001, 3, 12));
    fims[1] = new Film(123, 3, Audiencia.G, "Matrix II", LocalDate.of(2002, 3, 21));

    Cliente clientes[] = new Cliente[50];

    VideoStore vd = new VideoStore(fims, clientes);

    vd.agregarCliente("Pedro Rodriguez", "22345234432", "Calle falsa 123");
    vd.agregarCliente("Alvaro Rodriguez", "22345224432", "Calle falsa 223");

    imprimirClientes(vd);
    imprimirFilms(vd);

    System.out.println("\n=== Imprimo resultado de alquiler 1 ===");
    System.out.println(vd.alquilarTitulo("Matrix", "Pedro Rodriguez"));

    System.out.println("\n=== Imprimo resultado de alquiler 2 ===");
    System.out.println(vd.alquilarTitulo("Matrix", "Alvaro Rodriguez"));

    imprimirAlquileres(vd);

    imprimirFilms(vd);

    vd.devolverFilm(2);

    imprimirAlquileres(vd);
    
    imprimirFilms(vd);

  }

  public static void imprimirFilms(VideoStore vd) {
    System.out.println("\n=== Imprimo films ===");
    for (Film film : vd.getFilms()) {
      if (film != null) System.out.println(film);
    }
  }

  public static void imprimirClientes(VideoStore vd) {
    System.out.println("\n=== Imprimo clientes ===");
    for (Cliente cliente : vd.getClientes()) {
      if (cliente != null) System.out.println(cliente);
    }
  }

  public static void imprimirAlquileres(VideoStore vd) {
    System.out.println("\n=== Imprimo alquileres activos ===");
    for (Alquiler alquiler : vd.getAlquileres()) {
      if (alquiler != null) System.out.println(alquiler);
    }
  }
}
