package com.excilys.formation.java.bases08;

public class StringInfo {
	
	private String membre;
	
	public StringInfo (double d){
		membre = String.valueOf(d);
	}
	public StringInfo (byte b){
		membre = String.valueOf(b);
	}
	public StringInfo (long l){
		membre = String.valueOf(l);
	}
	
	public StringInfo (int i){
		membre = String.valueOf(i);
	}
	public StringInfo(float f){
		membre = String.valueOf(f);
	}
	public StringInfo(boolean b){
		membre = String.valueOf(b);
	}
	public StringInfo(char[] chaine){
		membre = String.valueOf(chaine);
	}
	public String getMembre() {
		return membre;
	}
	public void setMembre(String membre) {
		this.membre = membre;
	}
	
	public void getInfo(){
		int longueur = membre.length();
		char premier = membre.charAt(0);
		char dernier = membre.charAt(membre.length());
		System.out.println("longueur " + longueur + " premier char " + premier + " dernier char " + dernier);
	}
	
	public void changeString(){
		membre = membre.replaceAll("ô", "os");
		if (membre.length() > 26){
			membre = membre.substring(0, 26);
		}
	}
	
	

}
