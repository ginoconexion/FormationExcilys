package com.excilys.formation.java.bases07;

public class OrdinateurN implements Nommable {

	public String nom;
	public String groupe;
	
	public OrdinateurN(String nom, String groupe) {
		super();
		this.nom = nom;
		this.groupe = groupe;
	}


	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		String affichage =  nom + " " + groupe;
		System.out.println(affichage);
		return affichage;
	}

}
