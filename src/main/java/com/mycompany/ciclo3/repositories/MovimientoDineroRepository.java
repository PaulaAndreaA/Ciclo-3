package com.mycompany.ciclo3.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.ciclo3.MovimientoDinero;

@Repository
public interface MovimientoDineroRepository extends CrudRepository<MovimientoDinero, Long> {

}
