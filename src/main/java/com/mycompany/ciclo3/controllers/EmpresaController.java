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
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.ciclo3.Empresa;
import com.mycompany.ciclo3.services.EmpresaService;

@RestController
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService; 
        
    @GetMapping(value="/enterprises")
    public ResponseEntity<List<Empresa>> consultarEmpresas(){
        List<Empresa> resultadoConsulta = empresaService.consultarEmpresas();
        return new ResponseEntity<>(resultadoConsulta, HttpStatus.OK);
    }

    @PostMapping(value="/enterprises")
    public ResponseEntity<Empresa> crearEmpresas(){
        
        return new ResponseEntity<>(HttpStatus.OK);
        
    }

    @GetMapping(value="/enterprises/{empresaId}")
    public ResponseEntity<Empresa> consultarEmpresaEntity(@PathVariable String empresaId){
        Empresa empresa1 = empresaService.consultarEmpresa(empresaId);

        return new ResponseEntity<>(empresa1, HttpStatus.OK);
        
    }

    @PatchMapping(value="/enterprises/{empresaId}")
    public ResponseEntity<Empresa> actualizarEmpresa(){

        return new ResponseEntity<>(HttpStatus.OK);
        
    }

    @DeleteMapping(value="/enterprises/{empresaId}")
    public ResponseEntity<String> eliminarEmpresa(){

        return new ResponseEntity<>("eliminar empresa", HttpStatus.OK);         
    }


}