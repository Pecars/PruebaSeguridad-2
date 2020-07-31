package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="REPRESENTANTE")
public class RepresentanteEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="ID_REP")
	private int idRep;
	@Column (name="USUARIO_REPRESENTANTE")
	private String UsuarioRep;
	@Column (name="CLAVE_REPRESENTANTE")
	private String claveRep;
	@Column (name="NOMBRE_REPRESENTANTE")
	private String nombreRep;
	@Column (name="TELEFONO_REPRESENTANTE")
	private String telRep;
	@Column (name="CORREO_REPRESENTANTE")
	private String correoRep;
	@Column (name="RUT_REPRESENTANTE")
	private String rutRep;
	@Column (name="EMPRESA_RUT_EMPRESA")
	private String emresaRut;
	
	public RepresentanteEntity(int idRep, String usuarioRep, String claveRep, String nombreRep, String telRep,
			String correoRep, String rutRep, String emresaRut) {
		super();
		this.idRep = idRep;
		UsuarioRep = usuarioRep;
		this.claveRep = claveRep;
		this.nombreRep = nombreRep;
		this.telRep = telRep;
		this.correoRep = correoRep;
		this.rutRep = rutRep;
		this.emresaRut = emresaRut;
	}

	public int getIdRep() {
		return idRep;
	}

	public void setIdRep(int idRep) {
		this.idRep = idRep;
	}

	public String getUsuarioRep() {
		return UsuarioRep;
	}

	public void setUsuarioRep(String usuarioRep) {
		UsuarioRep = usuarioRep;
	}

	public String getClaveRep() {
		return claveRep;
	}

	public void setClaveRep(String claveRep) {
		this.claveRep = claveRep;
	}

	public String getNombreRep() {
		return nombreRep;
	}

	public void setNombreRep(String nombreRep) {
		this.nombreRep = nombreRep;
	}

	public String getTelRep() {
		return telRep;
	}

	public void setTelRep(String telRep) {
		this.telRep = telRep;
	}

	public String getCorreoRep() {
		return correoRep;
	}

	public void setCorreoRep(String correoRep) {
		this.correoRep = correoRep;
	}

	public String getRutRep() {
		return rutRep;
	}

	public void setRutRep(String rutRep) {
		this.rutRep = rutRep;
	}

	public String getEmresaRut() {
		return emresaRut;
	}

	public void setEmresaRut(String emresaRut) {
		this.emresaRut = emresaRut;
	}

	@Override
	public String toString() {
		return "RepresentanteEntity [idRep=" + idRep + ", UsuarioRep=" + UsuarioRep + ", claveRep=" + claveRep
				+ ", nombreRep=" + nombreRep + ", telRep=" + telRep + ", correoRep=" + correoRep + ", rutRep=" + rutRep
				+ ", emresaRut=" + emresaRut + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idRep;
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
		RepresentanteEntity other = (RepresentanteEntity) obj;
		if (idRep != other.idRep)
			return false;
		return true;
	}
	
	

}
