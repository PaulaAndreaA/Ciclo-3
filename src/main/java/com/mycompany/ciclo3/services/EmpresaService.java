package com.mycompany.ciclo3.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mycompany.ciclo3.Empresa;
import com.mycompany.ciclo3.repositories.EmpresaRepository;

@Service
public class EmpresaService{

    @Autowired
    public EmpresaRepository empresaRepository;
    
    public EmpresaService(){
        
    }

    public List<Empresa> consultarEmpresas (){
        Iterable<Empresa> empresasC= empresaRepository.findAll();
        List<Empresa> listaTemporal1 = new ArrayList<>();
        empresasC.forEach(listaTemporal1::add);
        return listaTemporal1;
    }

    public Empresa crearEmpresas(Empresa empresa){
        
        return empresaRepository.save(empresa);
        
    }

    public Empresa consultarEmpresa(Long empresaId){
        Optional<Empresa> empresa = empresaRepository.findById(empresaId);

        return empresa.orElse(null);
    }
    
    public Empresa actualizarEmpresa(String empresaId) {
        return null;
    }

    public Empresa eliminarEmpresa(Long empresaId) {
        empresaRepository.deleteById(empresaId);
        return null;
    }
}
