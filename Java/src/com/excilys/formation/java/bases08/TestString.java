package com.excilys.formation.java.bases08;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chaine = {'a', 'ô', 'b', 'c' };
		StringInfo stringinfo = new StringInfo(chaine);
		stringinfo.changeString();
		System.out.println(stringinfo.getMembre());
	}

}
