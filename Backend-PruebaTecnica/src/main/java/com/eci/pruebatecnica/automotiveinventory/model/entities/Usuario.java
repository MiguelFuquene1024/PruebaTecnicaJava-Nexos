package com.eci.pruebatecnica.automotiveinventory.model.entities;


import com.eci.pruebatecnica.automotiveinventory.model.dtos.UsuarioDto;
import com.eci.pruebatecnica.automotiveinventory.repository.UsuarioRepository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String edad;
    private Date fechaIngresoCompañia;
    @ElementCollection
    private List<RoleEnum> cargos;
    public Usuario() {
    }

    public Usuario(UsuarioDto usuarioDto){
        this.nombre = usuarioDto.getNombre();
        this.edad = usuarioDto.getEdad();
        this.fechaIngresoCompañia = usuarioDto.getFechaIngresoCompañia();
        this.cargos = new ArrayList<>( Collections.singleton( RoleEnum.USER ) );;
    }
    public Usuario(String nombre, String edad, Date fechaIngresoCompañia) {
        this.nombre = nombre;
        this.edad = edad;
        this.cargos = new ArrayList<>( Collections.singleton( RoleEnum.USER ) );
        this.fechaIngresoCompañia = fechaIngresoCompañia;

    }

    public void update(UsuarioDto usuarioDto){
        this.nombre = usuarioDto.getNombre();
        this.edad=usuarioDto.getEdad();
        this.fechaIngresoCompañia=usuarioDto.getFechaIngresoCompañia();
        this.cargos=new ArrayList<>( Collections.singleton( RoleEnum.USER ) );;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<RoleEnum> getCargos() {
        return cargos;
    }

    public void setCargos(List<RoleEnum> cargos) {
        this.cargos = cargos;
    }
}
