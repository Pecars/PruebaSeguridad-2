package com.proyecto.core.interfaces;

import java.util.List;
import java.util.Optional;

import com.proyecto.core.model.RepresentanteEntity;

public interface IRepresentanteServices {
	
	public List<RepresentanteEntity> mostrarRepresentante();
	
	public void crearRepresentante(RepresentanteEntity Representante);
	
	public RepresentanteEntity buscarRepresentante(int id);
	
	public void borrarRepresentante(int id);

	public Optional<RepresentanteEntity>listarId(int id);
}
