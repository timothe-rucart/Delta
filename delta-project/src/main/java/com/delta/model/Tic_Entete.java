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
@Table(name = "Tic_Entete")
public class Tic_Entete {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Tic_Id;
	
	@Column(name = "Cli_Id")
	@NotNull
	private Integer Cli_Id;
	
	@Column(name = "No_Mag")
	@NotNull
	private Integer No_Mag;
	
	@Column(name = "No_Poste")
	@NotNull
	private Integer No_Poste;
	
	@Column(name = "Date_Vte")
	private Date Date_Vte;
	
	@Column(name = "Nb_Art")
	@NotNull
	private Integer Nb_Art;
	
	@Column(name = "Total_HT")
	@NotNull
	private double Total_HT;
	
	@Column(name = "Total_TTC")
	@NotNull
	private double Total_TTC;

	
	public Tic_Entete(int tic_Id, Integer cli_Id, Integer no_Mag, Integer no_Poste, Date date_Vte, Integer nb_Art,
			double total_HT, double total_TTC) {
		super();
		Tic_Id = tic_Id;
		Cli_Id = cli_Id;
		No_Mag = no_Mag;
		No_Poste = no_Poste;
		Date_Vte = date_Vte;
		Nb_Art = nb_Art;
		Total_HT = total_HT;
		Total_TTC = total_TTC;
	}

	public Tic_Entete() {
		super();
	}

	public int getTic_Id() {
		return Tic_Id;
	}

	public void setTic_Id(int tic_Id) {
		Tic_Id = tic_Id;
	}

	public Integer getCli_Id() {
		return Cli_Id;
	}

	public void setCli_Id(Integer cli_Id) {
		Cli_Id = cli_Id;
	}

	public Integer getNo_Mag() {
		return No_Mag;
	}

	public void setNo_Mag(Integer no_Mag) {
		No_Mag = no_Mag;
	}

	public Integer getNo_Poste() {
		return No_Poste;
	}

	public void setNo_Poste(Integer no_Poste) {
		No_Poste = no_Poste;
	}

	public Date getDate_Vte() {
		return Date_Vte;
	}

	public void setDate_Vte(Date date_Vte) {
		Date_Vte = date_Vte;
	}

	public Integer getNb_Art() {
		return Nb_Art;
	}

	public void setNb_Art(Integer nb_Art) {
		Nb_Art = nb_Art;
	}

	public double getTotal_HT() {
		return Total_HT;
	}

	public void setTotal_HT(double total_HT) {
		Total_HT = total_HT;
	}

	public double getTotal_TTC() {
		return Total_TTC;
	}

	public void setTotal_TTC(double total_TTC) {
		Total_TTC = total_TTC;
	}
}
