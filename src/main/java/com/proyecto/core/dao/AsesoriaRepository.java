package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.AsesoriaEntity;

@Repository
public interface AsesoriaRepository extends CrudRepository<AsesoriaEntity, Integer>{

}
