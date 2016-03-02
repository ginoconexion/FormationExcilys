package com.excilys.formation.java.bases08;

public class Personne {
	private String civilite;
	private String nom;
	private String prenom;
	private int age;
	private float poids;
	
	
	public Personne(String civilite, String nom, String prenom, int age, float poids) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.poids = poids;
	}
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getPoids() {
		return poids;
	}
	public void setPoids(float poids) {
		this.poids = poids;
	}
	
}
