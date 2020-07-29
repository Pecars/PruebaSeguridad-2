package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.CapacitacionEntity;

@Repository
public interface CapacitacionRepository extends CrudRepository<CapacitacionEntity, Integer>{

}
