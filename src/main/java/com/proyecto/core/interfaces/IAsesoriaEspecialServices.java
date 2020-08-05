package com.proyecto.core.interfaces;

import java.util.List;

import com.proyecto.core.model.AsesoriaEspecialEntity;

public interface IAsesoriaEspecialServices {
	
	public List<AsesoriaEspecialEntity> mostrarAsesoriaEspecial();
	
	public void crearAsesoriaEspecial(AsesoriaEspecialEntity AsesoriaEspecial);
	
	public AsesoriaEspecialEntity buscarAsesoriaEspecial(int id);
	
	public void borrarAsesoriaEspecial(int id);

}
