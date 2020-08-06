package com.proyecto.core.interfaces;

import java.util.List;
import java.util.Optional;

import com.proyecto.core.model.EmpresaEntity;

public interface IEmpresaServices {
	
	public List<EmpresaEntity> mostrarEmpresa();
	
	public int crearEmpresa(EmpresaEntity Empresa);
	
	public EmpresaEntity buscarEmpresa(int id);

	public void borrarEmpresa(int id);
	
	public Optional<EmpresaEntity>listarId(int id);
}
