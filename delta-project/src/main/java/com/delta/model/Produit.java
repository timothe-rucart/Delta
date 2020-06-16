package com.delta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Produit")
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Produit_Id;
	
	@Column(name = "Ope_Id")
	private String Ope_Id;
	
	@Column(name = "Libelle")
	@NotNull
	private String Libelle;
	
	@Column(name = "Qte")
	@NotNull
	private Integer Qte;
	
	@Column(name = "TH")
	@NotNull
	private double TH;
	
	@Column(name = "CB")
	@NotNull
	private double CB;
	
	@Column(name = "Prix_HT")
	@NotNull
	private double Prix_HT;
	
	@Column(name = "Prix_TTC")
	@NotNull
	private double Prix_TTC;
	
	@Column(name = "Sous_espece")
	@NotNull
	private String Sous_espece;

	
	
	public Produit(int produit_Id, String opeId, String libelle, Integer qte, double tH, double cB, double prix_HT,
			double prix_TTC, String sous_espece) {
		super();
		Produit_Id = produit_Id;
		Ope_Id = opeId;
		Libelle = libelle;
		Qte = qte;
		TH = tH;
		CB = cB;
		Prix_HT = prix_HT;
		Prix_TTC = prix_TTC;
		Sous_espece = sous_espece;
	}

	
	public Produit() {
		super();
	}

	public int getProduit_Id() {
		return Produit_Id;
	}

	public void setProduit_Id(int produit_Id) {
		Produit_Id = produit_Id;
	}

	public String getOpeId() {
		return Ope_Id;
	}

	public void setOpe_Id(String opeId) {
		Ope_Id = opeId;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public Integer getQte() {
		return Qte;
	}

	public void setQte(Integer qte) {
		Qte = qte;
	}

	public double getTH() {
		return TH;
	}

	public void setTH(double tH) {
		TH = tH;
	}

	public double getCB() {
		return CB;
	}

	public void setCB(double cB) {
		CB = cB;
	}

	public double getPrix_HT() {
		return Prix_HT;
	}

	public void setPrix_HT(double prix_HT) {
		Prix_HT = prix_HT;
	}

	public double getPrix_TTC() {
		return Prix_TTC;
	}

	public void setPrix_TTC(double prix_TTC) {
		Prix_TTC = prix_TTC;
	}

	public String getSous_espece() {
		return Sous_espece;
	}

	public void setSous_espece(String sous_espece) {
		Sous_espece = sous_espece;
	}
}
