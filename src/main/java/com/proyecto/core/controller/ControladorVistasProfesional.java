package com.proyecto.core.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.core.interfaces.IActividadMejoraServices;
import com.proyecto.core.interfaces.IEmpresaServices;
import com.proyecto.core.interfaces.IListadoCapacitaciones;
import com.proyecto.core.interfaces.IProfesionalesServices;
import com.proyecto.core.model.ActividadMejoraEntity;
import com.proyecto.core.model.AsesoriaEntity;
import com.proyecto.core.model.CapacitacionesEntity;
import com.proyecto.core.model.EmpresaEntity;
import com.proyecto.core.model.ListadoCapacitaciones;
import com.proyecto.core.model.ProfesionalesEntity;

@Controller
@RequestMapping("/profesional")
public class ControladorVistasProfesional {

	


	
	//Variable para Listar Capacitaciones
	@Autowired
	private IListadoCapacitaciones service;
	@Autowired
	private IProfesionalesServices servicePro;
	@Autowired
	private IEmpresaServices servicEemp;
	@Autowired
	private IActividadMejoraServices serviceActMej;
	
	
	@GetMapping("capacitacion")
	public String crear_capacitacion(Model m) {
		m.addAttribute("ingresocapacitacion", new CapacitacionesEntity());
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
	
	//Actividad de Mejora
	@GetMapping("mejora")
	public String actividad_mejora(Model m) {
		m.addAttribute("nuevaactividad", new ActividadMejoraEntity());
		List<ProfesionalesEntity> listadopro = servicePro.mostrarProfesional();
		m.addAttribute("listadopro", listadopro);
		List<EmpresaEntity> listadoemp = servicEemp.mostrarEmpresa();
		m.addAttribute("listadoemp", listadoemp);
		return "ingreso_actividad_mejora";
	}
	
	@PostMapping("nuevaactividad")
	public String nuevaActividad(@Valid ActividadMejoraEntity mejora, Model m) {
		serviceActMej.crearActividadMejora(mejora);
		return "redirect:/profesional/listaractividadmejora";
	}
	
	@GetMapping("listaractividadmejora")
	public String listaActividadMejora(Model m) {
		List<ActividadMejoraEntity> listado = serviceActMej.mostrarActivadadMejora();
		m.addAttribute("listado", listado);
		return "listado_actividad_mejora";
	}
	//Fin actividad de mejora
	
	@GetMapping("ingreso_asesoria")
	public String ingreso_asesoria(Model m) {
		m.addAttribute("ingresoasesoria", new AsesoriaEntity());
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
