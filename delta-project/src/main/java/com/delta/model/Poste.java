package com.delta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Poste")
public class Poste {

	@Column(name = "No_Poste")
	@NotNull
	private Integer No_Poste;
	
	@Column(name = "Poste_Lib")
	@NotNull
	private Integer Poste_Lib;

	
	
	public Poste(Integer no_Poste, Integer poste_Lib) {
		super();
		No_Poste = no_Poste;
		Poste_Lib = poste_Lib;
	}

	public Poste() {
		super();
	}

	
	
	public Integer getNo_Poste() {
		return No_Poste;
	}

	public void setNo_Poste(Integer no_Poste) {
		No_Poste = no_Poste;
	}

	public Integer getPoste_Lib() {
		return Poste_Lib;
	}

	public void setPoste_Lib(Integer poste_Lib) {
		Poste_Lib = poste_Lib;
	}
	
}