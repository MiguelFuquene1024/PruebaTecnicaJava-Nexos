package com.eci.pruebatecnica.automotiveinventory.controller;

import com.eci.pruebatecnica.automotiveinventory.model.dtos.MercanciaDto;
import com.eci.pruebatecnica.automotiveinventory.model.entities.Mercancia;
import com.eci.pruebatecnica.automotiveinventory.service.MercanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mercancia")
public class MercanciaController {
    @Autowired
    private MercanciaService mercanciaService;

    @PostMapping
    private ResponseEntity<Mercancia> registrarMercancia(@RequestBody Mercancia mercancia){
        Mercancia temporal = mercanciaService.create(mercancia);
        try{
            return ResponseEntity.created(new URI("/api/mercancia"+temporal.getId())).body(temporal);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @PutMapping(value="{id}")
    private ResponseEntity<Mercancia> actualizarMercancia(@RequestBody MercanciaDto mercanciaDto, @PathVariable Long id){
        mercanciaService.update(mercanciaDto,id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    private ResponseEntity<List<Mercancia>> listarMercancia(){
        return ResponseEntity.ok(mercanciaService.getAllMercancia());
    }

    @DeleteMapping
    private ResponseEntity<Void> eliminarMercancia(@RequestBody Mercancia mercancia){
        mercanciaService.delete(mercancia);
        return ResponseEntity.ok().build();
    }
    @GetMapping (value = "{id}")
    private ResponseEntity<Optional<Mercancia>> listarMercanciaPorId(@PathVariable("id")Long id){
        return ResponseEntity.ok(mercanciaService.findById(id));
    }
}
