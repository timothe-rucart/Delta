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
	
	@Column(name = "Cli_Id")
	@NotNull
	private Integer Cli_Id;
	
	@Column(name = "Produit_Id")
	@NotNull
	private Integer Produit_Id;
	
	@Column(name = "Tic_Id")
	@NotNull
	private Integer Tic_Id;
	
	@Column(name = "Descriptif")
	@NotNull
	private String Descriptif;
	
	@Column(name = "Note")
	@NotNull
	private Integer Note;
	
	@Column(name = "Date_Save")
	@NotNull
	private Date Date_Save;

	public Avis(int avis_Id, Integer cli_Id, Integer produit_Id, Integer tic_Id, String descriptif, Integer note,
			Date date_Save) {
		super();
		Avis_Id = avis_Id;
		Cli_Id = cli_Id;
		Produit_Id = produit_Id;
		Tic_Id = tic_Id;
		Descriptif = descriptif;
		Note = note;
		Date_Save = date_Save;
	}

	public Avis() {
		super();
	}
	
	

	public int getAvis_Id() {
		return Avis_Id;
	}

	public void setAvis_Id(int avis_Id) {
		Avis_Id = avis_Id;
	}

	public Integer getCli_Id() {
		return Cli_Id;
	}

	public void setCli_Id(Integer cli_Id) {
		Cli_Id = cli_Id;
	}

	public Integer getProduit_Id() {
		return Produit_Id;
	}

	public void setProduit_Id(Integer produit_Id) {
		Produit_Id = produit_Id;
	}

	public Integer getTic_Id() {
		return Tic_Id;
	}

	public void setTic_Id(Integer tic_Id) {
		Tic_Id = tic_Id;
	}

	public String getDescriptif() {
		return Descriptif;
	}

	public void setDescriptif(String descriptif) {
		Descriptif = descriptif;
	}

	public Integer getNote() {
		return Note;
	}

	public void setNote(Integer note) {
		Note = note;
	}

	public Date getDate_Save() {
		return Date_Save;
	}

	public void setDate_Save(Date date_Save) {
		Date_Save = date_Save;
	}
}
