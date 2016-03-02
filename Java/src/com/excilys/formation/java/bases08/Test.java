package com.excilys.formation.java.bases08;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// creation deux voitures ayant même immat mais autres att differents
		Voiture v1 = new Voiture("AZ", "peugeot", "206", "noir");
		Voiture v2 = new Voiture("AZ", "citroen", "406", "rouge");
		
		boolean t1 = v1.equals(v2);
		// doit retourner true
		System.out.println(t1);
		
		v1 = new Voiture("efzefe", "peugeot", "206", "noir");
		v2 = new Voiture("zdzd", "peugeot", "206", "noir");
		
		// doit retourner true
		t1 = v1.equals(v2);
		System.out.println(t1);
		
		// on test la desctruction de l'objet
		v1 = null;
		// on appelle le garbage collector
		System.gc();
	}

}
