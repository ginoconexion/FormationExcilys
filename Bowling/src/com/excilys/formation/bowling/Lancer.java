package com.excilys.formation.bowling;

import java.util.ArrayList;
import java.util.Random;

public class Lancer {
	private int score;
	private Tour tour;
	
	
	public Lancer(Tour tour) {
		super();
		this.score = 0;
		this.tour = tour;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void lancer(){

		Random rd = new Random();
		// on génére nb aléatoire du nb de quilles à faire tomber
		System.out.println("---------nb de quilles tjs debout   "+tour.getListeQuilles().size());
		int nbAleatoire = rd.nextInt(tour.getListeQuilles().size());
		System.out.println("---------nb aléatoire : " +nbAleatoire );
		
		
		// on ajoute à la liste des quilles tombées
		for (int i = 0; i <  nbAleatoire; i++)  {
			tour.getListeQuillesTombees().add(tour.getListeQuilles().get(i));
		}
		System.out.println("---------nb quilles tombées " + tour.getListeQuillesTombees().size());
		for (Quille  quille : tour.getListeQuillesTombees()) {
			if (tour.getListeQuilles().contains(quille)){
				tour.getListeQuilles().remove(quille);
			}
		}
		System.out.println("---------nb quilles restantes  "+tour.getListeQuilles().size());
		
		// on suprime de la liste des quilles, les quilles tombées
//		for (int i = 0; i <  nbAleatoire; i++) {
//			//System.out.println("index suppr " +i);
//				tour.getListeQuilles().remove(i);
//		}
		
		setScore(nbAleatoire);
	}
	
	
	
	
	 
}
