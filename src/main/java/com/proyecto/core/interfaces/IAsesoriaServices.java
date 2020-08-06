package com.proyecto.core.interfaces;

import java.util.List;
import java.util.Optional;

import com.proyecto.core.model.AsesoriaEntity;

public interface IAsesoriaServices {
	
	public List<AsesoriaEntity> mostrarAsesoria();
	
	public void crearAsesoria(AsesoriaEntity Asesoria);
	
	public AsesoriaEntity buscarAsesoria(int id);
	
	public void borrarAsesoria(int id);
	
	public Optional<AsesoriaEntity>listarId(int id);

}
