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
	
	@Column(name = "langue")
	@NotNull
	private String langue;
	
	@Column(name = "libelle")
	private String libelle;
	
	@Column(name = "mag_adr_id")
	private String mag_adr_id;
	
	@Column(name = "email")
	@NotNull
	private String email;
	
	@Column(name = "livraison")
	@NotNull
	private char livraison;
	
	@Column(name = "precommande")
	@NotNull
	private char precommande;
	
	@Column(name = "date_crea")
	@NotNull
	private Date date_crea;
	
	@Column(name = "date_ouv_public")
	@NotNull
	private Date date_ouv_public;
	
	@Column(name = "date_ferm_public")
	@NotNull
	private Date date_ferm_public;

	public Magasin(int no_Mag, String langue, String libelle, String mag_Adr_Id, String email, char livraison,
			char precommande, Date date_Crea, Date date_Ouv_Public, Date date_Ferm_Public) {
		super();
		this.No_Mag = no_Mag;
		this.langue = langue;
		this.libelle = libelle;
		this.mag_adr_id = mag_Adr_Id;
		this.email = email;
		this.livraison = livraison;
		this.precommande = precommande;
		this.date_crea = date_Crea;
		this.date_ouv_public = date_Ouv_Public;
		this.date_ferm_public = date_Ferm_Public;
	}

	public Magasin() {
		super();
	}

	public int getNo_Mag() {
		return No_Mag;
	}

	public void setNo_Mag(int no_Mag) {
		this.No_Mag = no_Mag;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getMag_Adr_Id() {
		return mag_adr_id;
	}

	public void setMag_Adr_Id(String mag_Adr_Id) {
		this.mag_adr_id = mag_Adr_Id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getLivraison() {
		return livraison;
	}

	public void setLivraison(char livraison) {
		this.livraison = livraison;
	}

	public char getPrecommande() {
		return precommande;
	}

	public void setPrecommande(char precommande) {
		this.precommande = precommande;
	}

	public Date getDate_Crea() {
		return date_crea;
	}

	public void setDate_Crea(Date date_Crea) {
		this.date_crea = date_Crea;
	}

	public Date getDate_Ouv_Public() {
		return date_ouv_public;
	}

	public void setDate_Ouv_Public(Date date_Ouv_Public) {
		this.date_ouv_public = date_Ouv_Public;
	}

	public Date getDate_Ferm_Public() {
		return date_ferm_public;
	}

	public void setDate_Ferm_Public(Date date_Ferm_Public) {
		this.date_ferm_public = date_Ferm_Public;
	}
	
}