package com.proyecto.core.interfaces;

import java.util.List;

import com.proyecto.core.model.RepresentanteEntity;

public interface IRepresentanteServices {
	
	public List<RepresentanteEntity> mostrarRepresentante();
	
	public void crearRepresentante(RepresentanteEntity Representante);
	
	public RepresentanteEntity buscarRepresentante(int id);
	
	public void borrarRepresentante(int id);

}
