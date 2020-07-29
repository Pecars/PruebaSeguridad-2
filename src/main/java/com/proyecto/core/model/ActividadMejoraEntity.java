package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACTIVIDAD_MEJORA")
public class ActividadMejoraEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="ID_ACT_MEJ")
	private int idActividadMejora;
	@Column (name="PROBLEMA_DETECTADO")
	private String problemaDet;
	@Column (name="MEJORA_PROPUESTA")
	private String mejoraPro;
	@Column (name="EMPRESA_RUT_EMPRESA")
	private String rutEmp;
	@Column (name="PROFESIONALES_RUT_PROF")
	private String rutProf;
	
	
	public ActividadMejoraEntity(int idActividadMejora, String problemaDet, String mejoraPro, String rutEmp,
			String rutProf) {
		super();
		this.idActividadMejora = idActividadMejora;
		this.problemaDet = problemaDet;
		this.mejoraPro = mejoraPro;
		this.rutEmp = rutEmp;
		this.rutProf = rutProf;
	}


	public int getIdActividadMejora() {
		return idActividadMejora;
	}


	public void setIdActividadMejora(int idActividadMejora) {
		this.idActividadMejora = idActividadMejora;
	}


	public String getProblemaDet() {
		return problemaDet;
	}


	public void setProblemaDet(String problemaDet) {
		this.problemaDet = problemaDet;
	}


	public String getMejoraPro() {
		return mejoraPro;
	}


	public void setMejoraPro(String mejoraPro) {
		this.mejoraPro = mejoraPro;
	}


	public String getRutEmp() {
		return rutEmp;
	}


	public void setRutEmp(String rutEmp) {
		this.rutEmp = rutEmp;
	}


	public String getRutProf() {
		return rutProf;
	}


	public void setRutProf(String rutProf) {
		this.rutProf = rutProf;
	}


	@Override
	public String toString() {
		return "ActividadMejoraEntity [idActividadMejora=" + idActividadMejora + ", problemaDet=" + problemaDet
				+ ", mejoraPro=" + mejoraPro + ", rutEmp=" + rutEmp + ", rutProf=" + rutProf + "]";
	}
	
	
	

}
