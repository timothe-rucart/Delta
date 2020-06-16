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
@Table(name = "Personne")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cli_Id;

	@Column(name = "Adr_Id")
	@NotNull	
	private String Adr_Id;

	@Column(name = "Prenom")
	@NotNull
	private String Prenom;

	@Column(name = "Nom")
	@NotNull
	private String Nom;

	@Column(name = "Civilite")
	@NotNull
	private String Civilite;

	@Column(name = "Date_Naiss")
	@NotNull
	private Date Date_Naiss;

	@Column(name = "Langue")
	@NotNull
	private Date Langue;

	@Column(name = "No_Portable")
	private Date No_Portable;

	@Column(name = "Email")
	private Date Email;

	@Column(name = "Date_Crea")
	private Date Date_Crea;



	public Client() {
		super();
	}

	public Client(int cli_Id, String adr_Id, String prenom, String nom, String civilite, Date date_Naiss, Date langue,
			Date no_Portable, Date email, Date date_Crea) {
		super();
		Cli_Id = cli_Id;
		Adr_Id = adr_Id;
		Prenom = prenom;
		Nom = nom;
		Civilite = civilite;
		Date_Naiss = date_Naiss;
		Langue = langue;
		No_Portable = no_Portable;
		Email = email;
		Date_Crea = date_Crea;
	}


	public int getCli_Id() {
		return Cli_Id;
	}

	public void setCli_Id(int cli_Id) {
		Cli_Id = cli_Id;
	}

	public String getAdr_Id() {
		return Adr_Id;
	}

	public void setAdr_Id(String adr_Id) {
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

	public String getCivilite() {
		return Civilite;
	}

	public void setCivilite(String civilite) {
		Civilite = civilite;
	}

	public Date getDate_Naiss() {
		return Date_Naiss;
	}

	public void setDate_Naiss(Date date_Naiss) {
		Date_Naiss = date_Naiss;
	}

	public Date getLangue() {
		return Langue;
	}

	public void setLangue(Date langue) {
		Langue = langue;
	}

	public Date getNo_Portable() {
		return No_Portable;
	}

	public void setNo_Portable(Date no_Portable) {
		No_Portable = no_Portable;
	}

	public Date getEmail() {
		return Email;
	}

	public void setEmail(Date email) {
		Email = email;
	}

	public Date getDate_Crea() {
		return Date_Crea;
	}

	public void setDate_Crea(Date date_Crea) {
		Date_Crea = date_Crea;
	}



}
