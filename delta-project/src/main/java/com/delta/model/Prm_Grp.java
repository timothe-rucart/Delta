package com.delta.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Prm_Grp")
@IdClass(Prm_Grp.class)
public class Prm_Grp  implements Serializable {

	@Id
	@Column(name = "grp_typ")
	@NotNull	
	private String grp_typ;
	
	@Id
	@Column(name = "grp")
	@NotNull	
	private String grp;

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

	public Prm_Grp(String grp_Typ, String grp, String libelle, Timestamp date_Deb, Timestamp date_Fin, String util_Maj) {
		super();
		this.grp_typ = grp_Typ;
		this.grp = grp;
		this.libelle = libelle;
		this.date_deb = date_Deb;
		this.date_fin = date_Fin;
		this.util_maj = util_Maj;
	}

	public Prm_Grp() {
		super();
	}

	public String getGrp_Typ() {
		return grp_typ;
	}

	public void setGrp_Typ(String grp_Typ) {
		this.grp_typ = grp_Typ;
	}

	public String getGrp() {
		return grp;
	}

	public void setGrp(String grp) {
		this.grp = grp;
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
