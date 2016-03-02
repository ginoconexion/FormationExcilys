package com.excilys.formation.java.bases03;

public class Arguments {
	
	public static void main(String[] args) {
		if (args.length > 4) {
			System.out.println("Trop de personnes à saluer");
		}
		else {
			String prenoms = "";
			for (int i = 0; i < args.length; i++) {
				prenoms += args[i] + " ";
				
			}
			System.out.println(prenoms);
		}
	}
}
