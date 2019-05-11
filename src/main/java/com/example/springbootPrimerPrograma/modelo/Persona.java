package com.example.springbootPrimerPrograma.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

// Con esto le especificamos que este modelo sera una tabla en la base de datos
@Entity
public class Persona {

    @Id// Con esto le indico que el idPersona sera el primary key de esta clase tanto como la tabla que esta representa
    private int idPersona;

    // Aqui especifico que este campo sera una columna en la tabla y que se llamara nombre y el maximo tamaño de string que
    // soportara sera de 50, por defecto es 255 asi que no es necesario especificar este dato
    @Column(name = "nombre", length = 50)
    private String nombre;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
