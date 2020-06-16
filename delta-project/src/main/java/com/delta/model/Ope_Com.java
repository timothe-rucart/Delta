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
	
	@Column(name = "Libelle")
	private String Libelle;
	
	@Column(name = "Date_Deb")
	private Date Date_Deb;
	
	@Column(name = "Date_Fin")
	@NotNull
	private Date Date_Fin;

	
	
	public Ope_Com(int ope_Id, String libelle, Date date_Deb, Date date_Fin) {
		super();
		Ope_Id = ope_Id;
		Libelle = libelle;
		Date_Deb = date_Deb;
		Date_Fin = date_Fin;
	}

	public Ope_Com() {
		super();
	}

	
	
	public int getOpe_Id() {
		return Ope_Id;
	}

	public void setOpe_Id(int ope_Id) {
		Ope_Id = ope_Id;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public Date getDate_Deb() {
		return Date_Deb;
	}

	public void setDate_Deb(Date date_Deb) {
		Date_Deb = date_Deb;
	}

	public Date getDate_Fin() {
		return Date_Fin;
	}

	public void setDate_Fin(Date date_Fin) {
		Date_Fin = date_Fin;
	}
}
