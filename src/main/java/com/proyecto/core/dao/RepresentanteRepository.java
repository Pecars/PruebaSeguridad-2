package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.RepresentanteEntity;

@Repository
public interface RepresentanteRepository extends CrudRepository<RepresentanteEntity, Integer>{

}
