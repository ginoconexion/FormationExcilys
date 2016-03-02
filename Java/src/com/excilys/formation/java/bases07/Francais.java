package com.excilys.formation.java.bases07;

public class Francais extends Personne {
	
	public Francais(String prenom) {
		super(prenom);
	}

	public String hello(){
		String bonjour = "Bonjour " + prenom;
		System.out.println(bonjour);
		return bonjour;
	}
}
