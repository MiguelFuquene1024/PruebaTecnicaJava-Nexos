package com.eci.pruebatecnica.automotiveinventory.repository;

import com.eci.pruebatecnica.automotiveinventory.model.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
