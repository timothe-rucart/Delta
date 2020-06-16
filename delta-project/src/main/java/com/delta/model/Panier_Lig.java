package com.delta.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Panier_Lig")
public class Panier_Lig {

	@Column(name = "Panier_Id")
	@NotNull
	private int Panier_Id;
	
	@Column(name = "Panier_Lig")
	@NotNull
	private Integer Panier_Lig;
	
	@Column(name = "Produit_Id")
	@NotNull
	private Integer Produit_Id;
	
	@Column(name = "Qte_Art")
	@NotNull
	private Date Qte_Art;

}
