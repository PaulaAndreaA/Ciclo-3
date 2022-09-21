/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclo3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    private long movimientoId;
    private long montoDelMovimiento;
    private String conceptosDelMovimiento;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa movimientoEmpresa;

    public MovimientoDinero() {
    }

    public long getMovimientoId(){
        return movimientoId;
    }

    public void setMovimientoId(long movimientoId) {
        this.movimientoId = movimientoId;
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
