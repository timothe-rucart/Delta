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
	
	@Column(name = "cli_id")
	@NotNull
	private Integer cli_id;
	
	@Column(name = "date_crea")
	@NotNull
	private Date date_crea;
	
	@Column(name = "date_vte")
	private Date date_vte;

	
	public Panier(int panier_Id, Integer cli_Id, Date date_Crea, Date date_Vte) {
		super();
		this.Panier_Id = panier_Id;
		this.cli_id = cli_Id;
		this.date_crea = date_Crea;
		this.date_vte = date_Vte;
	}

	public Panier() {
		super();
	}

	public int getPanier_Id() {
		return Panier_Id;
	}

	public void setPanier_Id(int panier_Id) {
		this.Panier_Id = panier_Id;
	}

	public Integer getCli_Id() {
		return cli_id;
	}

	public void setCli_Id(Integer cli_Id) {
		this.cli_id = cli_Id;
	}

	public Date getDate_Crea() {
		return date_crea;
	}

	public void setDate_Crea(Date date_Crea) {
		this.date_crea = date_Crea;
	}

	public Date getDate_Vte() {
		return date_vte;
	}

	public void setDate_Vte(Date date_Vte) {
		this.date_vte = date_Vte;
	}
}
