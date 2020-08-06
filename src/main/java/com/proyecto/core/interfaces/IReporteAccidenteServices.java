package com.proyecto.core.interfaces;

import java.util.List;
import java.util.Optional;

import com.proyecto.core.model.ReporteAccidenteEntity;

public interface IReporteAccidenteServices {
	
	public List<ReporteAccidenteEntity> mostrarReporteAccidente();
	
	public void crearReporteAccidente(ReporteAccidenteEntity ReporteAccidente);
	
	public ReporteAccidenteEntity buscarReporteAccidente(int id);
	
	public void borrarReporteAccidente(int id);

	public Optional<ReporteAccidenteEntity>listarId(int id);
}
