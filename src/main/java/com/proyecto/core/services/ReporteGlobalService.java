package com.proyecto.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyecto.core.dao.ReporteGlobalRepository;
import com.proyecto.core.interfaces.IReporteGlobalServices;
import com.proyecto.core.model.ReporteGlobalEntity;

public class ReporteGlobalService implements IReporteGlobalServices {

	@Autowired
	private ReporteGlobalRepository data;
	
	@Override
	public List<ReporteGlobalEntity> mostrarReporteGlobal() {
		// TODO Auto-generated method stub
		return (List<ReporteGlobalEntity>) data.findAll();
	}

	@Override
	public void crearReporteGlobal(ReporteGlobalEntity ReporteGlobal) {
		// TODO Auto-generated method stub
		data.save(ReporteGlobal);
	}

	@Override
	public ReporteGlobalEntity buscarReporteGlobal(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).orElse(null);
	}

	@Override
	public void borrarReporteGlobal(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

}
