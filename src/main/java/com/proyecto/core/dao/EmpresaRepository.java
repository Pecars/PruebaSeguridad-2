package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.EmpresaEntity;

@Repository
public interface EmpresaRepository extends CrudRepository<EmpresaEntity, Integer>{

}
