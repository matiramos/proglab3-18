package com.utn;

public class
Cliente {

  private String nombre;
  private String telefono;
  private String direccion;

  public Cliente(String nombre, String telefono, String direccion) {
    this.nombre = nombre;
    this.telefono = telefono;
    this.direccion = direccion;
  }

  public String getNombre() {
    return nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  @Override
  public String toString() {
    return "Cliente{" +
            "nombre='" + nombre + '\'' +
            ", telefono='" + telefono + '\'' +
            ", direccion='" + direccion + '\'' +
            '}';
  }
}
