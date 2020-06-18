package com.delta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Identification")
public class Identification {

	@Id
	@Column(name = "email")
	@NotNull	
	private String email;

	@Column(name = "cli_id")
	@NotNull
	private String cli_id;

	@Column(name = "password")
	@NotNull
	private String password;
	
	@Column(name = "droit")
	@NotNull
	private String droit;

	
	
	public Identification(String email, String cli_Id, String password, String droit) {
		super();
		this.email = email;
		this.cli_id = cli_Id;
		this.password = password;
		this.droit = droit;
	}

	public Identification() {
		super();
	}

	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCli_Id() {
		return cli_id;
	}

	public void setCli_Id(String cli_Id) {
		this.cli_id = cli_Id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDroit() {
		return droit;
	}

	public void setDroit(String droit) {
		this.droit = droit;
	}
	
}
