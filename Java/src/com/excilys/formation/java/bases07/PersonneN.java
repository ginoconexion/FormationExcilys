package com.excilys.formation.java.bases07;

public class PersonneN implements Nommable {

	public String nom;
	public String prenom;
	
	public PersonneN(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		String affichage = prenom + " " + nom;
		System.out.println(affichage);
		return affichage;
	}
}
