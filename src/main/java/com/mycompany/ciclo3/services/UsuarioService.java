package com.mycompany.ciclo3.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mycompany.ciclo3.Rol;
import com.mycompany.ciclo3.Usuario;
import com.mycompany.ciclo3.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioService() {
    }

    public List<Usuario> consultarUsuarios() {
        Iterable<Usuario> usuarios = usuarioRepository.findAll();
        List<Usuario> listaTemporal = new ArrayList<>();
        usuarios.forEach(listaTemporal::add);
        return listaTemporal;
    }

    public Usuario consultarUsuario(Long usuarioId) {
        Optional<Usuario> usuario = usuarioRepository.findById(usuarioId);
        return usuario.orElse(null);
    }

    public Usuario creaUsuario(Usuario nuevoUsuario) {
        return usuarioRepository.save(nuevoUsuario);
    }

    public Usuario actualizarUsuario(String usuarioId) {
        return null;

    }

    public Usuario borrarUsuario(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
        return null;
    }

}