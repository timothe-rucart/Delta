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
@Table(name = "Avis")
public class Avis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Avis_Id;
	
	@Column(name = "cli_id")
	@NotNull
	private Integer cli_id;
	
	@Column(name = "produit_id")
	@NotNull
	private Integer produit_id;
	
	@Column(name = "tic_id")
	@NotNull
	private Integer tic_id;
	
	@Column(name = "descriptif")
	@NotNull
	private String descriptif;
	
	@Column(name = "note")
	@NotNull
	private Integer note;
	
	@Column(name = "date_save")
	@NotNull
	private Date date_save;

	public Avis(int avis_Id, Integer cli_Id, Integer produit_Id, Integer tic_Id, String descriptif, Integer note,
			Date date_Save) {
		super();
		this.Avis_Id = avis_Id;
		this.cli_id = cli_Id;
		this.produit_id = produit_Id;
		this.tic_id = tic_Id;
		this.descriptif = descriptif;
		this.note = note;
		this.date_save = date_Save;
	}

	public Avis() {
		super();
	}
	
	

	public int getAvis_Id() {
		return Avis_Id;
	}

	public void setAvis_Id(int avis_Id) {
		this.Avis_Id = avis_Id;
	}

	public Integer getCli_Id() {
		return cli_id;
	}

	public void setCli_Id(Integer cli_Id) {
		this.cli_id = cli_Id;
	}

	public Integer getProduit_Id() {
		return produit_id;
	}

	public void setProduit_Id(Integer produit_Id) {
		this.produit_id = produit_Id;
	}

	public Integer getTic_Id() {
		return tic_id;
	}

	public void setTic_Id(Integer tic_Id) {
		this.tic_id = tic_Id;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public Integer getNote() {
		return note;
	}

	public void setNote(Integer note) {
		this.note = note;
	}

	public Date getDate_Save() {
		return date_save;
	}

	public void setDate_Save(Date date_Save) {
		this.date_save = date_Save;
	}
}
