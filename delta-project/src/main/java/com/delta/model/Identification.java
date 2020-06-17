package com.delta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Identification")
public class Identification {

	@Column(name = "Email")
	@NotNull	
	private String Email;

	@Column(name = "Cli_Id")
	@NotNull
	private String Cli_Id;

	@Column(name = "Password")
	@NotNull
	private String Password;
	
	@Column(name = "Droit")
	@NotNull
	private String Droit;

	
	
	public Identification(String email, String cli_Id, String password, String droit) {
		super();
		Email = email;
		Cli_Id = cli_Id;
		Password = password;
		Droit = droit;
	}

	public Identification() {
		super();
	}

	
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getCli_Id() {
		return Cli_Id;
	}

	public void setCli_Id(String cli_Id) {
		Cli_Id = cli_Id;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getDroit() {
		return Droit;
	}

	public void setDroit(String droit) {
		Droit = droit;
	}
	
}
