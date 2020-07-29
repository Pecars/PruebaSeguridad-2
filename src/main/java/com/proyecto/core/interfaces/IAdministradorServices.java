package com.proyecto.core.interfaces;
import java.util.List;

import com.proyecto.core.model.AdministradorEntity;
public interface IAdministradorServices {

	public List<AdministradorEntity> mostrarAdministrador();
	
	public void crearAdministrador (AdministradorEntity Administrador);
	
	public AdministradorEntity buscarAdministrador(int id);
	
	public void borrarAdministrador(int id);
}
