package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INSTANCIA_CAPACITACION")
public class ListadoCapacitaciones {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_INS")
	private int idCapacitacion;
	
	@Column(name="CAPACITACION_ID_CAP")
	private int capacitacion;
	
	@Column(name="PROFESIONALES_RUT_PROF")
	private int profesional;
	
	@Column(name="EMPRESA_RUT_EMPRESA")
	private int empresa;
	
	@Column(name="FECHA_AGENDADA")
	private String fechaAgendada;
	
	@Column(name="FECHA_REALIZADA")
	private String fechaRealizada;
	
	@Column(name="ESTADO_CAPACITACION")
	private String estado;
	
	@Column(name="TEMA_CAPACITACION")
	private String tema;
	
	@Column(name="OBSERVACIONES_CAPACITACION")
	private String observacion;
	
	
	public ListadoCapacitaciones() {
	
	}

	public ListadoCapacitaciones(int idCapacitacion, int capacitacion, int profesional, int empresa,
			String fechaAgendada, String fechaRealizada, String estado, String tema, String observacion) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.capacitacion = capacitacion;
		this.profesional = profesional;
		this.empresa = empresa;
		this.fechaAgendada = fechaAgendada;
		this.fechaRealizada = fechaRealizada;
		this.estado = estado;
		this.tema = tema;
		this.observacion = observacion;
	}

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public int getCapacitacion() {
		return capacitacion;
	}

	public void setCapacitacion(int capacitacion) {
		this.capacitacion = capacitacion;
	}

	public int getProfesional() {
		return profesional;
	}

	public void setProfesional(int profesional) {
		this.profesional = profesional;
	}

	public int getEmpresa() {
		return empresa;
	}

	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}

	public String getFechaAgendada() {
		return fechaAgendada;
	}

	public void setFechaAgendada(String fechaAgendada) {
		this.fechaAgendada = fechaAgendada;
	}

	public String getFechaRealizada() {
		return fechaRealizada;
	}

	public void setFechaRealizada(String fechaRealizada) {
		this.fechaRealizada = fechaRealizada;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Override
	public String toString() {
		return "ListadoCapacitaciones [idCapacitacion=" + idCapacitacion + ", capacitacion=" + capacitacion
				+ ", profesional=" + profesional + ", empresa=" + empresa + ", fechaAgendada=" + fechaAgendada
				+ ", fechaRealizada=" + fechaRealizada + ", estado=" + estado + ", tema=" + tema + ", observacion="
				+ observacion + "]";
	}
	
	
	
	
}
