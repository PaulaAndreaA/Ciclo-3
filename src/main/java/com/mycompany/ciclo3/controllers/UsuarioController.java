package com.mycompany.ciclo3.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.ciclo3.Usuario;

@RestController
public class UsuarioController {

    @GetMapping(value = "/users")
    public ResponseEntity<List<Usuario>> consultarUsuarios() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<Usuario> cearUsuario() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/user/{usuarioId}")
    public ResponseEntity<Usuario> consultarUsuario() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping(value = "/user/{usuarioId}")
    public ResponseEntity<Usuario> actualizacionParcialUsuario() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/user/{usuarioId}")
    public ResponseEntity<String> borrarUsuario() {
        return new ResponseEntity<>("usuario eliminado", HttpStatus.OK);
    }

}
