package com.excilys.formation.java.bases08;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne p = new Personne("Mr", "Girault", "Paul", 23, 81.5f);
		PersonneInfo pi = new PersonneInfo(p);
		pi.printInfo();
	}

}
