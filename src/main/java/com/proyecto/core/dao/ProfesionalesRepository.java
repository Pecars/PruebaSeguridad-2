package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.ProfesionalesEntity;

@Repository
public interface ProfesionalesRepository extends CrudRepository<ProfesionalesEntity, Integer>{

}
