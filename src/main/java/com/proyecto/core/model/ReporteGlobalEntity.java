package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REPORTE_GLOBAL")
public class ReporteGlobalEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="ID_REPORTE_GLOBAL")
	private int idReporteGlobal;
	@Column(name="EMPRESAS_ATENDIDAS")
	private String empresasAtendidas;
	@Column(name="PROFESIONALES_TOTALES")
	private String profesionalesTotales;
	@Column(name="CAPACITACIONES_CREADAS")
	private String capacitacionesCreadas;
	@Column(name="CAPACITACIONES_AGENDADAS")
	private String capacitacionesAgendadas;
	@Column(name="CAPACITACIONES_EJECUTADAS")
	private String capacitacionesEjecutadas;
	@Column(name="VISITAS_AGENDADAS")
	private int visitasAgendadas;
	@Column(name="VISITAS_EJECUTADAS")
	private int visitasEjecutadas;
	@Column(name="PAGOS_ADEUDADOS")
	private int pagosAdeudados;
	@Column(name="PAGOS_CUMPLIDOS")
	private int pagosCumplidos;
	@Column(name="ACCIDENTES_REPORTADOS")
	private int accidentesReportados;
	@Column(name="ASESORIAS_GENERADAS")
	private int asesoriasGeneradas;
	
	public ReporteGlobalEntity() {
		
	}

	public ReporteGlobalEntity(int idReporteGlobal, String empresasAtendidas, String profesionalesTotales,
			String capacitacionesCreadas, String capacitacionesAgendadas, String capacitacionesEjecutadas,
			int visitasAgendadas, int visitasEjecutadas, int pagosAdeudados, int pagosCumplidos,
			int accidentesReportados, int asesoriasGeneradas) {
		super();
		this.idReporteGlobal = idReporteGlobal;
		this.empresasAtendidas = empresasAtendidas;
		this.profesionalesTotales = profesionalesTotales;
		this.capacitacionesCreadas = capacitacionesCreadas;
		this.capacitacionesAgendadas = capacitacionesAgendadas;
		this.capacitacionesEjecutadas = capacitacionesEjecutadas;
		this.visitasAgendadas = visitasAgendadas;
		this.visitasEjecutadas = visitasEjecutadas;
		this.pagosAdeudados = pagosAdeudados;
		this.pagosCumplidos = pagosCumplidos;
		this.accidentesReportados = accidentesReportados;
		this.asesoriasGeneradas = asesoriasGeneradas;
	}

	public int getIdReporteGlobal() {
		return idReporteGlobal;
	}

	public void setIdReporteGlobal(int idReporteGlobal) {
		this.idReporteGlobal = idReporteGlobal;
	}

	public String getEmpresasAtendidas() {
		return empresasAtendidas;
	}

	public void setEmpresasAtendidas(String empresasAtendidas) {
		this.empresasAtendidas = empresasAtendidas;
	}

	public String getProfesionalesTotales() {
		return profesionalesTotales;
	}

	public void setProfesionalesTotales(String profesionalesTotales) {
		this.profesionalesTotales = profesionalesTotales;
	}

	public String getCapacitacionesCreadas() {
		return capacitacionesCreadas;
	}

	public void setCapacitacionesCreadas(String capacitacionesCreadas) {
		this.capacitacionesCreadas = capacitacionesCreadas;
	}

	public String getCapacitacionesAgendadas() {
		return capacitacionesAgendadas;
	}

	public void setCapacitacionesAgendadas(String capacitacionesAgendadas) {
		this.capacitacionesAgendadas = capacitacionesAgendadas;
	}

	public String getCapacitacionesEjecutadas() {
		return capacitacionesEjecutadas;
	}

	public void setCapacitacionesEjecutadas(String capacitacionesEjecutadas) {
		this.capacitacionesEjecutadas = capacitacionesEjecutadas;
	}

	public int getVisitasAgendadas() {
		return visitasAgendadas;
	}

	public void setVisitasAgendadas(int visitasAgendadas) {
		this.visitasAgendadas = visitasAgendadas;
	}

	public int getVisitasEjecutadas() {
		return visitasEjecutadas;
	}

	public void setVisitasEjecutadas(int visitasEjecutadas) {
		this.visitasEjecutadas = visitasEjecutadas;
	}

	public int getPagosAdeudados() {
		return pagosAdeudados;
	}

	public void setPagosAdeudados(int pagosAdeudados) {
		this.pagosAdeudados = pagosAdeudados;
	}

	public int getPagosCumplidos() {
		return pagosCumplidos;
	}

	public void setPagosCumplidos(int pagosCumplidos) {
		this.pagosCumplidos = pagosCumplidos;
	}

	public int getAccidentesReportados() {
		return accidentesReportados;
	}

	public void setAccidentesReportados(int accidentesReportados) {
		this.accidentesReportados = accidentesReportados;
	}

	public int getAsesoriasGeneradas() {
		return asesoriasGeneradas;
	}

	public void setAsesoriasGeneradas(int asesoriasGeneradas) {
		this.asesoriasGeneradas = asesoriasGeneradas;
	}

	@Override
	public String toString() {
		return "ReporteGlobalEntity [idReporteGlobal=" + idReporteGlobal + ", empresasAtendidas=" + empresasAtendidas
				+ ", profesionalesTotales=" + profesionalesTotales + ", capacitacionesCreadas=" + capacitacionesCreadas
				+ ", capacitacionesAgendadas=" + capacitacionesAgendadas + ", capacitacionesEjecutadas="
				+ capacitacionesEjecutadas + ", visitasAgendadas=" + visitasAgendadas + ", visitasEjecutadas="
				+ visitasEjecutadas + ", pagosAdeudados=" + pagosAdeudados + ", pagosCumplidos=" + pagosCumplidos
				+ ", accidentesReportados=" + accidentesReportados + ", asesoriasGeneradas=" + asesoriasGeneradas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idReporteGlobal;
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
		ReporteGlobalEntity other = (ReporteGlobalEntity) obj;
		if (idReporteGlobal != other.idReporteGlobal)
			return false;
		return true;
	}
	
	
	

}
