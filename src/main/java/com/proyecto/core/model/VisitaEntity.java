package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="VISITA")
public class VisitaEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="ID_VIS")
	private int idVisita;
	@Column (name="MOTIVO_VISITA")
	private String motivoVis;
	@Column (name="OBSERVACION_VISITA")
	private String observacionVis;
	@Column (name="EMPRESA_RUT_EMPRESA")
	private String rutEmp;
	@Column (name="PROFESIONALES_RUT_PROFESIONAL")
	private String profesionalesRut;
	
	public VisitaEntity(int idVisita, String motivoVis, String observacionVis, String rutEmp, String profesionalesRut) {
		super();
		this.idVisita = idVisita;
		this.motivoVis = motivoVis;
		this.observacionVis = observacionVis;
		this.rutEmp = rutEmp;
		this.profesionalesRut = profesionalesRut;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public String getMotivoVis() {
		return motivoVis;
	}

	public void setMotivoVis(String motivoVis) {
		this.motivoVis = motivoVis;
	}

	public String getObservacionVis() {
		return observacionVis;
	}

	public void setObservacionVis(String observacionVis) {
		this.observacionVis = observacionVis;
	}

	public String getRutEmp() {
		return rutEmp;
	}

	public void setRutEmp(String rutEmp) {
		this.rutEmp = rutEmp;
	}

	public String getProfesionalesRut() {
		return profesionalesRut;
	}

	public void setProfesionalesRut(String profesionalesRut) {
		this.profesionalesRut = profesionalesRut;
	}

	@Override
	public String toString() {
		return "VisitaEntity [idVisita=" + idVisita + ", motivoVis=" + motivoVis + ", observacionVis=" + observacionVis
				+ ", rutEmp=" + rutEmp + ", profesionalesRut=" + profesionalesRut + "]";
	}
	
	

}
