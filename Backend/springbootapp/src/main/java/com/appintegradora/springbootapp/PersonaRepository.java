package com.appintegradora.springbootapp;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Integer>{
    
    List<Persona> findByNya(String nya);

    Persona findById(int dni);
}
