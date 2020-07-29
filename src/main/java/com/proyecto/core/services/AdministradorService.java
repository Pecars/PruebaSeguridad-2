package com.proyecto.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyecto.core.dao.AdministradorRepository;
import com.proyecto.core.interfaces.IAdministradorServices;
import com.proyecto.core.model.AdministradorEntity;

public class AdministradorService implements IAdministradorServices {
	
	@Autowired
	private AdministradorRepository data;

	@Override
	public List<AdministradorEntity> mostrarAdministrador() {
		// TODO Auto-generated method stub
		return (List<AdministradorEntity>) data.findAll();
	}

	@Override
	public void crearAdministrador(AdministradorEntity Administrador) {
		// TODO Auto-generated method stub
		data.save(Administrador);
	}

	@Override
	public AdministradorEntity buscarAdministrador(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarAdministrador(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

}
