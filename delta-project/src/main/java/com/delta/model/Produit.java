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
	
	@Column(name = "ope_id")
	private String ope_id;
	
	@Column(name = "libelle")
	@NotNull
	private String libelle;
	
	@Column(name = "qte")
	@NotNull
	private Integer qte;
	
	@Column(name = "th")
	@NotNull
	private double th;
	
	@Column(name = "cb")
	@NotNull
	private double cb;
	
	@Column(name = "prix_ht")
	@NotNull
	private double prix_ht;
	
	@Column(name = "prix_ttc")
	@NotNull
	private double prix_ttc;
	
	@Column(name = "sous_espece")
	@NotNull
	private String sous_espece;

	
	
	public Produit(int produit_Id, String opeId, String libelle, Integer qte, double tH, double cB, double prix_HT,
			double prix_TTC, String sous_espece) {
		super();
		this.Produit_Id = produit_Id;
		this.ope_id = opeId;
		this.libelle = libelle;
		this.qte = qte;
		this.th = tH;
		this.cb = cB;
		this.prix_ht = prix_HT;
		this.prix_ttc = prix_TTC;
		this.sous_espece = sous_espece;
	}

	
	public Produit() {
		super();
	}

	public int getProduit_Id() {
		return Produit_Id;
	}

	public void setProduit_Id(int produit_Id) {
		this.Produit_Id = produit_Id;
	}

	public String getOpeId() {
		return ope_id;
	}

	public void setOpe_Id(String opeId) {
		this.ope_id = opeId;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Integer getQte() {
		return qte;
	}

	public void setQte(Integer qte) {
		this.qte = qte;
	}

	public double getTH() {
		return th;
	}

	public void setTH(double tH) {
		this.th = tH;
	}

	public double getCB() {
		return cb;
	}

	public void setCB(double cB) {
		this.cb = cB;
	}

	public double getPrix_HT() {
		return prix_ht;
	}

	public void setPrix_HT(double prix_HT) {
		this.prix_ht = prix_HT;
	}

	public double getPrix_TTC() {
		return prix_ttc;
	}

	public void setPrix_TTC(double prix_TTC) {
		this.prix_ttc = prix_TTC;
	}

	public String getSous_espece() {
		return sous_espece;
	}

	public void setSous_espece(String sous_espece) {
		this.sous_espece = sous_espece;
	}
}
