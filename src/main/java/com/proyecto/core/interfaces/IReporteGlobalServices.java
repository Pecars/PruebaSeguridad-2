package com.proyecto.core.interfaces;

import java.util.List;
import java.util.Optional;

import com.proyecto.core.model.ReporteGlobalEntity;

public interface IReporteGlobalServices {
	
	public List<ReporteGlobalEntity> mostrarReporteGlobal();
	
	public void crearReporteGlobal(ReporteGlobalEntity ReporteGlobal);
	
	public ReporteGlobalEntity buscarReporteGlobal(int id);
	
	public void borrarReporteGlobal(int id);

	public Optional<ReporteGlobalEntity>listarId(int id);
}
