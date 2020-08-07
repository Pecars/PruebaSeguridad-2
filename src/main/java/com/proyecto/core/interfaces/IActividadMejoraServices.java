package com.proyecto.core.interfaces;

import java.util.List;
import java.util.Optional;

import com.proyecto.core.model.ActividadMejoraEntity;


public interface IActividadMejoraServices {
	
	public List<ActividadMejoraEntity> mostrarActivadadMejora();
	
	public void crearActividadMejora(ActividadMejoraEntity ActividadMejora);
	
	public ActividadMejoraEntity buscarActividadMejora(int id);
	
	public void borrarActividadMejora(int id);

	public Optional<ActividadMejoraEntity>listarId(int id);
}
