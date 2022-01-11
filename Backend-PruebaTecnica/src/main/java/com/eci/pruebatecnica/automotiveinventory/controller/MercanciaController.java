package com.eci.pruebatecnica.automotiveinventory.controller;

import com.eci.pruebatecnica.automotiveinventory.exception.BadRequestException;
import com.eci.pruebatecnica.automotiveinventory.exception.MercanciaException;
import com.eci.pruebatecnica.automotiveinventory.model.dtos.MercanciaDto;
import com.eci.pruebatecnica.automotiveinventory.model.entities.Mercancia;
import com.eci.pruebatecnica.automotiveinventory.service.MercanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mercancia")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class MercanciaController {

    @Autowired
    private MercanciaService mercanciaService;

    @PostMapping
    private ResponseEntity<?> registrarMercancia(@RequestBody Mercancia mercancia) throws BadRequestException, URISyntaxException {


        Mercancia temporal = mercanciaService.create(mercancia);
        return ResponseEntity.created(new URI("/api/mercancia"+temporal.getIdMercancia())).body(HttpStatus.OK);

            //throw new BadRequestException("Este nombre ya existe");
            //throw new MercanciaException("El nombre "+temporal.getNombreProducto()+" ya existe dentro de la mercancia");

    }
    @PutMapping(value="{id}")
    private ResponseEntity<?> actualizarMercancia(@RequestBody MercanciaDto mercanciaDto, @PathVariable Long id) throws BadRequestException {
        mercanciaService.update(mercanciaDto,id);
        Optional<Mercancia> mercancia = mercanciaService.findById(id);
        return ResponseEntity.ok().body(HttpStatus.OK);
        //return new ResponseEntity<>(HttpStatus.OK);
        //return ResponseEntity.ok().build();
    }

    @GetMapping
    private ResponseEntity<List<Mercancia>> listarMercancia(){
        return ResponseEntity.ok(mercanciaService.getAllMercancia());
    }

    @DeleteMapping
    private ResponseEntity<?> eliminarMercancia(@RequestBody Mercancia mercancia){
        mercanciaService.delete(mercancia);
        //return new ResponseEntity<>(HttpStatus.OK);
        return ResponseEntity.ok().body(HttpStatus.OK);
    }
    @GetMapping (value = "{id}")
    private ResponseEntity<Optional<Mercancia>> listarMercanciaPorId(@PathVariable("id")Long id) throws BadRequestException {
        return ResponseEntity.ok(mercanciaService.findById(id));
    }
}
