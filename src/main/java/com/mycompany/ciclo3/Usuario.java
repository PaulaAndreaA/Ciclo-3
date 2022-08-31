/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclo3;

/**
 *
 * @author Mónica
 */
public class Usuario {

    private String nombreCompleto;
    private String correoElectronico;
    private String empresaDelUsuario;
    private Rol rolDelUsuario;

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

    public void setEmpresaDelUsuario(String empresaDelUsuario) {
        this.empresaDelUsuario = empresaDelUsuario;

    }

    public String getEmpresaDelUsuario() {
        return empresaDelUsuario;
    }

    public void setRolDelUsuario(Rol rolDelUsuario) {
        this.rolDelUsuario = rolDelUsuario;
    }

    public Rol getRolDelUsuario() {
        return rolDelUsuario;
    }
}
