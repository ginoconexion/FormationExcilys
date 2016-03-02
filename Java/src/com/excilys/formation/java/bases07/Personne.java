package com.excilys.formation.java.bases07;

public class Personne {
	public String prenom;
	
	public Personne(String prenom) {
		super();
		this.prenom = prenom;
	}


	public String hello(){
		String hello = "hello "+prenom;
		System.out.println(hello);
		return hello;
	}
}
