package com.excilys.formation.bowling;

import java.util.ArrayList;

public class Tour {
		
		private ArrayList<Lancer> listeLancers = new ArrayList<>();
		private ArrayList<Quille> listeQuilles = new ArrayList<>();
		private ArrayList<Quille> listeQuillesTombees = new ArrayList<>();
		private int nbPoint;
		private int nbLancers;
		

		public Tour(int nbLancers) {
			super();
			this.nbLancers = nbLancers;
			
			for (int i = 1; i <= nbLancers; i++) {
				listeLancers.add(new Lancer(this));
			}
			for (int i = 1; i <= 10; i++) {
				listeQuilles.add(new Quille());
			}
		}
		
		public int getNbPoint(){
			return listeQuillesTombees.size();
		}
		
		public void jouer(){
			int numLancer = 1;
			for (Lancer lancer : listeLancers) {
				System.out.println("Numéro lancer : " + numLancer);
				lancer.lancer();
				numLancer++;
			}
		}

		public ArrayList<Quille> getListeQuilles() {
			return listeQuilles;
		}

		public void setListeQuilles(ArrayList<Quille> listeQuilles) {
			this.listeQuilles = listeQuilles;
		}

		public ArrayList<Quille> getListeQuillesTombees() {
			return listeQuillesTombees;
		}

		public void setListeQuillesTombees(ArrayList<Quille> listeQuillesTombees) {
			this.listeQuillesTombees = listeQuillesTombees;
		}
		
		
}
