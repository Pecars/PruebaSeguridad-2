package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.ReporteClienteEntity;

@Repository
public interface ReporteClienteRepository extends CrudRepository<ReporteClienteEntity, Integer>{

}
