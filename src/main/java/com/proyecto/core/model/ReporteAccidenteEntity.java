package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="REPORTE_ACCIDENTE")
public class ReporteAccidenteEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="ID_REP_ACC")
	private int idReporteAcc;
	@Column (name="TIPO_ACCIDENTE")
	private String tipoAcc;
	@Column (name="DESCRIPCION_ACCIDENTE")
	private String descripcionAcc;
	@Column (name="EMPRESA_RUT_EMPRESA")
	private String rutEmp;
	@Column (name="REPRESENTANTE_RUT_REPRES")
	private String representanteRut;
	
	public ReporteAccidenteEntity() {
		
	}
	
	public ReporteAccidenteEntity(int idReporteAcc, String tipoAcc, String descripcionAcc, String rutEmp,
			String representanteRut) {
		super();
		this.idReporteAcc = idReporteAcc;
		this.tipoAcc = tipoAcc;
		this.descripcionAcc = descripcionAcc;
		this.rutEmp = rutEmp;
		this.representanteRut = representanteRut;
	}

	public int getIdReporteAcc() {
		return idReporteAcc;
	}

	public void setIdReporteAcc(int idReporteAcc) {
		this.idReporteAcc = idReporteAcc;
	}

	public String getTipoAcc() {
		return tipoAcc;
	}

	public void setTipoAcc(String tipoAcc) {
		this.tipoAcc = tipoAcc;
	}

	public String getDescripcionAcc() {
		return descripcionAcc;
	}

	public void setDescripcionAcc(String descripcionAcc) {
		this.descripcionAcc = descripcionAcc;
	}

	public String getRutEmp() {
		return rutEmp;
	}

	public void setRutEmp(String rutEmp) {
		this.rutEmp = rutEmp;
	}

	public String getRepresentanteRut() {
		return representanteRut;
	}

	public void setRepresentanteRut(String representanteRut) {
		this.representanteRut = representanteRut;
	}

	@Override
	public String toString() {
		return "ReporteAccidenteEntity [idReporteAcc=" + idReporteAcc + ", tipoAcc=" + tipoAcc + ", descripcionAcc="
				+ descripcionAcc + ", rutEmp=" + rutEmp + ", representanteRut=" + representanteRut + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idReporteAcc;
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
		ReporteAccidenteEntity other = (ReporteAccidenteEntity) obj;
		if (idReporteAcc != other.idReporteAcc)
			return false;
		return true;
	}
	
	
	

}
