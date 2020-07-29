package com.proyecto.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.core.dao.ICreaCapacitacionDAO;
import com.proyecto.core.interfaces.ICreaCapacitacion;
import com.proyecto.core.model.CreaCapacitacion;

@Service
public class CreaCapacitacionServices implements ICreaCapacitacion {
	
	@Autowired
	private ICreaCapacitacionDAO data;

	@Override
	public List<CreaCapacitacion> listar() {

		return (List<CreaCapacitacion>) data.findAll();
	}

	@Override
	public Optional<CreaCapacitacion> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(CreaCapacitacion lc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
