package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="ASESORIA")
public class AsesoriaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name="ID_ASE")
	private int idAse;
	@Column (name="FECHA_ASESORIA_AGENDADA")
	private String fechaAsesoriaAge;
	@Column (name="FECHA_ASESORIA_REALIZADA")
	private String fechaAsesoriaReal;
	@Column (name="ASESORIA_INCLUIDA")
	private String asesoriaInc;
	@Column (name="TIPO_ASESORIA")
	private String tipoAse;
	@Column (name="TEMA_ASESORIA")
	private String temaAse;
	@Column (name="OBSERVACIONES_ASESORIA")
	private String obsAse;
	@Column (name="EMPRESA_RUT_EMPRESA")
	private String empresaRut;
	@Column (name="PROFESIONALES_RUT_PROF")
	private String profesionalRut;
	
	public AsesoriaEntity(int idAse, String fechaAsesoriaAge, String fechaAsesoriaReal, String asesoriaInc,
			String tipoAse, String temaAse, String obsAse, String empresaRut, String profesionalRut) {
		super();
		this.idAse = idAse;
		this.fechaAsesoriaAge = fechaAsesoriaAge;
		this.fechaAsesoriaReal = fechaAsesoriaReal;
		this.asesoriaInc = asesoriaInc;
		this.tipoAse = tipoAse;
		this.temaAse = temaAse;
		this.obsAse = obsAse;
		this.empresaRut = empresaRut;
		this.profesionalRut = profesionalRut;
	}

	public int getIdAse() {
		return idAse;
	}

	public void setIdAse(int idAse) {
		this.idAse = idAse;
	}

	public String getFechaAsesoriaAge() {
		return fechaAsesoriaAge;
	}

	public void setFechaAsesoriaAge(String fechaAsesoriaAge) {
		this.fechaAsesoriaAge = fechaAsesoriaAge;
	}

	public String getFechaAsesoriaReal() {
		return fechaAsesoriaReal;
	}

	public void setFechaAsesoriaReal(String fechaAsesoriaReal) {
		this.fechaAsesoriaReal = fechaAsesoriaReal;
	}

	public String getAsesoriaInc() {
		return asesoriaInc;
	}

	public void setAsesoriaInc(String asesoriaInc) {
		this.asesoriaInc = asesoriaInc;
	}

	public String getTipoAse() {
		return tipoAse;
	}

	public void setTipoAse(String tipoAse) {
		this.tipoAse = tipoAse;
	}

	public String getTemaAse() {
		return temaAse;
	}

	public void setTemaAse(String temaAse) {
		this.temaAse = temaAse;
	}

	public String getObsAse() {
		return obsAse;
	}

	public void setObsAse(String obsAse) {
		this.obsAse = obsAse;
	}

	public String getEmpresaRut() {
		return empresaRut;
	}

	public void setEmpresaRut(String empresaRut) {
		this.empresaRut = empresaRut;
	}

	public String getProfesionalRut() {
		return profesionalRut;
	}

	public void setProfesionalRut(String profesionalRut) {
		this.profesionalRut = profesionalRut;
	}

	@Override
	public String toString() {
		return "AsesoriaEntity [idAse=" + idAse + ", fechaAsesoriaAge=" + fechaAsesoriaAge + ", fechaAsesoriaReal="
				+ fechaAsesoriaReal + ", asesoriaInc=" + asesoriaInc + ", tipoAse=" + tipoAse + ", temaAse=" + temaAse
				+ ", obsAse=" + obsAse + ", empresaRut=" + empresaRut + ", profesionalRut=" + profesionalRut + "]";
	}
	
	

}
