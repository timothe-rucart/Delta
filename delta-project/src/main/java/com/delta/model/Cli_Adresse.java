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
	
	@Column(name = "prenom")
	@NotNull
	private String prenom;
	
	@Column(name = "nom")
	@NotNull
	private String nom;
	
	@Column(name = "libelle")
	private String libelle;
	
	@Column(name = "pays")
	@NotNull
	private Date pays;
	
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
	private String no_complement;
	
	@Column(name = "commentaire")
	private String commentaire;
	
	@Column(name = "date_crea")
	@NotNull
	private Date date_crea;

	public Cli_Adresse(int adr_Id, String prenom, String nom, String libelle, Date pays, String ville, String cP,
			String adresse, String numero, String no_Complement, String commentaire, Date date_Crea) {
		super();
		this.Adr_Id = adr_Id;
		this.prenom = prenom;
		this.nom = nom;
		this.libelle = libelle;
		this.pays = pays;
		this.ville = ville;
		this.cp = cP;
		this.adresse = adresse;
		this.numero = numero;
		this.no_complement = no_Complement;
		this.commentaire = commentaire;
		this.date_crea = date_Crea;
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
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Date getPays() {
		return pays;
	}

	public void setPays(Date pays) {
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

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Date getDate_Crea() {
		return date_crea;
	}

	public void setDate_Crea(Date date_Crea) {
		this.date_crea = date_Crea;
	}
	
}
