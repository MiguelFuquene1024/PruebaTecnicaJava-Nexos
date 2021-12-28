package com.eci.pruebatecnica.automotiveinventory.entities;

public class User {
    private String nombre;
    private String edad;
    private String cargo;
    private String fechaIngresoCompañia;

    public User() {
    }

    public User(String nombre, String edad, String cargo, String fechaIngresoCompañia) {
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechaIngresoCompañia() {
        return fechaIngresoCompañia;
    }

    public void setFechaIngresoCompañia(String fechaIngresoCompañia) {
        this.fechaIngresoCompañia = fechaIngresoCompañia;
    }
}
