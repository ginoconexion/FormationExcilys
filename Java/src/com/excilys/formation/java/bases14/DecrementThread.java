package com.excilys.formation.java.bases14;


public class DecrementThread extends Thread {
	private Counter counter;
	
	@Override
	public synchronized void run() {
		counter.setC(counter.getC() - 1);
		System.out.println("décrément : " + counter.getC());
	}

	public void setCounter(Counter counter) {
		this.counter = counter;
	}
	
	
	
}
