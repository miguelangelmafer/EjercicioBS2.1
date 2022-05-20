package com.ejercicioBS2.EjercicioBS2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()

public class Controlador2 {

    @Autowired
    Persona persona;
    @GetMapping("/controlador2/getPersona")

    public Persona edadDoble(){
        Integer edadactual = persona.getEdad();
        persona.setEdad(edadactual * 2);
        return persona;
    }

}
