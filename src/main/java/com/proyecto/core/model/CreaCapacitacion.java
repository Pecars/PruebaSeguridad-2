package com.proyecto.core.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="capacitacion")
public class CreaCapacitacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cap;
	private String nombre_capacitacion;
	private String fecha_creacion_capacitacion;
	private char vigencia_capacitacion;
	
	public CreaCapacitacion() {
		
	}

	public CreaCapacitacion(int id_cap, String nombre_capacitacion, String fecha_creacion_capacitacion,
			char vigencia_capacitacion) {
		super();
		this.id_cap = id_cap;
		this.nombre_capacitacion = nombre_capacitacion;
		this.fecha_creacion_capacitacion = fecha_creacion_capacitacion;
		this.vigencia_capacitacion = vigencia_capacitacion;
	}

	public int getId_cap() {
		return id_cap;
	}

	public void setId_cap(int id_cap) {
		this.id_cap = id_cap;
	}

	public String getNombre_capacitacion() {
		return nombre_capacitacion;
	}

	public void setNombre_capacitacion(String nombre_capacitacion) {
		this.nombre_capacitacion = nombre_capacitacion;
	}

	public String getFecha_creacion_capacitacion() {
		return fecha_creacion_capacitacion;
	}

	public void setFecha_creacion_capacitacion(String fecha_creacion_capacitacion) {
		this.fecha_creacion_capacitacion = fecha_creacion_capacitacion;
	}

	public char getVigencia_capacitacion() {
		return vigencia_capacitacion;
	}

	public void setVigencia_capacitacion(char vigencia_capacitacion) {
		this.vigencia_capacitacion = vigencia_capacitacion;
	}

	@Override
	public String toString() {
		return "CreaCapacitacion [id_cap=" + id_cap + ", nombre_capacitacion=" + nombre_capacitacion
				+ ", fecha_creacion_capacitacion=" + fecha_creacion_capacitacion + ", vigencia_capacitacion="
				+ vigencia_capacitacion + "]";
	}
	
	
}
