package com.example.springbootPrimerPrograma.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //Esto indica que es un controlador.

// aqui especifico la ruta en la que estara trabajando este controlador que por defecto se ubica en static y agregaremos
// thymeleaf indicando que estaremos trabajando en static/thymeleaf
@RequestMapping("/thymeleaf/")
public class MVCController {

    //Ejemplo de como mandar texto y variables a la vista desde el controlador, para mandar datos a una url
    // utilizamos el ? seguido de la variable y su valor asi como se ve en la url de abajo
    //Para ejecutar: http://localhost:8080/thymeleaf/?matricula=20011136

    @RequestMapping(path = "/")
    public String index(Model model, @RequestParam(name = "matricula") int matricula){
        //
        model.addAttribute("titulo", "Pagina desde Thymeleaf");
        model.addAttribute("mensaje", "Pagina desde Thymeleaf");
        model.addAttribute("matricula", matricula);
        // direccioando a la vista.
        return "/thymeleaf/holamundo";
    }


    // Otro ejemplo de como mandarle datos a la vista desde el controlador, sin agregar parametros
    // Notas sobre esto, no se debe de poner 2 path iguales porque sino crashea el programa
    // Como no hay requestparam en la funcion el path de esta sera simplemente http://localhost:8080/thymeleaf/prueba
    @RequestMapping(path = "/prueba")
    public String index2(Model model){

        model.addAttribute("titulo1", "Titulo de la plantilla de prueba");
        model.addAttribute("prueba", "prueba de como mandar datos a una vista");

        return "/thymeleaf/prueba";
    }



    // prueba de que se pueden mandar datos a la misma plantilla desde otro request, sin necesidad de mandar todos los
    // parametros, pues como vemos aqui no se ha mandado la matricula
    @RequestMapping(path = "/holamundo")
    public String indexSameAsFirst(Model model){

        model.addAttribute("titulo", "Titulo de la pagina prueba 222");
        model.addAttribute("mensaje", "Mandando datos a la misma plantilla");

        return "/thymeleaf/holamundo";
    }

}
