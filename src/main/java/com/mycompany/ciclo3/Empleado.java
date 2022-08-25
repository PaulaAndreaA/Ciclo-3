/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclo3;

/**
 *
 * @author Mónica
 */
public class Empleado {

    public String nomobreCompleto;
    public String correoElectronico;
    public String emrpesaDelEmpleado;
    public String rolDelEmpleado;

    public Empleado(){
        
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nomobreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nomobreCompleto;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setEmrpesaDelEmpleado(String emrpesaDelEmpleado) {
        this.empresaDelEmpleado = empresaDelEmpleado;

    }

    public String getEmrpesaDelEmpleado() {
        return emrpesaDelEmpleado;
    }

    public void setRolDelEmpleado(String rolDelEmpleado) {
        this.rolDelEmpleado = rolDelEmpleado;
    }

    public String getRolDelEmpleado() {
        return rolDelEmpleado;
    }

}
