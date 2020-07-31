package com.proyecto.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.core.interfaces.IListadoCapacitaciones;


@Controller
@RequestMapping("/administrador")
public class ControladorVistasAdministrador {
	
	@Autowired
	private IListadoCapacitaciones service;

	@GetMapping("controlpagos")
	public String control_pago() {
		return "control_pagos";
	}
	
	@GetMapping("accidentabilidad")
	public String calcular_accidentabilidad() {
		return "calcular_accidentabilidad";
	}
	
	@GetMapping("actividades")
	public String visualizar_actividades() {
		return "visualizar_actividades";
	}
	
	@GetMapping("atrasos")
	public String notificar_atrasos() {
		return "notificar_atrasos";
	}
	
	@GetMapping("reportecliente")
	public String generar_reporte_cliente() {
		return "generar_reporte_cliente";
	}
	
	@GetMapping("reporteglobal")
	public String generar_reporte_global() {
		return "generar_reporte_global";
	}
	
	@GetMapping("mantencioninfocliente")
	public String mantencion_info_clientes() {
		return "mantencion_info_clientes";
	}
	
	@GetMapping("mantencioninfoprofesional")
	public String mantencion_info_profesional() {
		return "mantencion_info_profesional";
	}
	
	@GetMapping("nuevacapacitacion")
	public String nueva_capacitacion() {
	
		return "nueva_capacitacion";
	}
	
	@GetMapping("guardarcapacitacion")
	public String save() {
		
		
		//service.guardarNueva(cap);
		return "redirect:/index";
		
	}
	
}
