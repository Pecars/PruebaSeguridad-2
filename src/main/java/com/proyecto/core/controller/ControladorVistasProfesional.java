package com.proyecto.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.log4j.Logger;


import com.proyecto.core.interfaces.IListadoCapacitaciones;
import com.proyecto.core.model.ListadoCapacitaciones;

@Controller
@RequestMapping("/profesional")
public class ControladorVistasProfesional {

	


	
	//Variable para Listar Capacitaciones
	@Autowired
	private IListadoCapacitaciones service;
	
	
	@GetMapping("capacitacion")
	public String crear_capacitacion() {
		return "crear_capacitacion";
	}
	
	@GetMapping("/lista_capacitacion")
	public String listar(Model model) {
		
		List<ListadoCapacitaciones>listado=service.listar();
		model.addAttribute("listado", listado);
		return "lista_capacitacion";
	}
	
	@GetMapping("visita")
	public String planificar_visita() {
		return "planificar_visita";
	}
	
	@GetMapping("revisar_cliente")
	public String revisar_cliente() {
		return "revisar_cliente";
	}
	
	@GetMapping("asesoria")
	public String crear_caso_asesoria() {
		return "crear_caso_asesoria";
	}
	
	@GetMapping("mejora")
	public String actividad_mejora() {
		return "actividad_mejora";
	}
	
	@GetMapping("ingreso_asesoria")
	public String ingreso_asesoria() {
		return "ingreso_asesoria";
	}
	
	@GetMapping("crear_check")
	public String crear_check_list() {
		return "crear_check_list";
	}
	
	@GetMapping("responder_check")
	public String responder_check_list() {
		return "responder_check_list";
	}
	
}
