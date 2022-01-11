package com.eci.pruebatecnica.automotiveinventory.repository;

import com.eci.pruebatecnica.automotiveinventory.model.entities.Mercancia;
import com.eci.pruebatecnica.automotiveinventory.model.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MercanciaRepository extends JpaRepository<Mercancia,Long> {
}
