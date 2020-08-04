package com.proyecto.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.IListadoCapacitacionesRepository;
import com.proyecto.core.interfaces.IListadoCapacitaciones;
import com.proyecto.core.model.ListadoCapacitaciones;

@Service
public class ListadoCapacitacionesServices implements IListadoCapacitaciones {

	@Autowired
	private IListadoCapacitacionesRepository data;
	
	@Override
	public List<ListadoCapacitaciones> listar() {
		
		return (List<ListadoCapacitaciones>)data.findAll();
	}

	@Override
	public Optional<ListadoCapacitaciones> listarId(int id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public int save(ListadoCapacitaciones lc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
