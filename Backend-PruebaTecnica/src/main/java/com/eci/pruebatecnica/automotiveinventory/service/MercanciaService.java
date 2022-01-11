package com.eci.pruebatecnica.automotiveinventory.service;

import com.eci.pruebatecnica.automotiveinventory.exception.BadRequestException;
import com.eci.pruebatecnica.automotiveinventory.model.dtos.MercanciaDto;
import com.eci.pruebatecnica.automotiveinventory.model.entities.Mercancia;
import com.eci.pruebatecnica.automotiveinventory.repository.MercanciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class MercanciaService {
    @Autowired
    private MercanciaRepository mercanciaRespository;

    public Mercancia create(Mercancia mercancia) throws BadRequestException {
        Date in = new Date();
        LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
        Date now = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
        //System.out.println(now+"Hora de hoy");
        //System.out.println(mercancia.getFechaIngreso()+"Hora del producto");
        if(mercancia.getFechaIngreso().after(now)){
            throw new BadRequestException("La fecha del producto debe ser una fecha pasada o igual a la de ahora");
        }
        else{
            try{
                return mercanciaRespository.save(mercancia);
            }catch (Exception e) {
                throw new BadRequestException("Este nombre ya existe");
            }
        }




    }
        /*else{
            throw new BadRequestException("La fecha del producto debe ser una fecha pasada o igual a la de ahora");
        }*/


    public Mercancia update(MercanciaDto mercanciaDto,Long id) throws BadRequestException {
            Optional<Mercancia> mercancia = mercanciaRespository.findById(id);
            if(mercancia.isPresent()){
                Mercancia mercancia1 = mercancia.get();
                Date in = new Date();
                LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
                Date now = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
                if(mercanciaDto.getFechaIngreso().after(now)){
                    throw new BadRequestException("La fecha del producto debe ser una fecha pasada o igual a la de ahora");
                }
                else{
                    try{
                        mercancia1.update(mercanciaDto);
                        return mercanciaRespository.save(mercancia1);
                    }catch (Exception e) {
                        throw new BadRequestException("Este nombre ya existe");
                    }
                }
            }else{
            throw new BadRequestException("No existe mercancia con este nombre de producto");
            }


    }

    public List<Mercancia> getAllMercancia(){
        return mercanciaRespository.findAll();
    }
    public void delete(Mercancia mercancia){
        mercanciaRespository.delete(mercancia);
    }
    public Optional<Mercancia> findById(Long id) throws BadRequestException {
        try{
            return mercanciaRespository.findById(id);
        }catch(Exception e){
            throw new BadRequestException("No existe Mercancia con este id");
        }

    }
}
