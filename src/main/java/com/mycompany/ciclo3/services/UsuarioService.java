package com.mycompany.ciclo3.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mycompany.ciclo3.Rol;
import com.mycompany.ciclo3.Usuario;

@Service
public class UsuarioService {

    private List<Usuario> usuarioMA = new ArrayList<>();

    public UsuarioService() {
        Usuario usuario1 = new Usuario();
        usuario1.setusuarioId("1991");
        usuario1.setNombreCompleto("monica carvajal");
        usuario1.setCorreoElectronico("moni@gmail.com");
        usuario1.setRolDelUsuario(Rol.ADMINISTRADOR);

        usuarioMA.add(usuario1);
    }

    public List<Usuario> consultarUsuarios() {
        return usuarioMA;
    }

    public Usuario consultarUsuario(String usuarioId){
        for (int i = 0; i < usuarioMA.size(); i++){
            Usuario usuario = usuarioMA.get(i);
            if (usuario.getusuarioId().equals(usuarioId));
                return usuario;

        }
        return null;

    }

}