package com.excilys.formation.java.bases06;
/**
 * 
 * @author pgmatz
 *
 */
public class Voiture {
	String immatriculation;
	String couleur;
	String proprietaire;
	static final String UNDEFINED = "undefined";
	
	
	public Voiture() {
		super();
	}
	
	/**
	 * 
	 * @param immatriculation
	 * @param couleur
	 * @param proprietaire
	 */
	public Voiture(String immatriculation, String couleur, String proprietaire) {
		super();
		this.immatriculation = immatriculation;
		this.couleur = couleur;
		this.proprietaire = proprietaire;
	}
	
	/**
	 * 
	 * @param immatriculation
	 */
	public Voiture(String immatriculation) {
		super();
		this.immatriculation = immatriculation;
	}

	
	public static void main(String[] args) {
		Voiture.testVoiture();
	}
	
	/**
	 * 
	 * @return
	 */
	public String getImmatriculation() {
		if (immatriculation == null){
			return UNDEFINED;
		}
		else {
			return immatriculation;
		}
	}
	/**
	 * 
	 * @param immatriculation
	 */
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getCouleur() {
		if (couleur == null){
			return UNDEFINED;
		}
		else {
			return couleur;
		}
	}
	
	/**
	 * 
	 * @param couleur
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getProprietaire() {
		if (proprietaire == null){
			return UNDEFINED;
		}
		else {
			return proprietaire;
		}
	}
	/**
	 * 
	 * @param proprietaire
	 */
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	/**
	 * 
	 */
	static void testVoiture(){
		Voiture v1 = new Voiture();
		System.out.println(v1.getCouleur());
		System.out.println(v1.getImmatriculation());
		System.out.println(v1.getProprietaire());
		Voiture v2 = new Voiture("AZFVZ564");
		System.out.println(v2.getCouleur());
		System.out.println(v2.getImmatriculation());
		System.out.println(v2.getProprietaire());
		
		Voiture v3 = new Voiture("SDFZEFGZE", "rouge", "girault");
		System.out.println(v3.getCouleur());
		System.out.println(v3.getImmatriculation());
		System.out.println(v3.getProprietaire());
	}

}
