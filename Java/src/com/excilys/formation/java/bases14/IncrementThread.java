package com.excilys.formation.java.bases14;

public class IncrementThread extends Thread {
	private Counter counter;

	@Override
	public synchronized void run() {
		this.counter.setC(counter.getC() + 1);
		System.out.println("incrément : " + counter.getC());
	}

	public void setCounter(Counter counter) {
		this.counter = counter;
	}
}
