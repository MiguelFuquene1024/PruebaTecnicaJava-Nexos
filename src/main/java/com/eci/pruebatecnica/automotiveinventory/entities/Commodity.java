package com.eci.pruebatecnica.automotiveinventory.entities;

import java.util.Date;

public class Commodity {
    private String nombreProducto;
    private Integer cantidad;
    private Date fechaIngreso;
    private String usuario;

    public Commodity() {
    }

    public Commodity(String nombreProducto, Integer cantidad, Date fechaIngreso, String usuario) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.fechaIngreso = fechaIngreso;
        this.usuario = usuario;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
