package com.proyecto.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CHECKLIST")
public class CheckListEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="ID_CHECKLIST")
	private int idChecklist;
	@Column(name="ID_INS")
	private int idIns;
	@Column(name="CONFIRMACION_CHECKLIST")
	private String confirmacionChecklist;
	
	public CheckListEntity() {
	}

	public CheckListEntity(int idChecklist, int idIns, String confirmacionChecklist) {
		super();
		this.idChecklist = idChecklist;
		this.idIns = idIns;
		this.confirmacionChecklist = confirmacionChecklist;
	}

	public int getIdChecklist() {
		return idChecklist;
	}

	public void setIdChecklist(int idChecklist) {
		this.idChecklist = idChecklist;
	}

	public int getIdIns() {
		return idIns;
	}

	public void setIdIns(int idIns) {
		this.idIns = idIns;
	}

	public String getConfirmacionChecklist() {
		return confirmacionChecklist;
	}

	public void setConfirmacionChecklist(String confirmacionChecklist) {
		this.confirmacionChecklist = confirmacionChecklist;
	}

	@Override
	public String toString() {
		return "CheckList [idChecklist=" + idChecklist + ", idIns=" + idIns + ", confirmacionChecklist="
				+ confirmacionChecklist + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idChecklist;
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
		CheckListEntity other = (CheckListEntity) obj;
		if (idChecklist != other.idChecklist)
			return false;
		return true;
	}
	
	

}
