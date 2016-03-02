package com.excilys.formation.java.bases07;

public class ItalienA extends AbstractPersonne {
	
	public final static String BONJOUR = "ciao"; 
	
	public ItalienA (String prenom){
		this.prenom = prenom;
	}
	
	@Override
	public String getLanguageHello() {
		// TODO Auto-generated method stub
		return BONJOUR;
	}

}
