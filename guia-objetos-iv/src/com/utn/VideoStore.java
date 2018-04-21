package com.utn;

import java.time.LocalDate;

public class VideoStore {

  private Film[] films;
  private Cliente[] clientes;
  private Alquiler[] alquileres;

  public Film[] getFilms() {
    return films;
  }

  public Cliente[] getClientes() {
    return clientes;
  }

  public Alquiler[] getAlquileres() {
    return alquileres;
  }

  public VideoStore(Film[] films, Cliente[] clientes) {
    this.films = films;
    this.clientes = clientes;
    this.alquileres = new Alquiler[50];
  }

  public Film buscarFilm(String titulo) {
    for (Film film : films) {
      if (film != null && film.getTitulo().equals(titulo)) {
        return film;
      }
    }
    return null;
  }

  public Cliente buscarCliente(String nombre) {
    for (Cliente cliente : clientes) {
      if (cliente != null && cliente.getNombre().equals(nombre)) {
        return cliente;
      }
    }
      return null;
  }

  public Alquiler buscarAlquiler(int id) {
    for (Alquiler alquiler : alquileres) {
      if (alquiler != null && alquiler.getId() == id) {
        return alquiler;
      }
    }
    return null;
  }

  public void eliminarAlquiler(int id) {
    for (int i = 0; i < alquileres.length ; i++) {
      if (alquileres[i] != null && alquileres[i].getId() == id) {
        alquileres[i] = null;
        break;
      }
    }
  }

  public String agregarCliente(String nombre, String telefono, String direccion) {
    Cliente cliente = new Cliente(nombre, telefono, direccion);
    for (int i = 0; i < clientes.length ; i++) {
      if (clientes[i] == null) {
        clientes[i] = cliente;
        break;
      }
    }
    return cliente.toString();
  }

  public Alquiler alquilarTitulo(String titulo, String nombreCliente) {
    Film film = buscarFilm(titulo);
    Cliente cliente = buscarCliente(nombreCliente);
    if (film != null && cliente != null) {
      film.setStock(film.getStock() - 1);
      Alquiler alquiler = new Alquiler(film, cliente, LocalDate.now());

      for (int i = 0; i < alquileres.length ; i++) {
        if (alquileres[i] == null) {
          alquileres[i] = alquiler;
          break;
        }
      }
      return alquiler;
    }
    return null;
  }

  public void devolverFilm(int alquilerId) {
    Alquiler alquiler = buscarAlquiler(alquilerId);
    if (alquiler != null) {
      String filmNombre = alquiler.getFilm().getTitulo();
      Film film = buscarFilm(filmNombre);
      film.setStock(film.getStock() + 1);
      eliminarAlquiler(alquilerId);
    }
  }
}
