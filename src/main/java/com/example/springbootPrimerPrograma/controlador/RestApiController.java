package com.example.springbootPrimerPrograma.controlador;


import com.example.springbootPrimerPrograma.modelo.Persona;
import com.example.springbootPrimerPrograma.repositorio.IPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// Aqui defino que este sera un controlador basado en rest, no se debe de llamar la clase RestController, pues dara error el programa
@RestController
@RequestMapping("/personas")
public class RestApiController {

    // Aqui estoy trabajando las funciones basicas del crud en servicio rest

    @Autowired // instanciando repositorio IPersona para usarlo en este contolador
    private IPersona persona;


    // Devolviendo la lista de personas desde el controlador rest esto nos retornara un json con la personas existentes
    @GetMapping
        public List<Persona> listar(){

       return persona.findAll();
    }

    // Ejemplo de insertar persona mediante post, esto se prueba con postman
    // @RequestBody lo que hace es que toma el json que esto nos da y automaticamente lo transforma en un objeto java
    @PostMapping
    public void insertarPersona(@RequestBody Persona per){
        persona.save(per);
    }

    // El put es para actualizacion
    @PutMapping // tanto en modificar personas como en agregar se usa el .save , ya que este se comporta distinto dependiendo del id
    // que le manden, si le mandan un id que no existe esto significa que debera agregar, pero si el id que le mandaron ya existe
    // el lo tomar esto como que es una actualizacion o modificacion de la persona existente
    public void modificarPersona(@RequestBody Persona per){
        persona.save(per);
    }

    // Funcion para borrar en esta le mandamos el id mediante la url y le especificamos a la funcion que lo tome mediante @PathVariable
    @DeleteMapping(value = "/{id}/")
    public void eliminarPersona(@PathVariable("id") int id){
        persona.deleteById(id);
    }
}
