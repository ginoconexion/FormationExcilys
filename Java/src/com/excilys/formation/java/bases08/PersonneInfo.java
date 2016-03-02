package com.excilys.formation.java.bases08;

public class PersonneInfo {

	public Personne personne;

	public PersonneInfo(Personne personne) {
		super();
		this.personne = personne;
	}
	
	public void printInfo(){
		System.out.printf("%s %s %s %d %f", personne.getCivilite(), personne.getNom(), personne.getPrenom(), personne.getAge(), personne.getPoids());
	}
	
	
}
