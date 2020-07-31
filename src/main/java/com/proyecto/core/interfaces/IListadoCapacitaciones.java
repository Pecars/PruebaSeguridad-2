package com.proyecto.core.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;


import com.proyecto.core.model.ListadoCapacitaciones;

@Repository
public interface IListadoCapacitaciones {

	public List<ListadoCapacitaciones>listar();
	public Optional<ListadoCapacitaciones>listarId(int id);
	public int save(ListadoCapacitaciones lc);
	public void delete(int id);

	
}
