package com.eci.pruebatecnica.automotiveinventory.service;

import com.eci.pruebatecnica.automotiveinventory.model.entities.Mercancia;
import com.eci.pruebatecnica.automotiveinventory.repository.MercanciaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MercanciaService {
    @Autowired
    private MercanciaRespository mercanciaRespository;

    public Mercancia create(Mercancia mercancia){
        return mercanciaRespository.save(mercancia);
    }
    public List<Mercancia> getAllMercancia(){
        return mercanciaRespository.findAll();
    }
    public void delete(Mercancia mercancia){
        mercanciaRespository.delete(mercancia);
    }
    public Optional<Mercancia> findById(Long id){
        return mercanciaRespository.findById(id);    }
}
