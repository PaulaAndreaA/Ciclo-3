/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ciclo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Paula
 */
@SpringBootApplication
public class Ciclo3 {

    public static void main(String[] args) {
        SpringApplication.run(Ciclo3.class, args);

        Empresa empresa1=new Empresa();
        empresa1.setNombreEmpresa("BancoVR");
        
        MovimientoDinero movimientoDinero = new MovimientoDinero();

        Usuario empleadoMonica = new Usuario();
        empleadoMonica.setNombreCompleto("monica carvajal");

    }
}
