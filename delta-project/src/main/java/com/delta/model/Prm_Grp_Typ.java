package com.delta.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Prm_Grp_Typ")
public class Prm_Grp_Typ {

	@Id
	@Column(name = "grp_typ")
	@NotNull	
	private String grp_typ;

	@Column(name = "libelle")
	@NotNull
	private String libelle;

	@Column(name = "date_deb")
	private Timestamp date_deb;
	
	@Column(name = "date_fin")
	private Timestamp date_fin;
	
	@Column(name = "util_maj")
	@NotNull
	private String util_maj;

	
	
	public Prm_Grp_Typ(String grp_Typ, String libelle, Timestamp date_Deb, Timestamp date_Fin, String util_Maj) {
		super();
		this.grp_typ = grp_Typ;
		this.libelle = libelle;
		this.date_deb = date_Deb;
		this.date_fin = date_Fin;
		this.util_maj = util_Maj;
	}

	public Prm_Grp_Typ() {
		super();
	}

	public String getGrp_Typ() {
		return grp_typ;
	}

	public void setGrp_Typ(String grp_Typ) {
		this.grp_typ = grp_Typ;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Timestamp getDate_Deb() {
		return date_deb;
	}

	public void setDate_Deb(Timestamp date_Deb) {
		this.date_deb = date_Deb;
	}

	public Timestamp getDate_Fin() {
		return date_fin;
	}

	public void setDate_Fin(Timestamp date_Fin) {
		this.date_fin = date_Fin;
	}

	public String getUtil_Maj() {
		return util_maj;
	}

	public void setUtil_Maj(String util_Maj) {
		this.util_maj = util_Maj;
	}
}
