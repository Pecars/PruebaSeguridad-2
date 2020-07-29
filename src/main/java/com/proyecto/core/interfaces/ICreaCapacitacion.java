package com.proyecto.core.interfaces;

import java.util.List;
import java.util.Optional;

import com.proyecto.core.model.CreaCapacitacion;

public interface ICreaCapacitacion {
	public List<CreaCapacitacion>listar();
	public Optional<CreaCapacitacion>listarId(int id);
	public int save(CreaCapacitacion cap);
	public void delete(int id);
}
