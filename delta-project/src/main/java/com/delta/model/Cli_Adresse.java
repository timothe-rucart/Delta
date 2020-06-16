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
@Table(name = "Cli_Adresse")
public class Cli_Adresse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Adr_Id;
	
	@Column(name = "Prenom")
	@NotNull
	private String Prenom;
	
	@Column(name = "Nom")
	@NotNull
	private String Nom;
	
	@Column(name = "Libelle")
	private String Libelle;
	
	@Column(name = "Pays")
	@NotNull
	private Date Pays;
	
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
	private String No_Complement;
	
	@Column(name = "Commentaire")
	private String Commentaire;
	
	@Column(name = "Date_Crea")
	@NotNull
	private Date Date_Crea;

	public Cli_Adresse(int adr_Id, String prenom, String nom, String libelle, Date pays, String ville, String cP,
			String adresse, String numero, String no_Complement, String commentaire, Date date_Crea) {
		super();
		Adr_Id = adr_Id;
		Prenom = prenom;
		Nom = nom;
		Libelle = libelle;
		Pays = pays;
		Ville = ville;
		CP = cP;
		Adresse = adresse;
		Numero = numero;
		No_Complement = no_Complement;
		Commentaire = commentaire;
		Date_Crea = date_Crea;
	}

	public Cli_Adresse() {
		super();
	}

	
	public int getAdr_Id() {
		return Adr_Id;
	}

	public void setAdr_Id(int adr_Id) {
		Adr_Id = adr_Id;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public Date getPays() {
		return Pays;
	}

	public void setPays(Date pays) {
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

	public String getCommentaire() {
		return Commentaire;
	}

	public void setCommentaire(String commentaire) {
		Commentaire = commentaire;
	}

	public Date getDate_Crea() {
		return Date_Crea;
	}

	public void setDate_Crea(Date date_Crea) {
		Date_Crea = date_Crea;
	}
	
}
