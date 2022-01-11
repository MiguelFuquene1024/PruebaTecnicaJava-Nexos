package com.eci.pruebatecnica.automotiveinventory.model.dtos;

import java.util.Date;

public class UsuarioDto {
    private String nombre;
    private String edad;
    private Date fechaIngresoCompañia;

    public UsuarioDto(String nombre, String edad, Date fechaIngresoCompañia) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaIngresoCompañia = fechaIngresoCompañia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Date getFechaIngresoCompañia() {
        return fechaIngresoCompañia;
    }

    public void setFechaIngresoCompañia(Date fechaIngresoCompañia) {
        this.fechaIngresoCompañia = fechaIngresoCompañia;
    }
}
