package com.proyecto.core.interfaces;

import java.util.List;
import java.util.Optional;

import com.proyecto.core.model.CapacitacionEntity;


public interface ICapacitacionServices {
	
	public List<CapacitacionEntity> mostrarCapacitacion();
	
	public int crearCapacitacion(CapacitacionEntity Capacitacion);
	
	public CapacitacionEntity buscarCapacitacion(int id);
	
	public void borrarCapacitacion(int id);

	public Optional<CapacitacionEntity>listarId(int id);
}
