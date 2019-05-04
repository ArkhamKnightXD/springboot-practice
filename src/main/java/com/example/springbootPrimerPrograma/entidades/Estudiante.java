package com.example.springbootPrimerPrograma.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estudiante {

    @Id
    private int matricula;
    private String nombre;


    public Estudiante(int matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
