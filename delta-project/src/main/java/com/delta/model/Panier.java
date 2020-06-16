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
@Table(name = "Panier")
public class Panier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Panier_Id;
	
	@Column(name = "Cli_Id")
	@NotNull
	private Integer Cli_Id;
	
	@Column(name = "Date_Crea")
	@NotNull
	private Date Date_Crea;
	
	@Column(name = "Date_Vte")
	private Date Date_Vte;

	
	public Panier(int panier_Id, Integer cli_Id, Date date_Crea, Date date_Vte) {
		super();
		Panier_Id = panier_Id;
		Cli_Id = cli_Id;
		Date_Crea = date_Crea;
		Date_Vte = date_Vte;
	}

	public Panier() {
		super();
	}

	public int getPanier_Id() {
		return Panier_Id;
	}

	public void setPanier_Id(int panier_Id) {
		Panier_Id = panier_Id;
	}

	public Integer getCli_Id() {
		return Cli_Id;
	}

	public void setCli_Id(Integer cli_Id) {
		Cli_Id = cli_Id;
	}

	public Date getDate_Crea() {
		return Date_Crea;
	}

	public void setDate_Crea(Date date_Crea) {
		Date_Crea = date_Crea;
	}

	public Date getDate_Vte() {
		return Date_Vte;
	}

	public void setDate_Vte(Date date_Vte) {
		Date_Vte = date_Vte;
	}
}
