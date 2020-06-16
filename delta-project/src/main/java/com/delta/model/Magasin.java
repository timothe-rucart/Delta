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
@Table(name = "Magasin")
public class Magasin {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int No_Mag;
	
	@Column(name = "Langue")
	@NotNull
	private String Langue;
	
	@Column(name = "Libelle")
	private String Libelle;
	
	@Column(name = "Mag_Adr_Id")
	private String Mag_Adr_Id;
	
	@Column(name = "Email")
	@NotNull
	private String Email;
	
	@Column(name = "Livraison")
	@NotNull
	private char Livraison;
	
	@Column(name = "Precommande")
	@NotNull
	private char Precommande;
	
	@Column(name = "Date_Crea")
	@NotNull
	private Date Date_Crea;
	
	@Column(name = "Date_Ouv_Public ")
	@NotNull
	private Date Date_Ouv_Public ;
	
	@Column(name = "Date_Ferm_Public ")
	@NotNull
	private Date Date_Ferm_Public ;

	public Magasin(int no_Mag, String langue, String libelle, String mag_Adr_Id, String email, char livraison,
			char precommande, Date date_Crea, Date date_Ouv_Public, Date date_Ferm_Public) {
		super();
		No_Mag = no_Mag;
		Langue = langue;
		Libelle = libelle;
		Mag_Adr_Id = mag_Adr_Id;
		Email = email;
		Livraison = livraison;
		Precommande = precommande;
		Date_Crea = date_Crea;
		Date_Ouv_Public = date_Ouv_Public;
		Date_Ferm_Public = date_Ferm_Public;
	}

	public Magasin() {
		super();
	}

	public int getNo_Mag() {
		return No_Mag;
	}

	public void setNo_Mag(int no_Mag) {
		No_Mag = no_Mag;
	}

	public String getLangue() {
		return Langue;
	}

	public void setLangue(String langue) {
		Langue = langue;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public String getMag_Adr_Id() {
		return Mag_Adr_Id;
	}

	public void setMag_Adr_Id(String mag_Adr_Id) {
		Mag_Adr_Id = mag_Adr_Id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public char getLivraison() {
		return Livraison;
	}

	public void setLivraison(char livraison) {
		Livraison = livraison;
	}

	public char getPrecommande() {
		return Precommande;
	}

	public void setPrecommande(char precommande) {
		Precommande = precommande;
	}

	public Date getDate_Crea() {
		return Date_Crea;
	}

	public void setDate_Crea(Date date_Crea) {
		Date_Crea = date_Crea;
	}

	public Date getDate_Ouv_Public() {
		return Date_Ouv_Public;
	}

	public void setDate_Ouv_Public(Date date_Ouv_Public) {
		Date_Ouv_Public = date_Ouv_Public;
	}

	public Date getDate_Ferm_Public() {
		return Date_Ferm_Public;
	}

	public void setDate_Ferm_Public(Date date_Ferm_Public) {
		Date_Ferm_Public = date_Ferm_Public;
	}
	
}