package com.proyecto.core.interfaces;

import java.util.List;

import com.proyecto.core.model.CapacitacionesEntity;

public interface ICapacitacionesServices {
	
	public List<CapacitacionesEntity> mostrarCapacitaciones();
	
	public void crearCapacitaciones(CapacitacionesEntity Capacitaciones);
	
	public CapacitacionesEntity buscarCapacitaciones(int id);
	
	public void borrarCapacitaciones(int id);

}
