package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.AsesoriaEspecialEntity;


@Repository
public interface AsesoriaEspecialRepository extends CrudRepository<AsesoriaEspecialEntity, Integer> {

}
