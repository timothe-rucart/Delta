package com.delta.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Panier_Lig")
@IdClass(Panier_Lig.class)
public class Panier_Lig implements Serializable {

	@Id
	@Column(name = "panier_id")
	@NotNull
	private int panier_id;
	
	@Id
	@Column(name = "panier_lig")
	@NotNull
	private Integer panier_lig;
	
	@Column(name = "produit_id")
	@NotNull
	private Integer produit_id;
	
	@Column(name = "qte_art")
	@NotNull
	private Date qte_art;

	public Panier_Lig(int panier_id, Integer panier_lig, Integer produit_id, Date qte_art) {
		super();
		this.panier_id = panier_id;
		this.panier_lig = panier_lig;
		this.produit_id = produit_id;
		this.qte_art = qte_art;
	}

	public Panier_Lig() {
		super();
	}

	public int getPanier_id() {
		return panier_id;
	}

	public void setPanier_id(int panier_id) {
		this.panier_id = panier_id;
	}

	public Integer getPanier_lig() {
		return panier_lig;
	}

	public void setPanier_lig(Integer panier_lig) {
		this.panier_lig = panier_lig;
	}

	public Integer getProduit_id() {
		return produit_id;
	}

	public void setProduit_id(Integer produit_id) {
		this.produit_id = produit_id;
	}

	public Date getQte_art() {
		return qte_art;
	}

	public void setQte_art(Date qte_art) {
		this.qte_art = qte_art;
	}
}
