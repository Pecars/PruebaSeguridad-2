package com.proyecto.core.interfaces;

import java.util.List;

import com.proyecto.core.model.AsesoriaEntity;

public interface IAsesoriaServices {
	
	public List<AsesoriaEntity> mostrarAsesoria();
	
	public void crearAsesoria(AsesoriaEntity Asesoria);
	
	public AsesoriaEntity buscarAsesoria(int id);
	
	public void borrarAsesoria(int id);
	
	

}
