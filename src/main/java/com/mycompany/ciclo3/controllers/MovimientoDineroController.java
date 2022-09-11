package com.mycompany.ciclo3.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.ciclo3.MovimientoDinero;

@RestController
public class MovimientoDineroController {

    @GetMapping(value = "/enterprises/{empresaId}/movements")
    public ResponseEntity<List<MovimientoDinero>> consultarMovimientosEmpresa() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/enterprises/{empresaId}/movements")
    public ResponseEntity<MovimientoDinero> crearMovimientoEmpresa() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping(value = "/enterprises/{empresaId}/movements")
    public ResponseEntity<MovimientoDinero> actualizacionParcialMovimientoEmpresa() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/enterprises/{empresaId}/movements")
    public ResponseEntity<String> borrarMovimientoEmpresa() {
        return new ResponseEntity<>("Movimiento eliminado", HttpStatus.OK);
    }
    
}
