package com.excilys.formation.java.bases07;

public class FrancaisA extends AbstractPersonne {

	public final static String BONJOUR = "bonjour"; 
	
	public FrancaisA(String prenom){
		this.prenom = prenom;
	}
	
	@Override
	public String getLanguageHello() {
		// TODO Auto-generated method stub
		return BONJOUR;
	}

}
