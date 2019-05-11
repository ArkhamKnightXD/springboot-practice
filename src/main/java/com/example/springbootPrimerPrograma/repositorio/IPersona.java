package com.example.springbootPrimerPrograma.repositorio;

import com.example.springbootPrimerPrograma.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

// para poder trabajar con la tabla creada en base a persona necesito crear una interfaz y desde esta heredar la clase jpa
// y en esta especificarle la clase que usare y tambien en que formato esta su llave primaria que en este caso al ser int usamos integer

public interface IPersona extends JpaRepository<Persona, Integer> {

}
