package com.delta.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
@Table(name = "Client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Cli_Id;

	@Column(name = "adr_id")
	@NotNull	
	private long adr_id;

	@Column(name = "prenom")
	@NotNull
	private String prenom;

	@Column(name = "nom")
	@NotNull
	private String nom;

	@Column(name = "civilite")
	@NotNull
	private char civilite;

	@Column(name = "date_naiss")
	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp date_naiss;

	@Column(name = "langue")
	@NotNull
	private String langue;

	@Column(name = "no_portable")
	private String no_portable;

	@Column(name = "email")
	private String email;

	@Column(name = "date_crea")
	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp  date_crea;


	public Client() {
		super();
	}

	public Client(Integer cli_Id, long adr_Id, String prenom, String nom, char civilite, Timestamp date_Naiss, String langue,
			String no_Portable, String email, Timestamp date_Crea) {
		super();
		this.Cli_Id = cli_Id;
		this.adr_id = adr_Id;
		this.prenom = prenom;
		this.nom = nom;
		this.civilite = civilite;
		this.date_naiss = date_Naiss;
		this.langue = langue;
		this.no_portable = no_Portable;
		this.email = email;
		this.date_crea = date_Crea;
	}

	public long getCli_Id() {
		return Cli_Id;
	}

	public void setCli_Id(long cli_Id) {
		Cli_Id = cli_Id;
	}

	public long getAdr_id() {
		return adr_id;
	}

	public void setAdr_id(long adr_id) {
		this.adr_id = adr_id;
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

	public char getCivilite() {
		return civilite;
	}

	public void setCivilite(char civilite) {
		this.civilite = civilite;
	}

	public Timestamp getDate_naiss() {
		return date_naiss;
	}

	public void setDate_naiss(Timestamp date_naiss) {
		this.date_naiss = date_naiss;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public String getNo_portable() {
		return no_portable;
	}

	public void setNo_portable(String no_portable) {
		this.no_portable = no_portable;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getDate_crea() {
		return date_crea;
	}

	public void setDate_crea(Timestamp date_crea) {
		this.date_crea = date_crea;
	}

}
