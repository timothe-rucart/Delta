package com.delta.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Prm_Grp_Typ")
public class Prm_Grp_Typ {

	@Column(name = "Grp_Typ")
	@NotNull	
	private String Grp_Typ;

	@Column(name = "Libelle")
	@NotNull
	private String Libelle;

	@Column(name = "Date_Deb")
	private Date Date_Deb;
	
	@Column(name = "Date_Fin")
	private Date Date_Fin;
	
	@Column(name = "Util_Maj")
	@NotNull
	private Date Util_Maj;

	
	
	public Prm_Grp_Typ(String grp_Typ, String libelle, Date date_Deb, Date date_Fin, Date util_Maj) {
		super();
		Grp_Typ = grp_Typ;
		Libelle = libelle;
		Date_Deb = date_Deb;
		Date_Fin = date_Fin;
		Util_Maj = util_Maj;
	}

	public Prm_Grp_Typ() {
		super();
	}

	public String getGrp_Typ() {
		return Grp_Typ;
	}

	public void setGrp_Typ(String grp_Typ) {
		Grp_Typ = grp_Typ;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public Date getDate_Deb() {
		return Date_Deb;
	}

	public void setDate_Deb(Date date_Deb) {
		Date_Deb = date_Deb;
	}

	public Date getDate_Fin() {
		return Date_Fin;
	}

	public void setDate_Fin(Date date_Fin) {
		Date_Fin = date_Fin;
	}

	public Date getUtil_Maj() {
		return Util_Maj;
	}

	public void setUtil_Maj(Date util_Maj) {
		Util_Maj = util_Maj;
	}
}
