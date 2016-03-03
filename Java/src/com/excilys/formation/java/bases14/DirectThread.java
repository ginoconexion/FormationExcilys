package com.excilys.formation.java.bases14;

public class DirectThread  extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Début DirectThread");
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin DirectThread");
	}

	
}
