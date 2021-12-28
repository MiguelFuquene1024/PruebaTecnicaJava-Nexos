package com.eci.pruebatecnica.automotiveinventory.model.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="mercancia")
public class Mercancia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombreProducto;
    private Integer cantidad;
    private Date fechaIngreso;
    private String usuario;

    public Mercancia() {
    }

    public Mercancia(long id, String nombreProducto, Integer cantidad, Date fechaIngreso, String usuario) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.fechaIngreso = fechaIngreso;
        this.usuario = usuario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
