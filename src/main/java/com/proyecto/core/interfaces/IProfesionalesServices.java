package com.proyecto.core.interfaces;

import java.util.List;

import com.proyecto.core.model.ProfesionalesEntity;

public interface IProfesionalesServices {
	
	public List<ProfesionalesEntity> mostrarProfesional();
	
	public void crearProfesionales(ProfesionalesEntity Profesionales);
	
	public ProfesionalesEntity buscarProfesionales(int id);
	
	public void borrarProfesionales(int id);

}
