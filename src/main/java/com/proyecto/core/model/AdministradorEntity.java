package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMINISTRADOR")
public class AdministradorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_ADM")
	private int idAdm;
	@Column (name="USUARIO_ADMINISTRADOR")
	private String usuarioAdm;
	@Column (name="CLAVE_ADMINISTRADOR")
	private String claveAdm;
	@Column (name="NOMBRE_ADMINISTRADOR")
	private String nombreAdm;
	@Column (name="TELEFONO_ADMINISTRADOR")
	private String telAdm;
	@Column (name="CORREO_ADMINISTRADOR")
	private String correoAdm;
	@Column (name="RUT_ADMINISTRADOR")
	private String rutAdm;
	
	public AdministradorEntity(int idAdm, String usuarioAdm, String claveAdm, String nombreAdm, String telAdm,
			String correoAdm, String rutAdm) {
		super();
		this.idAdm = idAdm;
		this.usuarioAdm = usuarioAdm;
		this.claveAdm = claveAdm;
		this.nombreAdm = nombreAdm;
		this.telAdm = telAdm;
		this.correoAdm = correoAdm;
		this.rutAdm = rutAdm;
	}

	public int getIdAdm() {
		return idAdm;
	}

	public void setIdAdm(int idAdm) {
		this.idAdm = idAdm;
	}

	public String getUsuarioAdm() {
		return usuarioAdm;
	}

	public void setUsuarioAdm(String usuarioAdm) {
		this.usuarioAdm = usuarioAdm;
	}

	public String getClaveAdm() {
		return claveAdm;
	}

	public void setClaveAdm(String claveAdm) {
		this.claveAdm = claveAdm;
	}

	public String getNombreAdm() {
		return nombreAdm;
	}

	public void setNombreAdm(String nombreAdm) {
		this.nombreAdm = nombreAdm;
	}

	public String getTelAdm() {
		return telAdm;
	}

	public void setTelAdm(String telAdm) {
		this.telAdm = telAdm;
	}

	public String getCorreoAdm() {
		return correoAdm;
	}

	public void setCorreoAdm(String correoAdm) {
		this.correoAdm = correoAdm;
	}

	public String getRutAdm() {
		return rutAdm;
	}

	public void setRutAdm(String rutAdm) {
		this.rutAdm = rutAdm;
	}

	@Override
	public String toString() {
		return "AdministradorEntity [idAdm=" + idAdm + ", usuarioAdm=" + usuarioAdm + ", claveAdm=" + claveAdm
				+ ", nombreAdm=" + nombreAdm + ", telAdm=" + telAdm + ", correoAdm=" + correoAdm + ", rutAdm=" + rutAdm
				+ "]";
	}
	
	

}
