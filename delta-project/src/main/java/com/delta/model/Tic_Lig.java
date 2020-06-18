package com.delta.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Tic_Lig")
@IdClass(Tic_Lig.class)
public class Tic_Lig implements Serializable {

	@Id
	@Column(name = "tic_id")
	@NotNull
	private Integer tic_id;
	
	@Id
	@Column(name = "tic_lig")
	@NotNull
	private Integer tic_lig;
	
	@Column(name = "produit_id")
	@NotNull
	private Integer produit_id;
	
	@Column(name = "prix_base")
	private double prix_base;
	
	@Column(name = "prix_paye")
	@NotNull
	private double prix_paye;
	
	@Column(name = "ope_id")
	private Integer ope_id;
	
	@Column(name = "qte_art")
	@NotNull
	private Integer qte_art;
	
	@Column(name = "tva_taux")
	@NotNull
	private double tva_taux;
	
	@Column(name = "tva_payee")
	@NotNull
	private double tva_payee;

	public Tic_Lig(Integer tic_Id, Integer tic_Lig, Integer produit_Id, double prix_Base, double prix_Paye,
			Integer ope_Id, Integer qte_Art, double tVA_Taux, double tVA_Payee) {
		super();
		this.tic_id = tic_Id;
		this.tic_lig = tic_Lig;
		this.produit_id = produit_Id;
		this.prix_base = prix_Base;
		this.prix_paye = prix_Paye;
		this.ope_id = ope_Id;
		this.qte_art = qte_Art;
		this.tva_taux = tVA_Taux;
		this.tva_payee = tVA_Payee;
	}

	public Tic_Lig() {
		super();
	}

	public Integer getTic_id() {
		return tic_id;
	}

	public void setTic_id(Integer tic_id) {
		this.tic_id = tic_id;
	}

	public Integer getTic_lig() {
		return tic_lig;
	}

	public void setTic_lig(Integer tic_lig) {
		this.tic_lig = tic_lig;
	}

	public Integer getProduit_id() {
		return produit_id;
	}

	public void setProduit_id(Integer produit_id) {
		this.produit_id = produit_id;
	}

	public double getPrix_base() {
		return prix_base;
	}

	public void setPrix_base(double prix_base) {
		this.prix_base = prix_base;
	}

	public double getPrix_paye() {
		return prix_paye;
	}

	public void setPrix_paye(double prix_paye) {
		this.prix_paye = prix_paye;
	}

	public Integer getOpe_id() {
		return ope_id;
	}

	public void setOpe_id(Integer ope_id) {
		this.ope_id = ope_id;
	}

	public Integer getQte_art() {
		return qte_art;
	}

	public void setQte_art(Integer qte_art) {
		this.qte_art = qte_art;
	}

	public double getTva_taux() {
		return tva_taux;
	}

	public void setTva_taux(double tva_taux) {
		this.tva_taux = tva_taux;
	}

	public double getTva_payee() {
		return tva_payee;
	}

	public void setTva_payee(double tva_payee) {
		this.tva_payee = tva_payee;
	}
}
