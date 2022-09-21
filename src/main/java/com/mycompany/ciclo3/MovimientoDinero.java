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
 * @author Paula
 */
@Entity
@Table(name = "movimiento_dinero")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long montoDelMovimiento;
    private String conceptosDelMovimiento;
    private Usuario usuario;
    private Empresa movimientoEmpresa;

    public MovimientoDinero() {
    }

    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public long getMontoDelMovimiento() {
        return montoDelMovimiento;
    }

    public void setMontoDelMovimiento(long montoDelMovimiento) {
        this.montoDelMovimiento = montoDelMovimiento;
    }

    public String getConceptosDelMovimiento() {
        return conceptosDelMovimiento;
    }

    public void setConceptosDelMovimiento(String conceptosDelMovimiento) {
        this.conceptosDelMovimiento = conceptosDelMovimiento;
    }

    public Usuario getMovimientoDeUsuario() {
        return usuario;
    }

    public void setMovimientoDeUsuario(Usuario movimientoDeUsuario) {
        this.usuario = movimientoDeUsuario;
    }

    public Empresa getmovimientoEmpresa() {
        return movimientoEmpresa;
    }

    public void setmovimientoEmpresa(Empresa movimientoEmpresa) {
        this.movimientoEmpresa = movimientoEmpresa;
    }

}
