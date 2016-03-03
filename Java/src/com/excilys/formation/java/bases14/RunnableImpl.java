package com.excilys.formation.java.bases14;

public class RunnableImpl implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Début Thread avc RunnableImpl");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin Thread avec RunnableImpl");
	}

}
