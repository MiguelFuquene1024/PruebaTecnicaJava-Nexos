package com.eci.pruebatecnica.automotiveinventory.model.entities;

import com.eci.pruebatecnica.automotiveinventory.model.dtos.MercanciaDto;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="mercancia")
public class Mercancia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idMercancia;
    @Column( unique = true )
    private String nombreProducto;
    private Integer cantidad;
    private Date fechaIngreso;
    private String usuario;

    public Mercancia() {
    }

    public Mercancia(long idMercancia, String nombreProducto, Integer cantidad, Date fechaIngreso, String usuario) {
        this.idMercancia = idMercancia;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.fechaIngreso = fechaIngreso;
        this.usuario = usuario;
    }

    public void update(MercanciaDto mercanciaDto){
        this.nombreProducto = mercanciaDto.getNombreProducto();
        this.cantidad=mercanciaDto.getCantidad();
        this.fechaIngreso=mercanciaDto.getFechaIngreso();
        this.usuario=mercanciaDto.getUsuario();
    }

    public long getIdMercancia() {
        return idMercancia;
    }

    public void setIdMercancia(long idMercancia) {
        this.idMercancia = idMercancia;
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
