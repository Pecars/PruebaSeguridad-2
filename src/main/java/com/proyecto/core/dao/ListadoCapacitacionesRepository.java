package com.proyecto.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.core.model.ListadoCapacitaciones;

@Repository
public interface ListadoCapacitacionesRepository extends CrudRepository<ListadoCapacitaciones, Integer> {
	

}