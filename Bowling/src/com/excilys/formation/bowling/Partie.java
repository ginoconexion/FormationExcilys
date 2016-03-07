package com.excilys.formation.bowling;

import java.util.ArrayList;

public class Partie {
	
	private ArrayList<Tour> listeTour = new ArrayList<>();
	private int nbPoints;
	
	public void initialiser() {
		for (int i = 1; i <= 10; i++) {
			if (i == 10) {
				listeTour.add(new Tour(3));
			}
			else {
				listeTour.add(new Tour(2));
			}
		}
	}
	
	public void jouer(){
		int numTour = 1;
		for (Tour tour : listeTour) {
			System.out.println("Tour num : " + numTour);
			tour.jouer();
			numTour++;
		}
	}

}
