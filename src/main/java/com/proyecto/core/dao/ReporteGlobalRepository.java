package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.ReporteGlobalEntity;

@Repository
public interface ReporteGlobalRepository extends CrudRepository<ReporteGlobalEntity, Integer> {

}
