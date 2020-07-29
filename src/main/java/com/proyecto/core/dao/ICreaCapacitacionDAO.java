package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.CreaCapacitacion;

@Repository
public interface ICreaCapacitacionDAO extends CrudRepository<CreaCapacitacion, Integer>{

}
