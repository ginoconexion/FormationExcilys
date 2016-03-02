package com.excilys.formation.java.bases04.test;

import static com.excilys.formation.java.bases04.Voiture.service;

import com.excilys.formation.java.bases04.Voiture;
import com.excilys.formation.java.bases04.Voiture.ECarburant;
import static com.excilys.formation.java.bases04.Voiture.NOMBRE_ROUES;;


public class ImportTest {

	public static void main(String[] args) {
		
		System.out.println(NOMBRE_ROUES);
		service();
		Voiture v = new Voiture(ECarburant.SANS_PLOMB_95, 1.0f, 1.1f, 1.2f, 1.3f);
		
		
	}

}
