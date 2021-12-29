package com.eci.pruebatecnica.automotiveinventory.model.dtos;

import java.util.Date;

public class MercanciaDto {
    private String nombreProducto;
    private Integer cantidad;
    private Date fechaIngreso;
    private String usuario;

    public MercanciaDto() {
    }

    public MercanciaDto(String nombreProducto, Integer cantidad, Date fechaIngreso, String usuario) {
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
