package com.mycompany.ciclo3.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.ciclo3.Empresa;
import com.mycompany.ciclo3.MovimientoDinero;
import com.mycompany.ciclo3.Usuario;
import com.mycompany.ciclo3.repositories.MovimientoDineroRepository;

@Service
public class MovimientoDineroService {

    @Autowired
    private MovimientoDineroRepository movimientoDineroRepository;
    @Autowired
    private EmpresaService empresaService;
    @Autowired
    private UsuarioService usuarioService;

    public MovimientoDineroService() {
    }

    public List<MovimientoDinero> consultarMovimientosEmpresa(Long empresaId) {
        Iterable<MovimientoDinero> movimientos = movimientoDineroRepository.findAll();
        List<MovimientoDinero> listaTemporal2 = new ArrayList<>();
        movimientos.forEach((movimientoDinero) -> {
            if (empresaId.equals(movimientoDinero.getEmpresa().getEmpresaId())) {
                listaTemporal2.add(movimientoDinero);
            }
        });

        return listaTemporal2;
    }

    public MovimientoDinero crearMovimientoEmpresa(Long empresaId, MovimientoDinero nuevoMoviemiento) {
        Empresa empresa = empresaService.consultarEmpresa(empresaId);
        Usuario usuario = usuarioService.consultarUsuario(nuevoMoviemiento.getUsuario().getUsuarioId());
        nuevoMoviemiento.setEmpresa(empresa);
        nuevoMoviemiento.setUsuario(usuario);
        return movimientoDineroRepository.save(nuevoMoviemiento);
    }

    public MovimientoDinero actualizacionParcialMovimientoEmpresa(Long empresaId,
            MovimientoDinero actualizarMovimiento) {
        Empresa empresa = empresaService.consultarEmpresa(empresaId);
        if (empresa != null) {
            List<MovimientoDinero> movimientosEmpesa = consultarMovimientosEmpresa(empresaId);
            for (MovimientoDinero movimientoDinero : movimientosEmpesa) {
                if (movimientoDinero.getMovimientoId().equals(actualizarMovimiento.getMovimientoId())) {
                    movimientoDinero.setConceptosDelMovimiento(actualizarMovimiento.getConceptosDelMovimiento());
                    movimientoDinero.setMontoDelMovimiento(actualizarMovimiento.getMontoDelMovimiento());
                    Usuario usuario = usuarioService.consultarUsuario(actualizarMovimiento.getUsuario().getUsuarioId());
                    movimientoDinero.setUsuario(usuario);

                    return movimientoDineroRepository.save(movimientoDinero);
                }
            }
        }

        return null;
    }

    public void borrarMovimientoEmpresa(Long empresaId) {
        Empresa empresa = empresaService.consultarEmpresa(empresaId);
        if (empresa != null) {
            List<MovimientoDinero> movimientosEmpesa = consultarMovimientosEmpresa(empresaId);
            for (MovimientoDinero movimientoDinero : movimientosEmpesa) {
                movimientoDineroRepository.deleteById(movimientoDinero.getMovimientoId());
            }
        }
    }

}
