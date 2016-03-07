package com.excilys.formation.dao;


import java.sql.Date;
import java.util.Calendar;

public class Candidat {

	private int id;
	private String nomCandidat;
	private int numIdCandidat;
	private Date ddnCandidat;
	private int codeObtenu;
	
	public String getNomCandidat() {
		return nomCandidat;
	}
	public void setNomCandidat(String nomCandidat) {
		this.nomCandidat = nomCandidat;
	}
	
	
	public Date getDdnCandidat() {
		return ddnCandidat;
	}
	public void setDdnCandidat(Date ddnCandidat) {
		this.ddnCandidat = ddnCandidat;
	}
	
	public int getCodeObtenu() {
		return codeObtenu;
	}
	public void setCodeObtenu(int codeObtenu) {
		this.codeObtenu = codeObtenu;
	}
	public int getNumIdCandidat() {
		return numIdCandidat;
	}
	public void setNumIdCandidat(int numIdCandidat) {
		this.numIdCandidat = numIdCandidat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
