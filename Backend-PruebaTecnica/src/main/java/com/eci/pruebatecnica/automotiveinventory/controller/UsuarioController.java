package com.eci.pruebatecnica.automotiveinventory.controller;

import com.eci.pruebatecnica.automotiveinventory.exception.MercanciaException;
import com.eci.pruebatecnica.automotiveinventory.model.dtos.MercanciaDto;
import com.eci.pruebatecnica.automotiveinventory.model.dtos.UsuarioDto;
import com.eci.pruebatecnica.automotiveinventory.model.entities.Mercancia;
import com.eci.pruebatecnica.automotiveinventory.model.entities.Usuario;
import com.eci.pruebatecnica.automotiveinventory.service.MercanciaService;
import com.eci.pruebatecnica.automotiveinventory.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    private ResponseEntity<Usuario> registrarUsuario(@RequestBody Usuario usuario) throws MercanciaException {
        Usuario temporal = usuarioService.create(usuario);
        try{
            return ResponseEntity.created(new URI("/api/usuario"+temporal.getId())).body(temporal);
        }catch (Exception e){
            throw new MercanciaException("El nombre "+temporal.getNombre()+" ya existe dentro de la mercancia");

        }
    }
    @PutMapping(value="{id}")
    private ResponseEntity<?> actualizarUsuario(@RequestBody UsuarioDto usuarioDto, @PathVariable Long id){
        usuarioService.update(usuarioDto,id);
        Optional<Usuario> usuario = usuarioService.findById(id);
        return new ResponseEntity<>(usuario, HttpStatus.ACCEPTED);
        //return ResponseEntity.ok().build();
    }

    @GetMapping
    private ResponseEntity<List<Usuario>> listarMercancia(){
        return ResponseEntity.ok(usuarioService.getAllUsuarios());
    }

    @DeleteMapping
    private ResponseEntity<?> eliminarMercancia(@RequestBody Usuario usuario){
        usuarioService.delete(usuario);
        return new ResponseEntity<>(usuario,HttpStatus.ACCEPTED);
        //return ResponseEntity.ok().body(mercancia);
    }
    @GetMapping (value = "{id}")
    private ResponseEntity<Optional<Usuario>> listarUsuariosPorId(@PathVariable("id")Long id){
        return ResponseEntity.ok(usuarioService.findById(id));
    }
}