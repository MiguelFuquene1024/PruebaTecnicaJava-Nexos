package com.eci.pruebatecnica.automotiveinventory.repository;

import com.eci.pruebatecnica.automotiveinventory.model.entities.Mercancia;
import com.eci.pruebatecnica.automotiveinventory.model.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MercanciaRespository extends JpaRepository<Mercancia,Long> {

}
