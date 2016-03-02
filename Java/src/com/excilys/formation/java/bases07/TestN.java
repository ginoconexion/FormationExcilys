package com.excilys.formation.java.bases07;

public class TestN {
	
	// l'objet nommable doit forcément implémenter l'interface Nommable
	public static void sayHello(Nommable nommable){
		nommable.getNom();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonneN p = new PersonneN("paul", "girault");
		OrdinateurN o = new OrdinateurN("lenovo", "ibm");
		TestN.sayHello(p);
		TestN.sayHello(o);
	}
	
}
