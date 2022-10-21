package com.appintegradora.springbootapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
    @Id
    private int dni;

    @Column (name = "nya")
    private String nya;

    @Column (name = "edad")
    private int edad;

    @Column (name = "fechanac")
    private String fechanac;

    protected Persona () {}
    
    public Persona (int dni, String nya, int edad, String fechanac) {
        this.dni = dni;
        this.nya = nya;
        this.edad = edad;
        this.fechanac = fechanac;
    }

    @Override
    public String toString() {
        return String.format("Persona: [DNI = %d, Nombre y apellido = '%s', Edad = %d, Fecha de nacimiento = '%s']", dni, nya, edad, fechanac, "\n");
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
