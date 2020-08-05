package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAGO_EMPRESA")
public class PagoEmpresaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_PAGO_EMPRESA")
	private int idPagoEmpresa;
	@Column(name="RUT_EMPRESA")
	private String rutEmpresa;
	@Column(name="MONTO_PAGO")
	private String montoPago;
	@Column(name="FECHA_PAGO")
	private String fechaPago;
	@Column(name="ESTADO")
	private String estado;
	
	public PagoEmpresaEntity() {
		
	}

	public PagoEmpresaEntity(int idPagoEmpresa, String rutEmpresa, String montoPago, String fechaPago, String estado) {
		super();
		this.idPagoEmpresa = idPagoEmpresa;
		this.rutEmpresa = rutEmpresa;
		this.montoPago = montoPago;
		this.fechaPago = fechaPago;
		this.estado = estado;
	}

	public int getIdPagoEmpresa() {
		return idPagoEmpresa;
	}

	public void setIdPagoEmpresa(int idPagoEmpresa) {
		this.idPagoEmpresa = idPagoEmpresa;
	}

	public String getRutEmpresa() {
		return rutEmpresa;
	}

	public void setRutEmpresa(String rutEmpresa) {
		this.rutEmpresa = rutEmpresa;
	}

	public String getMontoPago() {
		return montoPago;
	}

	public void setMontoPago(String montoPago) {
		this.montoPago = montoPago;
	}

	public String getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "PagoEmpresaEntity [idPagoEmpresa=" + idPagoEmpresa + ", rutEmpresa=" + rutEmpresa + ", montoPago="
				+ montoPago + ", fechaPago=" + fechaPago + ", estado=" + estado + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPagoEmpresa;
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
		PagoEmpresaEntity other = (PagoEmpresaEntity) obj;
		if (idPagoEmpresa != other.idPagoEmpresa)
			return false;
		return true;
	}
	
	
	
	

}
