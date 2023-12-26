package com.example.controller;

import com.example.model.entity.Estado;
import com.example.service.IEstado;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import jakarta.inject.Inject;

@Controller("/api/v1")
public class EstadoController {

    @Inject
    private IEstado estadoService;
    @Get("estado/{id}")
    public Estado showById(@PathVariable Integer id){
        return estadoService.findById(id);
    }
    @Get("ejemplo")
    public String ejemplo(){
        return "Hell bitch";
    }
}
