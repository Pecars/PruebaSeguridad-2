package com.proyecto.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyecto.core.dao.EmpresaRepository;
import com.proyecto.core.interfaces.IEmpresaServices;
import com.proyecto.core.model.EmpresaEntity;

public class EmpresaService implements IEmpresaServices {

	@Autowired
	public EmpresaRepository data;
	
	@Override
	public List<EmpresaEntity> mostrarEmpresa() {
		// TODO Auto-generated method stub
		return (List<EmpresaEntity>) data.findAll();
	}

	@Override
	public void crearEmpresa(EmpresaEntity Empresa) {
		// TODO Auto-generated method stub
		data.save(Empresa);
	}

	@Override
	public EmpresaEntity buscarEmpresa(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarEmpresa(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

}
