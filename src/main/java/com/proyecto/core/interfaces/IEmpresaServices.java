package com.proyecto.core.interfaces;

import java.util.List;

import com.proyecto.core.model.EmpresaEntity;

public interface IEmpresaServices {
	
	public List<EmpresaEntity> mostrarEmpresa();
	
	public void crearEmpresa(EmpresaEntity Empresa);
	
	public EmpresaEntity buscarEmpresa(int id);

	public void borrarEmpresa(int id);
}
