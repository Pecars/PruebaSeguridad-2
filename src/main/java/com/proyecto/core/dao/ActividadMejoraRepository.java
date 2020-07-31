package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.ActividadMejoraEntity;

@Repository
public interface ActividadMejoraRepository extends CrudRepository<ActividadMejoraEntity, Integer> {
	

}
