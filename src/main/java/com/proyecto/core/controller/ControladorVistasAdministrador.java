package com.proyecto.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/administrador")
public class ControladorVistasAdministrador {

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
}
