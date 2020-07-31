package com.proyecto.core.interfaces;

import java.util.List;

import com.proyecto.core.model.VisitaEntity;

public interface IVisitaServices {
	
	public List<VisitaEntity> mostrarVisita();
	
	public void crearVisita(VisitaEntity Visita);
	
	public VisitaEntity buscarVisita(int id);
	
	public void borrarVisita(int id);

}
