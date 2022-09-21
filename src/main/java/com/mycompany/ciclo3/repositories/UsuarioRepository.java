package com.mycompany.ciclo3.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.ciclo3.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
