package com.proyecto.core.interfaces;

import java.util.List;

import com.proyecto.core.model.CheckListEntity;

public interface ICheckListServices {

	public List<CheckListEntity> mostrarCheckList();
	
	public void crearCheckList(CheckListEntity CheckList);
	
	public CheckListEntity buscarCheckList(int id);
	
	public void borrarCheckList(int id);
}
