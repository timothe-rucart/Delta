package com.delta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Tic_Lig")
public class Tic_Lig {

	
	@Column(name = "Tic_Id")
	@NotNull
	private Integer Tic_Id;
	
	@Column(name = "Tic_Lig")
	@NotNull
	private Integer Tic_Lig;
	
	@Column(name = "Produit_Id")
	@NotNull
	private Integer Produit_Id;
	
	@Column(name = "Prix_Base")
	private Integer Prix_Base;
	
	@Column(name = "Prix_Paye")
	@NotNull
	private Integer Prix_Paye;
	
	@Column(name = "Ope_Id")
	private Integer Ope_Id;
	
	@Column(name = "Qte_Art")
	@NotNull
	private Integer Qte_Art;
	
	@Column(name = "TVA_Taux")
	@NotNull
	private Integer TVA_Taux;
	
	@Column(name = "TVA_Payee")
	@NotNull
	private Integer TVA_Payee;

	public Tic_Lig(Integer tic_Id, Integer tic_Lig, Integer produit_Id, Integer prix_Base, Integer prix_Paye,
			Integer ope_Id, Integer qte_Art, Integer tVA_Taux, Integer tVA_Payee) {
		super();
		Tic_Id = tic_Id;
		Tic_Lig = tic_Lig;
		Produit_Id = produit_Id;
		Prix_Base = prix_Base;
		Prix_Paye = prix_Paye;
		Ope_Id = ope_Id;
		Qte_Art = qte_Art;
		TVA_Taux = tVA_Taux;
		TVA_Payee = tVA_Payee;
	}

	public Tic_Lig() {
		super();
	}

	public Integer getTic_Id() {
		return Tic_Id;
	}

	public void setTic_Id(Integer tic_Id) {
		Tic_Id = tic_Id;
	}

	public Integer getTic_Lig() {
		return Tic_Lig;
	}

	public void setTic_Lig(Integer tic_Lig) {
		Tic_Lig = tic_Lig;
	}

	public Integer getProduit_Id() {
		return Produit_Id;
	}

	public void setProduit_Id(Integer produit_Id) {
		Produit_Id = produit_Id;
	}

	public Integer getPrix_Base() {
		return Prix_Base;
	}

	public void setPrix_Base(Integer prix_Base) {
		Prix_Base = prix_Base;
	}

	public Integer getPrix_Paye() {
		return Prix_Paye;
	}

	public void setPrix_Paye(Integer prix_Paye) {
		Prix_Paye = prix_Paye;
	}

	public Integer getOpe_Id() {
		return Ope_Id;
	}

	public void setOpe_Id(Integer ope_Id) {
		Ope_Id = ope_Id;
	}

	public Integer getQte_Art() {
		return Qte_Art;
	}

	public void setQte_Art(Integer qte_Art) {
		Qte_Art = qte_Art;
	}

	public Integer getTVA_Taux() {
		return TVA_Taux;
	}

	public void setTVA_Taux(Integer tVA_Taux) {
		TVA_Taux = tVA_Taux;
	}

	public Integer getTVA_Payee() {
		return TVA_Payee;
	}

	public void setTVA_Payee(Integer tVA_Payee) {
		TVA_Payee = tVA_Payee;
	}
}
