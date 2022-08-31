/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclo3;

/**
 *
 * @author Paula
 */
public class MovimientoDinero {
    private long montoDelMovimiento;
   private String conceptosDelMovimiento;
   private Empleado movimientoDeUsuario;
   
   public MovimientoDinero(){}

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

    public Empleado getMovimientoDeUsuario() {
        return movimientoDeUsuario;
    }

    public void setMovimientoDeUsuario(Empleado movimientoDeUsuario) {
        this.movimientoDeUsuario = movimientoDeUsuario;
    }
 
}
