package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.PagoEmpresaEntity;

@Repository
public interface PagoEmpresaRepository extends CrudRepository<PagoEmpresaEntity, Integer> {

}
