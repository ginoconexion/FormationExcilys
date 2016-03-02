package com.excilys.formation.java.bases07;

public class Espagnol extends Personne {

	public Espagnol(String prenom) {
		super(prenom);
		// TODO Auto-generated constructor stub
	}
	
	public String hello(){
		String hola = "Hola " + prenom;
		System.out.println(hola);
		return hola;
	}

}
