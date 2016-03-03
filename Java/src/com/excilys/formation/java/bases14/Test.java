package com.excilys.formation.java.bases14;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Thread directThread = new DirectThread();
		
		RunnableImpl ri = new RunnableImpl();
		Thread thread = new Thread(ri);
		
		directThread.start();
		thread.start();
		*/
		
		Counter counter = new Counter();
		
		Thread[] threads = new Thread[100];
		for (int i = 1; i < 100; i++) {
			if (i%2 == 0){
				IncrementThread thread = new IncrementThread();
				thread.setCounter(counter);
				threads[i] = thread;
			}
			else {
				DecrementThread thread = new DecrementThread();
				thread.setCounter(counter);
				threads[i] = thread;
			}
		}
		
		for (int i = 1; i < threads.length; i++) {
			threads[i].run();
		}
	}

}
