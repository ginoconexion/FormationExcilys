package com.excilys.formation.jdbc.test;

import java.sql.Date;

import com.excilys.formation.jdbc.dao.JoueurDAO;
import com.excilys.formation.jdbc.entites.Joueur;

public class JoueurDaoTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoueurDAO joueurDAO = new JoueurDAO();
		joueurDAO.init();
		
		Joueur joueur = new Joueur();
		joueur.setLogin("pgirault");
		joueur.setDateNaissance(new Date(1992, 03, 29));
		joueur.setEmail("pgiraultmatz@gmail.com");
		joueur.setNom("Girault");
		joueur.setPassword("test");
		joueur.setPoste("Ailier");
		joueur.setPrenom("Paul");
		joueur.setTelephone("0637238559");
		
		//joueurDAO.register(joueur);
		
		Joueur joueur1 = joueurDAO.login("pgirault", "test");
		System.out.println(joueur1.toString());
	}

}
