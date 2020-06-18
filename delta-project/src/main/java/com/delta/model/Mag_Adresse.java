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
	
	@Column(name = "no_mag")
	@NotNull
	private String no_mag;
	
	@Column(name = "libelle")
	private String libelle;
	
	@Column(name = "pays")
	private String pays;
	
	@Column(name = "ville")
	@NotNull
	private String ville;
	
	@Column(name = "cp")
	@NotNull
	private String cp;
	
	@Column(name = "adresse")
	@NotNull
	private String adresse;
	
	@Column(name = "numero")
	@NotNull
	private String numero;
	
	@Column(name = "no_complement")
	@NotNull
	private String no_complement;
	
	@Column(name = "date_crea")
	@NotNull
	private Date date_crea;

	
	
	public Mag_Adresse(int mag_Adr_Id, String no_Mag, String libelle, String pays, String ville, String cP,
			String adresse, String numero, String no_Complement, Date date_Crea) {
		super();
		this.Mag_Adr_Id = mag_Adr_Id;
		this.no_mag = no_Mag;
		this.libelle = libelle;
		this.pays = pays;
		this.ville = ville;
		this.cp = cP;
		this.adresse = adresse;
		this.numero = numero;
		this.no_complement = no_Complement;
		this.date_crea = date_Crea;
	}

	public Mag_Adresse() {
		super();
	}

	
	public int getMag_Adr_Id() {
		return Mag_Adr_Id;
	}

	public void setMag_Adr_Id(int mag_Adr_Id) {
		this.Mag_Adr_Id = mag_Adr_Id;
	}

	public String getNo_Mag() {
		return no_mag;
	}

	public void setNo_Mag(String no_Mag) {
		this.no_mag = no_Mag;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCP() {
		return cp;
	}

	public void setCP(String cP) {
		this.cp = cP;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNo_Complement() {
		return no_complement;
	}

	public void setNo_Complement(String no_Complement) {
		this.no_complement = no_Complement;
	}

	public Date getDate_Crea() {
		return date_crea;
	}

	public void setDate_Crea(Date date_Crea) {
		this.date_crea = date_Crea;
	}
	
}
