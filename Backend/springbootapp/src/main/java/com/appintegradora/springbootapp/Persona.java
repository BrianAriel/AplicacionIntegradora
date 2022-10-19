package com.appintegradora.springbootapp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
    @Id
    private int dni;

    private String nya;
    private int edad;
    private String fechanac;

    protected Persona () {}
    
    public Persona (String nya, int edad, String fechanac) {
        this.nya = nya;
        this.edad = edad;
        this.fechanac = fechanac;
    }

    public int getDni() {
        return dni;
    }

    public String getNya() {
        return nya;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechanac() {
        return fechanac;
    }
}
