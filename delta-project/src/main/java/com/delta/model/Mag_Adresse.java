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
@Table(name = "Mag_Adresse")
public class Mag_Adresse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Mag_Adr_Id;
	
	@Column(name = "No_Mag")
	@NotNull
	private String No_Mag;
	
	@Column(name = "Libelle")
	private String Libelle;
	
	@Column(name = "Pays")
	private String Pays;
	
	@Column(name = "Ville")
	@NotNull
	private String Ville;
	
	@Column(name = "CP")
	@NotNull
	private String CP;
	
	@Column(name = "Adresse")
	@NotNull
	private String Adresse;
	
	@Column(name = "Numero")
	@NotNull
	private String Numero;
	
	@Column(name = "No_Complement")
	@NotNull
	private String No_Complement;
	
	@Column(name = "Date_Crea")
	@NotNull
	private Date Date_Crea;

	
	
	public Mag_Adresse(int mag_Adr_Id, String no_Mag, String libelle, String pays, String ville, String cP,
			String adresse, String numero, String no_Complement, Date date_Crea) {
		super();
		Mag_Adr_Id = mag_Adr_Id;
		No_Mag = no_Mag;
		Libelle = libelle;
		Pays = pays;
		Ville = ville;
		CP = cP;
		Adresse = adresse;
		Numero = numero;
		No_Complement = no_Complement;
		Date_Crea = date_Crea;
	}

	public Mag_Adresse() {
		super();
	}

	
	public int getMag_Adr_Id() {
		return Mag_Adr_Id;
	}

	public void setMag_Adr_Id(int mag_Adr_Id) {
		Mag_Adr_Id = mag_Adr_Id;
	}

	public String getNo_Mag() {
		return No_Mag;
	}

	public void setNo_Mag(String no_Mag) {
		No_Mag = no_Mag;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public String getPays() {
		return Pays;
	}

	public void setPays(String pays) {
		Pays = pays;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

	public String getCP() {
		return CP;
	}

	public void setCP(String cP) {
		CP = cP;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public String getNo_Complement() {
		return No_Complement;
	}

	public void setNo_Complement(String no_Complement) {
		No_Complement = no_Complement;
	}

	public Date getDate_Crea() {
		return Date_Crea;
	}

	public void setDate_Crea(Date date_Crea) {
		Date_Crea = date_Crea;
	}
	
}
