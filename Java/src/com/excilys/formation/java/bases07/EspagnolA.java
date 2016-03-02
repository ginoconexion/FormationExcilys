package com.excilys.formation.java.bases07;

public class EspagnolA extends AbstractPersonne {

	public final static String BONJOUR = "hola"; 
	
	public EspagnolA(String prenom){
		this.prenom = prenom;
	}
	
	@Override
	public String getLanguageHello() {
		// TODO Auto-generated method stub
		return BONJOUR;
	}

}
