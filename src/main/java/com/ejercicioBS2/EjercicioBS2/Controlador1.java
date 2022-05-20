package com.ejercicioBS2.EjercicioBS2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController()

public class Controlador1 {

   @Autowired
    Persona persona;
    @GetMapping("/controlador1/addPersona")

    public Persona datosPersona(@RequestHeader Map<String,String> headers){
        persona.setNombre(headers.get("nombre"));
        persona.setEdad(Integer.parseInt(headers.get("edad")));
        persona.setCiudad(headers.get("ciudad"));
        return persona ;
    }
}
