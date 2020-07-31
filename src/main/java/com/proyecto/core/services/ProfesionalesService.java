package com.proyecto.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyecto.core.dao.ProfesionalesRepository;
import com.proyecto.core.interfaces.IProfesionalesServices;
import com.proyecto.core.model.ProfesionalesEntity;

public class ProfesionalesService implements IProfesionalesServices {

	@Autowired
	public ProfesionalesRepository data;
	
	@Override
	public List<ProfesionalesEntity> mostrarProfesional() {
		// TODO Auto-generated method stub
		return (List<ProfesionalesEntity>) data.findAll();
	}

	@Override
	public void crearProfesionales(ProfesionalesEntity Profesionales) {
		// TODO Auto-generated method stub
		data.save(Profesionales);
	}

	@Override
	public ProfesionalesEntity buscarProfesionales(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarProfesionales(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

}
