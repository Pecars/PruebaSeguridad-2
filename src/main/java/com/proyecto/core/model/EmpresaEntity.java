package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="EMPRESA")
public class EmpresaEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="ID_EMP")
	private int idEmp;
	@Column (name="NOMBRE_EMPRESA")
	private String nombreEmp;
	@Column (name="REPRESENTANTE_EMPRESA")
	private String representanteEmp;
	@Column (name="RUT_EMPRESA")
	private String rutEmp;
	@Column (name="DIRECCION_EMPRESA")
	private String direccionEmp;
	@Column (name="TELEFONO_EMPRESA")
	private String telEmp;
	@Column (name="CORREO_EMPRESA")
	private String correoEmp;
	@Column (name="GIRO_EMPRESA")
	private String giroEmp;
	@Column (name="FECHA_INGRESO_EMPRESA")
	private String fechaIngresoEmp;
	@Column (name="NUMERO_TRABAJADORES_ENERO")
	private int numeroTrabajadoresEne;
	@Column (name="NUMERO_TRABAJADORES_ABRIL")
	private int numeroTrabajadoresAbr;
	@Column (name="NUMERO_TRABAJADORES_JULIO")
	private int numeroTrabajadoresJul;
	@Column (name="NUMERO_TRABAJADORES_SEPTIEMBRE")
	private int numeroTrabajadoresSep;
	@Column (name="TASA_ACCIDENTABILIDAD")
	private String tasaAcc;
	@Column (name="ADMINISTRADOR_RUT_ADMIN")
	private String admRut;
	
	public EmpresaEntity(int idEmp, String nombreEmp, String representanteEmp, String rutEmp, String direccionEmp,
			String telEmp, String correoEmp, String giroEmp, String fechaIngresoEmp, int numeroTrabajadoresEne,
			int numeroTrabajadoresAbr, int numeroTrabajadoresJul, int numeroTrabajadoresSep, String tasaAcc,
			String admRut) {
		super();
		this.idEmp = idEmp;
		this.nombreEmp = nombreEmp;
		this.representanteEmp = representanteEmp;
		this.rutEmp = rutEmp;
		this.direccionEmp = direccionEmp;
		this.telEmp = telEmp;
		this.correoEmp = correoEmp;
		this.giroEmp = giroEmp;
		this.fechaIngresoEmp = fechaIngresoEmp;
		this.numeroTrabajadoresEne = numeroTrabajadoresEne;
		this.numeroTrabajadoresAbr = numeroTrabajadoresAbr;
		this.numeroTrabajadoresJul = numeroTrabajadoresJul;
		this.numeroTrabajadoresSep = numeroTrabajadoresSep;
		this.tasaAcc = tasaAcc;
		this.admRut = admRut;
	}

	public int getIdEmp() {
		return idEmp;
	}

	public void setIdEmp(int idEmp) {
		this.idEmp = idEmp;
	}

	public String getNombreEmp() {
		return nombreEmp;
	}

	public void setNombreEmp(String nombreEmp) {
		this.nombreEmp = nombreEmp;
	}

	public String getRepresentanteEmp() {
		return representanteEmp;
	}

	public void setRepresentanteEmp(String representanteEmp) {
		this.representanteEmp = representanteEmp;
	}

	public String getRutEmp() {
		return rutEmp;
	}

	public void setRutEmp(String rutEmp) {
		this.rutEmp = rutEmp;
	}

	public String getDireccionEmp() {
		return direccionEmp;
	}

	public void setDireccionEmp(String direccionEmp) {
		this.direccionEmp = direccionEmp;
	}

	public String getTelEmp() {
		return telEmp;
	}

	public void setTelEmp(String telEmp) {
		this.telEmp = telEmp;
	}

	public String getCorreoEmp() {
		return correoEmp;
	}

	public void setCorreoEmp(String correoEmp) {
		this.correoEmp = correoEmp;
	}

	public String getGiroEmp() {
		return giroEmp;
	}

	public void setGiroEmp(String giroEmp) {
		this.giroEmp = giroEmp;
	}

	public String getFechaIngresoEmp() {
		return fechaIngresoEmp;
	}

	public void setFechaIngresoEmp(String fechaIngresoEmp) {
		this.fechaIngresoEmp = fechaIngresoEmp;
	}

	public int getNumeroTrabajadoresEne() {
		return numeroTrabajadoresEne;
	}

	public void setNumeroTrabajadoresEne(int numeroTrabajadoresEne) {
		this.numeroTrabajadoresEne = numeroTrabajadoresEne;
	}

	public int getNumeroTrabajadoresAbr() {
		return numeroTrabajadoresAbr;
	}

	public void setNumeroTrabajadoresAbr(int numeroTrabajadoresAbr) {
		this.numeroTrabajadoresAbr = numeroTrabajadoresAbr;
	}

	public int getNumeroTrabajadoresJul() {
		return numeroTrabajadoresJul;
	}

	public void setNumeroTrabajadoresJul(int numeroTrabajadoresJul) {
		this.numeroTrabajadoresJul = numeroTrabajadoresJul;
	}

	public int getNumeroTrabajadoresSep() {
		return numeroTrabajadoresSep;
	}

	public void setNumeroTrabajadoresSep(int numeroTrabajadoresSep) {
		this.numeroTrabajadoresSep = numeroTrabajadoresSep;
	}

	public String getTasaAcc() {
		return tasaAcc;
	}

	public void setTasaAcc(String tasaAcc) {
		this.tasaAcc = tasaAcc;
	}

	public String getAdmRut() {
		return admRut;
	}

	public void setAdmRut(String admRut) {
		this.admRut = admRut;
	}

	@Override
	public String toString() {
		return "EmpresaEntity [idEmp=" + idEmp + ", nombreEmp=" + nombreEmp + ", representanteEmp=" + representanteEmp
				+ ", rutEmp=" + rutEmp + ", direccionEmp=" + direccionEmp + ", telEmp=" + telEmp + ", correoEmp="
				+ correoEmp + ", giroEmp=" + giroEmp + ", fechaIngresoEmp=" + fechaIngresoEmp
				+ ", numeroTrabajadoresEne=" + numeroTrabajadoresEne + ", numeroTrabajadoresAbr="
				+ numeroTrabajadoresAbr + ", numeroTrabajadoresJul=" + numeroTrabajadoresJul
				+ ", numeroTrabajadoresSep=" + numeroTrabajadoresSep + ", tasaAcc=" + tasaAcc + ", admRut=" + admRut
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEmp;
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
		EmpresaEntity other = (EmpresaEntity) obj;
		if (idEmp != other.idEmp)
			return false;
		return true;
	}
	
	
	

}
