package com.mycompany.ciclo3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.ciclo3.MovimientoDinero;
import com.mycompany.ciclo3.services.MovimientoDineroService;

@RestController
public class MovimientoDineroController {

    @Autowired
    public MovimientoDineroService movimientoDineroService;

    @GetMapping(value = "/enterprises/{empresaId}/movements")
    public ResponseEntity<List<MovimientoDinero>> consultarMovimientosEmpresa(@PathVariable Long empresaId) {
        List<MovimientoDinero> movimientos = movimientoDineroService.consultarMovimientosEmpresa(empresaId);
        return new ResponseEntity<>(movimientos, HttpStatus.OK);
    }

    @PostMapping(value = "/enterprises/{empresaId}/movements")
    public ResponseEntity<MovimientoDinero> crearMovimientoEmpresa(@PathVariable Long empresaId,
            @RequestBody MovimientoDinero movimiento) {
        MovimientoDinero movimientoCreado = movimientoDineroService.crearMovimientoEmpresa(empresaId, movimiento);
        return new ResponseEntity<>(movimientoCreado, HttpStatus.OK);
    }

    @PatchMapping(value = "/enterprises/{empresaId}/movements")
    public ResponseEntity<MovimientoDinero> actualizacionParcialMovimientoEmpresa(@PathVariable Long empresaId,
            @RequestBody MovimientoDinero movimiento) {
        MovimientoDinero movimiento5 = movimientoDineroService.actualizacionParcialMovimientoEmpresa(empresaId,
                movimiento);
        return new ResponseEntity<>(movimiento5, HttpStatus.OK);
    }

    @DeleteMapping(value = "/enterprises/{empresaId}/movements")
    public ResponseEntity<String> borrarMovimientoEmpresa(@PathVariable Long empresaId) {
        movimientoDineroService.borrarMovimientoEmpresa(empresaId);
        return new ResponseEntity<>("Movimientos de la empresa eliminados", HttpStatus.OK);
    }

}
