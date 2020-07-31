package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.CapacitacionesEntity;

@Repository
public interface CapacitacionesRepository extends CrudRepository<CapacitacionesEntity, Integer>{

}
