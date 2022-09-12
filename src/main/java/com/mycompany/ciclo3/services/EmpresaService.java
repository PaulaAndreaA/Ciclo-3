package com.mycompany.ciclo3.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.mycompany.ciclo3.Empresa;

@Service
public class EmpresaService {

    private List<Empresa> empresasC = new ArrayList<>();
    
    public EmpresaService(){
        Empresa empresa1 = new Empresa();
        empresa1.setId("245");
        empresa1.setNombreEmpresa("pol");
        empresa1.setDireccion("cre 3-23");
        empresa1.setNit("2234");
        empresa1.setTelefono("243434");

        empresasC.add(empresa1);
    }

    public List<Empresa> consultarEmpresas (){
        return empresasC;
    }

    public Empresa consultarEmpresa(String empresaId){
        for (int i = 0; i < empresasC.size(); i++) {
            Empresa empresa = empresasC.get(i);
            if(empresa.getId().equals(empresaId)){
                return empresa;
            }
            
        }
        return null;
    }

}
