package com.delta.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Ope_Com")
public class Ope_Com {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Ope_Id;
	
	@Column(name = "libelle")
	private String libelle;
	
	@Column(name = "date_deb")
	private Date date_deb;
	
	@Column(name = "date_fin")
	@NotNull
	private Date date_fin;

	
	
	public Ope_Com(int ope_Id, String libelle, Date date_Deb, Date date_Fin) {
		super();
		this.Ope_Id = ope_Id;
		this.libelle = libelle;
		this.date_deb = date_Deb;
		this.date_fin = date_Fin;
	}

	public Ope_Com() {
		super();
	}

	
	
	public int getOpe_Id() {
		return Ope_Id;
	}

	public void setOpe_Id(int ope_Id) {
		this.Ope_Id = ope_Id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Date getDate_Deb() {
		return date_deb;
	}

	public void setDate_Deb(Date date_Deb) {
		this.date_deb = date_Deb;
	}

	public Date getDate_Fin() {
		return date_fin;
	}

	public void setDate_Fin(Date date_Fin) {
		this.date_fin = date_Fin;
	}
}
