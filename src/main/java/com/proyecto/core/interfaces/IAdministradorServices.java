package com.proyecto.core.interfaces;
import java.util.List;
import java.util.Optional;

import com.proyecto.core.model.AdministradorEntity;

public interface IAdministradorServices {

	public List<AdministradorEntity> mostrarAdministrador();
		
	public int crearAdministrador (AdministradorEntity Administrador);
	
	public AdministradorEntity buscarAdministrador(int id);
	
	public void borrarAdministrador(int id);
	
	public Optional<AdministradorEntity>listarId(int id);
}
