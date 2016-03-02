package com.excilys.formation.java.bases05;

public class TestMemoire {
	public String chaine = "maChaine";
	public int entier = 0;
	
	static void passageParParametre(TestMemoire t){
		if (t.entier < 0){
			t.chaine = "négatif";
		}
	}
	static void passageParValeur(int i){
		while (i < 0) {
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMemoire test = new TestMemoire();
		TestMemoire.passageParParametre(test);
		System.out.println(test.chaine);
		test.entier = -2;
		TestMemoire.passageParParametre(test);
		System.out.println(test.chaine);
		
		TestMemoire.passageParValeur(test.entier);
		System.out.println(test.entier);
	}

}
