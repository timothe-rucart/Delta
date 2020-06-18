package com.delta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Poste")
public class Poste{

	@Id
	@Column(name = "no_poste")
	private long no_poste;
	
	@Column(name = "libelle")
	private String libelle;

	public Poste(long no_poste, String lib) {
		super();
		this.no_poste = no_poste;
		this.libelle = lib;
	}

	public Poste() {
		super();
	}

	public long getNo_Poste() {
		return no_poste;
	}

	public void setNo_Poste(long no_poste) {
		this.no_poste = no_poste;
	}

	public String getLib() {
		return libelle;
	}

	public void setLib(String lib) {
		this.libelle = lib;
	}
	
//	@Column(name = "Date_Maj")
//	private Timestamp Date_Maj;

}