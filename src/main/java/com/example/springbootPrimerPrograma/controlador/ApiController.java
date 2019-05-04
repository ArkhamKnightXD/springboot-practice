package com.example.springbootPrimerPrograma.controlador;

import com.example.springbootPrimerPrograma.entidades.Estudiante;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/")
public class ApiController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String holaMundo(){


        return "Hola mundo";
    }

    public Estudiante getEstudiante(){
        return new Estudiante(2411444, "karvin");
    }

}

