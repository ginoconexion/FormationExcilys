package com.excilys.formation.java.bases08;

public class StringBufferInfo {

	private String membre;
	private StringBuffer sb = new StringBuffer();
	
	
	public StringBufferInfo (double d){
		sb.append(d);
		membre = sb.toString();
	}
	public StringBufferInfo (byte b){
		sb.append(b);
		membre = sb.toString();
	}
	public StringBufferInfo (long l){
		sb.append(l);
		membre = sb.toString();
	}
	
	public StringBufferInfo (int i){
		sb.append(i);
		membre = sb.toString();
	}
	public StringBufferInfo(float f){
		sb.append(f);
		membre = sb.toString();
	}
	public StringBufferInfo(boolean b){
		sb.append(b);
		membre = sb.toString();
	}
	public StringBufferInfo(char[] chaine){
		sb.append(chaine);
		membre = sb.toString();
	}
	
	public String getMembre() {
		return membre;
	}
	public void setMembre(String membre) {
		this.membre = membre;
	}
	
	
	public void getInfo(){
		int longueur = sb.length();
		char premier = sb.charAt(0);
		char dernier = sb.charAt(sb.length());
		System.out.println("longueur " + longueur + " premier char " + premier + " dernier char " + dernier);
	}
	
	public void changeString(){
		sb.replace(sb.indexOf("ô"), sb.indexOf("ô") + 1, "os" );
		System.out.println(sb.toString());
		if (membre.length() > 26){
			membre = membre.substring(0, 26);
		}
	}
}
