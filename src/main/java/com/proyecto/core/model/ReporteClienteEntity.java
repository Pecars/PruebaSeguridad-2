package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="REPORTE_CLIENTE")
public class ReporteClienteEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="ID_REP_CLI")
	private int idReporteCliente;
	@Column (name="INICIO_PERIODO_REPORTE")
	private String inicioPeriodoRep;
	@Column (name="FIN_PERIODO_REPORTE")
	private String finPeriodoRep;
	@Column (name="ACCIDENTES_PERIODO")
	private String accPeriodo;
	@Column (name="TASA_ACCIDENTABILIDAD")
	private String tasaAcc;
	@Column (name="CAPACITACIONES_PERIODO")
	private String capPeriodo;
	@Column (name="ASESORIAS_PERIODO")
	private String asesoriasPeriodo;
	@Column (name="VISITAS_PERIODO")
	private String visitasPeriodo;
	@Column (name="ACTIVIDADES_MEJORA_PERIODO")
	private String actividadesMejoraPeriodo;
	@Column (name="EMPRESA_RUT_EMPRESA")
	private String empresaRut;
	@Column (name="ADMINISTRADOR_RUT_ADMIN")
	private String adminRut;
	
	public ReporteClienteEntity(int idReporteCliente, String inicioPeriodoRep, String finPeriodoRep, String accPeriodo,
			String tasaAcc, String capPeriodo, String asesoriasPeriodo, String visitasPeriodo,
			String actividadesMejoraPeriodo, String empresaRut, String adminRut) {
		super();
		this.idReporteCliente = idReporteCliente;
		this.inicioPeriodoRep = inicioPeriodoRep;
		this.finPeriodoRep = finPeriodoRep;
		this.accPeriodo = accPeriodo;
		this.tasaAcc = tasaAcc;
		this.capPeriodo = capPeriodo;
		this.asesoriasPeriodo = asesoriasPeriodo;
		this.visitasPeriodo = visitasPeriodo;
		this.actividadesMejoraPeriodo = actividadesMejoraPeriodo;
		this.empresaRut = empresaRut;
		this.adminRut = adminRut;
	}

	public int getIdReporteCliente() {
		return idReporteCliente;
	}

	public void setIdReporteCliente(int idReporteCliente) {
		this.idReporteCliente = idReporteCliente;
	}

	public String getInicioPeriodoRep() {
		return inicioPeriodoRep;
	}

	public void setInicioPeriodoRep(String inicioPeriodoRep) {
		this.inicioPeriodoRep = inicioPeriodoRep;
	}

	public String getFinPeriodoRep() {
		return finPeriodoRep;
	}

	public void setFinPeriodoRep(String finPeriodoRep) {
		this.finPeriodoRep = finPeriodoRep;
	}

	public String getAccPeriodo() {
		return accPeriodo;
	}

	public void setAccPeriodo(String accPeriodo) {
		this.accPeriodo = accPeriodo;
	}

	public String getTasaAcc() {
		return tasaAcc;
	}

	public void setTasaAcc(String tasaAcc) {
		this.tasaAcc = tasaAcc;
	}

	public String getCapPeriodo() {
		return capPeriodo;
	}

	public void setCapPeriodo(String capPeriodo) {
		this.capPeriodo = capPeriodo;
	}

	public String getAsesoriasPeriodo() {
		return asesoriasPeriodo;
	}

	public void setAsesoriasPeriodo(String asesoriasPeriodo) {
		this.asesoriasPeriodo = asesoriasPeriodo;
	}

	public String getVisitasPeriodo() {
		return visitasPeriodo;
	}

	public void setVisitasPeriodo(String visitasPeriodo) {
		this.visitasPeriodo = visitasPeriodo;
	}

	public String getActividadesMejoraPeriodo() {
		return actividadesMejoraPeriodo;
	}

	public void setActividadesMejoraPeriodo(String actividadesMejoraPeriodo) {
		this.actividadesMejoraPeriodo = actividadesMejoraPeriodo;
	}

	public String getEmpresaRut() {
		return empresaRut;
	}

	public void setEmpresaRut(String empresaRut) {
		this.empresaRut = empresaRut;
	}

	public String getAdminRut() {
		return adminRut;
	}

	public void setAdminRut(String adminRut) {
		this.adminRut = adminRut;
	}

	@Override
	public String toString() {
		return "ReporteClienteEntity [idReporteCliente=" + idReporteCliente + ", inicioPeriodoRep=" + inicioPeriodoRep
				+ ", finPeriodoRep=" + finPeriodoRep + ", accPeriodo=" + accPeriodo + ", tasaAcc=" + tasaAcc
				+ ", capPeriodo=" + capPeriodo + ", asesoriasPeriodo=" + asesoriasPeriodo + ", visitasPeriodo="
				+ visitasPeriodo + ", actividadesMejoraPeriodo=" + actividadesMejoraPeriodo + ", empresaRut="
				+ empresaRut + ", adminRut=" + adminRut + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idReporteCliente;
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
		ReporteClienteEntity other = (ReporteClienteEntity) obj;
		if (idReporteCliente != other.idReporteCliente)
			return false;
		return true;
	}
	
	
	
	

}
