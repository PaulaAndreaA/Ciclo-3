package com.mycompany.ciclo3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.ciclo3.Rol;
import com.mycompany.ciclo3.Usuario;
import com.mycompany.ciclo3.services.UsuarioService;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/users")
    public ResponseEntity<List<Usuario>> consultarUsuarios() {
        List<Usuario> resulatadoConsultaUsuarios = usuarioService.consultarUsuarios();
        return new ResponseEntity<>(resulatadoConsultaUsuarios, HttpStatus.OK);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<Usuario> cearUsuario(@RequestBody Usuario payload) {
        /*Usuario usuario = new Usuario();
        usuario.setNombreCompleto("Monica Carvajal");
        usuario.setCorreoElectronico("monica@gmail.com");
        usuario.setRolDelUsuario(Rol.ADMINISTRADOR);
        usuario.setusuarioId("cjnvkhndkl");
        System.out.println(payload.getUsuarioId());*/

        return new ResponseEntity<>(payload, HttpStatus.CREATED);
    }

    @GetMapping(value = "/user/{usuarioId}")
    public ResponseEntity<Usuario> consultarUsuario(@PathVariable String usuarioId) {
        Usuario usuario1 = usuarioService.consultarUsuario(usuarioId);
        return new ResponseEntity<>(usuario1, HttpStatus.OK);
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
