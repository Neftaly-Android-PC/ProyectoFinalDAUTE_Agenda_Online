package com.example.agendaonline.Objetos;

import java.util.Date;

public class Dto_notas {
  String correo_usario;
  String descripcion;
  int estado;
  Date fecha_hora_actual;
  Date fecha_nota;
  String id_nota;
  String titulo;

  public String getCorreo_usario() {
    return correo_usario;
  }

  public void setCorreo_usario(String correo_usario) {
    this.correo_usario = correo_usario;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

  public Date getFecha_hora_actual() {
    return fecha_hora_actual;
  }

  public void setFecha_hora_actual(Date fecha_hora_actual) {
    this.fecha_hora_actual = fecha_hora_actual;
  }

  public Date getFecha_nota() {
    return fecha_nota;
  }

  public void setFecha_nota(Date fecha_nota) {
    this.fecha_nota = fecha_nota;
  }

  public String getId_nota() {
    return id_nota;
  }

  public void setId_nota(String id_nota) {
    this.id_nota = id_nota;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  @Override
  public String toString(){ return descripcion;}


}
