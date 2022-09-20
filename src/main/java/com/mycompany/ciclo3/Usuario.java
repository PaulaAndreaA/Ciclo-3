/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclo3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Mónica
 */

@Entity
@Table(name = "usuario")
public class Usuario {

    private String nombreCompleto;
    private String correoElectronico;
    private Rol rolDelUsuario;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long usuarioId;

    public Usuario() {

    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setRolDelUsuario(Rol rolDelUsuario) {
        this.rolDelUsuario = rolDelUsuario;
    }

    public Rol getRolDelUsuario() {
        return rolDelUsuario;
    }

    public void setusuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getusuarioId() {
        return usuarioId;
    }
}
