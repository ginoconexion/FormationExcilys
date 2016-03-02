package com.excilys.formation.java.bases08;

public class Voiture {

	public String immatriculation;
	public String marque;
	public String modele;
	public String couleur;
	
	public Voiture(String immatriculation, String marque, String modele, String couleur) {
		super();
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		// on cast l'objet, et on le declare final pour qu'il ne soit pas modifié
		final Voiture voiture = (Voiture) obj;
		if (voiture.immatriculation == immatriculation){
			return true;
		}
		else if (voiture.marque.equals(marque) && voiture.modele.equals(modele) && voiture.couleur.equals(couleur)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Voiture [immatriculation=" + immatriculation + ", marque=" + marque + ", modele=" + modele
				+ ", couleur=" + couleur + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		marque = null;
		immatriculation = null;
		modele = null;
		couleur = null;
		String s = toString();
		System.out.println(s);
	}
	
	
}
