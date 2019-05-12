package com.example.springbootPrimerPrograma.repositorio;

import com.example.springbootPrimerPrograma.modelo.Persona;
import com.example.springbootPrimerPrograma.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


// Por cada modelo debe de hacerse un repositorio
public interface IUsuario extends JpaRepository<Usuario, Integer> {

}
