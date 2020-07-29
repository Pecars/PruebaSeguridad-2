package com.proyecto.core.interfaces;

import java.util.List;

import com.proyecto.core.model.RevisionMejoraEntity;

public interface IRevisionMejoraServices {
	
	public List<RevisionMejoraEntity> mostrarRevision();
	
	public void crearRevisionMejora(RevisionMejoraEntity RevisionMejora);
	
	public RevisionMejoraEntity buscarRevisionMejora(int id);
	
	public void borrarRevisionMejora(int id);

}
