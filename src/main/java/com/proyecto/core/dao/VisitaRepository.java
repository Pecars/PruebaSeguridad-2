package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.VisitaEntity;

@Repository
public interface VisitaRepository extends CrudRepository<VisitaEntity, Integer>{

}
