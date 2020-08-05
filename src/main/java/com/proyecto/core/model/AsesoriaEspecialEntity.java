package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ASESORIA_ESPECIAL")
public class AsesoriaEspecialEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_ASESORIA_ESPECIAL")
	private int idAsesoriaEspecial;
	@Column(name="RUT_EMPRESA")
	private String rutEmpresa;
	@Column(name="TIPO_ASESORIA")
	private String tipoAsesoria;
	@Column(name="OBSER_SOLIC_ESPECIAL")
	private String obserSolicEspecial;
	
	public AsesoriaEspecialEntity() {
	}

	public AsesoriaEspecialEntity(int idAsesoriaEspecial, String rutEmpresa, String tipoAsesoria,
			String obserSolicEspecial) {
		super();
		this.idAsesoriaEspecial = idAsesoriaEspecial;
		this.rutEmpresa = rutEmpresa;
		this.tipoAsesoria = tipoAsesoria;
		this.obserSolicEspecial = obserSolicEspecial;
	}

	public int getIdAsesoriaEspecial() {
		return idAsesoriaEspecial;
	}

	public void setIdAsesoriaEspecial(int idAsesoriaEspecial) {
		this.idAsesoriaEspecial = idAsesoriaEspecial;
	}

	public String getRutEmpresa() {
		return rutEmpresa;
	}

	public void setRutEmpresa(String rutEmpresa) {
		this.rutEmpresa = rutEmpresa;
	}

	public String getTipoAsesoria() {
		return tipoAsesoria;
	}

	public void setTipoAsesoria(String tipoAsesoria) {
		this.tipoAsesoria = tipoAsesoria;
	}

	public String getObserSolicEspecial() {
		return obserSolicEspecial;
	}

	public void setObserSolicEspecial(String obserSolicEspecial) {
		this.obserSolicEspecial = obserSolicEspecial;
	}

	@Override
	public String toString() {
		return "AsesoriaEspecialEntity [idAsesoriaEspecial=" + idAsesoriaEspecial + ", rutEmpresa=" + rutEmpresa
				+ ", tipoAsesoria=" + tipoAsesoria + ", obserSolicEspecial=" + obserSolicEspecial + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAsesoriaEspecial;
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
		AsesoriaEspecialEntity other = (AsesoriaEspecialEntity) obj;
		if (idAsesoriaEspecial != other.idAsesoriaEspecial)
			return false;
		return true;
	}

	
	
}
