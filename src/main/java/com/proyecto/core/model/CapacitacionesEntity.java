package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="CAPACITACIONES")
public class CapacitacionesEntity {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="ID_CAPACITACION")
	private int idCaps;
	@Column (name="CAPACITACION")
	private String cap;
	@Column (name="EMPRESA")
	private String empresa;
	@Column (name="ESTADO_CAPACITACION")
	private String estadoCap;
	@Column (name="FECHA_AGENDADA")
	private String fechaAge;
	@Column (name="FECHA_REALIZADA")
	private String fechaReal;
	@Column (name="OBSERVACIONES")
	private String obs;
	@Column (name="PROFESIONAL")
	private String profesional;
	@Column (name="TEMA_CAPACITACION")
	private String temaCap;
	
	public CapacitacionesEntity() {
		
	}
	
	public CapacitacionesEntity(int idCaps, String cap, String empresa, String estadoCap, String fechaAge,
			String fechaReal, String obs, String profesional, String temaCap) {
		super();
		this.idCaps = idCaps;
		this.cap = cap;
		this.empresa = empresa;
		this.estadoCap = estadoCap;
		this.fechaAge = fechaAge;
		this.fechaReal = fechaReal;
		this.obs = obs;
		this.profesional = profesional;
		this.temaCap = temaCap;
	}

	public int getIdCaps() {
		return idCaps;
	}

	public void setIdCaps(int idCaps) {
		this.idCaps = idCaps;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEstadoCap() {
		return estadoCap;
	}

	public void setEstadoCap(String estadoCap) {
		this.estadoCap = estadoCap;
	}

	public String getFechaAge() {
		return fechaAge;
	}

	public void setFechaAge(String fechaAge) {
		this.fechaAge = fechaAge;
	}

	public String getFechaReal() {
		return fechaReal;
	}

	public void setFechaReal(String fechaReal) {
		this.fechaReal = fechaReal;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getProfesional() {
		return profesional;
	}

	public void setProfesional(String profesional) {
		this.profesional = profesional;
	}

	public String getTemaCap() {
		return temaCap;
	}

	public void setTemaCap(String temaCap) {
		this.temaCap = temaCap;
	}

	@Override
	public String toString() {
		return "CapacitacionesEntity [idCaps=" + idCaps + ", cap=" + cap + ", empresa=" + empresa + ", estadoCap="
				+ estadoCap + ", fechaAge=" + fechaAge + ", fechaReal=" + fechaReal + ", obs=" + obs + ", profesional="
				+ profesional + ", temaCap=" + temaCap + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCaps;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CapacitacionesEntity other = (CapacitacionesEntity) obj;
		if (idCaps != other.idCaps)
			return false;
		return true;
	}
	
	

}
