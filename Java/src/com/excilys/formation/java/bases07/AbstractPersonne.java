package com.excilys.formation.java.bases07;

public abstract class AbstractPersonne {
	public String prenom;
	
	public abstract String getLanguageHello();
	public void sayHello(){
		String hello = getLanguageHello();
		System.out.println(hello + " "+ prenom);
	}
}
