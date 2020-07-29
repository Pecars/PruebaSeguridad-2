package com.proyecto.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyecto.core.dao.CapacitacionRepository;
import com.proyecto.core.interfaces.ICapacitacionServices;
import com.proyecto.core.model.CapacitacionEntity;

public class CapacitacionService implements ICapacitacionServices {

	@Autowired
	public CapacitacionRepository data;
	
	@Override
	public List<CapacitacionEntity> mostrarCapacitacion() {
		// TODO Auto-generated method stub
		return (List<CapacitacionEntity>) data.findAll();
	}

	@Override
	public void crearCapacitacion(CapacitacionEntity Capacitacion) {
		// TODO Auto-generated method stub
		data.save(Capacitacion);

	}

	@Override
	public CapacitacionEntity buscarCapacitacion(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarCapacitacion(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

}
