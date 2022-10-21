package com.appintegradora.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
    private PersonaRepository repository;

    @GetMapping("/personas")
    public Iterable<Persona> conseguirPersonas() {
        return repository.findAll();
    }
}
