package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="REVISION_MEJORA")
public class RevisionMejoraEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="ID_REV_MEJ")
	private int idRevMej;
	@Column (name="CUMPLIMIENTO_REVISION_MEJORA")
	private String cumplimientoRevMej;
	@Column (name="OBSERVACIONES_REVISION_MEJORA")
	private String observacionesRevMej;
	@Column (name="ACTIVIDAD_MEJORA_ID_ACT_MEJ")
	private String actividadMejoraIdActMej;
	@Column (name="PROFESIONALES_RUT_PROFESIONAL")
	private String profesionalesRut;
	
	public RevisionMejoraEntity(int idRevMej, String cumplimientoRevMej, String observacionesRevMej,
			String actividadMejoraIdActMej, String profesionalesRut) {
		super();
		this.idRevMej = idRevMej;
		this.cumplimientoRevMej = cumplimientoRevMej;
		this.observacionesRevMej = observacionesRevMej;
		this.actividadMejoraIdActMej = actividadMejoraIdActMej;
		this.profesionalesRut = profesionalesRut;
	}

	public int getIdRevMej() {
		return idRevMej;
	}

	public void setIdRevMej(int idRevMej) {
		this.idRevMej = idRevMej;
	}

	public String getCumplimientoRevMej() {
		return cumplimientoRevMej;
	}

	public void setCumplimientoRevMej(String cumplimientoRevMej) {
		this.cumplimientoRevMej = cumplimientoRevMej;
	}

	public String getObservacionesRevMej() {
		return observacionesRevMej;
	}

	public void setObservacionesRevMej(String observacionesRevMej) {
		this.observacionesRevMej = observacionesRevMej;
	}

	public String getActividadMejoraIdActMej() {
		return actividadMejoraIdActMej;
	}

	public void setActividadMejoraIdActMej(String actividadMejoraIdActMej) {
		this.actividadMejoraIdActMej = actividadMejoraIdActMej;
	}

	public String getProfesionalesRut() {
		return profesionalesRut;
	}

	public void setProfesionalesRut(String profesionalesRut) {
		this.profesionalesRut = profesionalesRut;
	}

	@Override
	public String toString() {
		return "RevisionMejoraEntity [idRevMej=" + idRevMej + ", cumplimientoRevMej=" + cumplimientoRevMej
				+ ", observacionesRevMej=" + observacionesRevMej + ", actividadMejoraIdActMej="
				+ actividadMejoraIdActMej + ", profesionalesRut=" + profesionalesRut + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idRevMej;
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
		RevisionMejoraEntity other = (RevisionMejoraEntity) obj;
		if (idRevMej != other.idRevMej)
			return false;
		return true;
	}
	
	
	

}
