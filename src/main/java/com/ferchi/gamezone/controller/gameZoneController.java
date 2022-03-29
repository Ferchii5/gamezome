package com.ferchi.gamezone.controller;


import com.ferchi.gamezone.models.ModelJuegos;
import com.ferchi.gamezone.models.ModelSuscripcion;
import com.ferchi.gamezone.repository.RepositoryJuegos;
import com.ferchi.gamezone.repository.RepositorySuscripciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class gameZoneController {

    @Autowired
    RepositoryJuegos repositoryJuegos;

    @Autowired
    RepositorySuscripciones repositorySuscripciones;

    @GetMapping("/")
    public String movilzone(){
        return "Welcome to Gamezone";
    }

    @GetMapping("/juegos")
    public List<ModelJuegos> verjuegos(){
        return repositoryJuegos.findAll();
    }

    @GetMapping("/suscripciones")
    public List<ModelSuscripcion> verSuscripciones(){
        return repositorySuscripciones.findAll();
    }


}
