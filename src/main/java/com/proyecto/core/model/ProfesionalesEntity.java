package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="PROFESIONALES")
public class ProfesionalesEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	@Column (name="ID_PRO")
	private int idPro;
	@Column (name="NOMBRE_PROFESIONAL")
	private String nombrePro;
	@Column (name="APELLIDO_PROFESIONAL")
	private String apellidoPro;
	@Column (name="RUT_PROFESIONAL")
	private String rutPro;
	@Column (name="DEPARTAMENTO_PROFESIONAL")
	private String deptPro;
	@Column (name="TELEFONO_PROFESIONAL")
	private String telPro;
	@Column (name="CORREO_PROFESIONAL")
	private String correoPro;
	@Column (name="CARGO_PROFESIONAL")
	private String cargoPro;
	@Column (name="PROFESION_PROFESIONAL")
	private String profesionPro;
	@Column (name="FECHA_INGRESO_PROFESIONAL")
	private String fechaIngresoPro;
	@Column (name="USUARIO_PROFESIONAL")
	private String usuarioPro;
	@Column (name="CLAVE_PROFESIONAL")
	private String clavePro;
	@Column (name="ADMINISTRADOR_RUT_ADMIN")
	private String admRut;
	
	public ProfesionalesEntity(int idPro, String nombrePro, String apellidoPro, String rutPro, String deptPro,
			String telPro, String correoPro, String cargoPro, String profesionPro, String fechaIngresoPro,
			String usuarioPro, String clavePro, String admRut) {
		super();
		this.idPro = idPro;
		this.nombrePro = nombrePro;
		this.apellidoPro = apellidoPro;
		this.rutPro = rutPro;
		this.deptPro = deptPro;
		this.telPro = telPro;
		this.correoPro = correoPro;
		this.cargoPro = cargoPro;
		this.profesionPro = profesionPro;
		this.fechaIngresoPro = fechaIngresoPro;
		this.usuarioPro = usuarioPro;
		this.clavePro = clavePro;
		this.admRut = admRut;
	}

	public int getIdPro() {
		return idPro;
	}

	public void setIdPro(int idPro) {
		this.idPro = idPro;
	}

	public String getNombrePro() {
		return nombrePro;
	}

	public void setNombrePro(String nombrePro) {
		this.nombrePro = nombrePro;
	}

	public String getApellidoPro() {
		return apellidoPro;
	}

	public void setApellidoPro(String apellidoPro) {
		this.apellidoPro = apellidoPro;
	}

	public String getRutPro() {
		return rutPro;
	}

	public void setRutPro(String rutPro) {
		this.rutPro = rutPro;
	}

	public String getDeptPro() {
		return deptPro;
	}

	public void setDeptPro(String deptPro) {
		this.deptPro = deptPro;
	}

	public String getTelPro() {
		return telPro;
	}

	public void setTelPro(String telPro) {
		this.telPro = telPro;
	}

	public String getCorreoPro() {
		return correoPro;
	}

	public void setCorreoPro(String correoPro) {
		this.correoPro = correoPro;
	}

	public String getCargoPro() {
		return cargoPro;
	}

	public void setCargoPro(String cargoPro) {
		this.cargoPro = cargoPro;
	}

	public String getProfesionPro() {
		return profesionPro;
	}

	public void setProfesionPro(String profesionPro) {
		this.profesionPro = profesionPro;
	}

	public String getFechaIngresoPro() {
		return fechaIngresoPro;
	}

	public void setFechaIngresoPro(String fechaIngresoPro) {
		this.fechaIngresoPro = fechaIngresoPro;
	}

	public String getUsuarioPro() {
		return usuarioPro;
	}

	public void setUsuarioPro(String usuarioPro) {
		this.usuarioPro = usuarioPro;
	}

	public String getClavePro() {
		return clavePro;
	}

	public void setClavePro(String clavePro) {
		this.clavePro = clavePro;
	}

	public String getAdmRut() {
		return admRut;
	}

	public void setAdmRut(String admRut) {
		this.admRut = admRut;
	}

	@Override
	public String toString() {
		return "ProfesionalesEntity [idPro=" + idPro + ", nombrePro=" + nombrePro + ", apellidoPro=" + apellidoPro
				+ ", rutPro=" + rutPro + ", deptPro=" + deptPro + ", telPro=" + telPro + ", correoPro=" + correoPro
				+ ", cargoPro=" + cargoPro + ", profesionPro=" + profesionPro + ", fechaIngresoPro=" + fechaIngresoPro
				+ ", usuarioPro=" + usuarioPro + ", clavePro=" + clavePro + ", admRut=" + admRut + "]";
	}
	
	

}
