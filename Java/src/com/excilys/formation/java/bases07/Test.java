package com.excilys.formation.java.bases07;

public class Test {

	static void sayHello(Personne personne){
		personne.hello();
	}
	public static void main(String[] args) {
		String prenom = args[0];
		char c = args[1].charAt(0);
		Personne personne = null;
		switch (c) {
		case 'f':
			personne = new Francais(prenom);
			break;
		case 'i':
			personne = new Italien(prenom);
			break;
		case 'e':
			personne = new Espagnol(prenom);
			break;

		default:
			break;
		}
		
		Test.sayHello(personne);
	}
}
