package com.eci.pruebatecnica.automotiveinventory.service;

import com.eci.pruebatecnica.automotiveinventory.model.dtos.MercanciaDto;
import com.eci.pruebatecnica.automotiveinventory.model.dtos.UsuarioDto;
import com.eci.pruebatecnica.automotiveinventory.model.entities.Mercancia;
import com.eci.pruebatecnica.automotiveinventory.model.entities.Usuario;
import com.eci.pruebatecnica.automotiveinventory.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService  {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario create(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public Usuario update(UsuarioDto usuarioDto, Long id){
        try{
            Optional<Usuario> usuario = usuarioRepository.findById(id);
            Usuario usuario1 = usuario.get();
            usuario1.update(usuarioDto);
            return usuarioRepository.save(usuario1);
        }catch(Exception e){
            return null;
        }
    }

    public List<Usuario> getAllUsuarios(){
        return usuarioRepository.findAll();
    }
    public void delete(Usuario usuario){
        usuarioRepository.delete(usuario);
    }
    public Optional<Usuario> findById(Long id){
        return usuarioRepository.findById(id);
    }
}
