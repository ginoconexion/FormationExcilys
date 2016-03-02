package com.excilys.formation.java.bases07;

public class Italien extends Personne {

	public Italien(String prenom) {
		super(prenom);
		// TODO Auto-generated constructor stub
	}
	
	public String hello(){
		String ciao = "Ciao " + prenom;
		System.out.println(ciao);
		return ciao;
	}
	
}
