package com.ejercicioBS2.EjercicioBS2;

import org.springframework.stereotype.Service;


@Service

public class Persona {
    private String nombre;
    private Integer edad;
    private String ciudad;

    public Persona(String nombre, Integer edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public Persona(){

    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}