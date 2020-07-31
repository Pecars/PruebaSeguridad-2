package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.ReporteAccidenteEntity;

@Repository
public interface ReporteAccidenteRepository extends CrudRepository<ReporteAccidenteEntity, Integer>{

}
