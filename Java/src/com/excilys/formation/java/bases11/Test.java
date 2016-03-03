package com.excilys.formation.java.bases11;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread directThread = new DirectThread();
		RunnableImpl ri = new RunnableImpl();
		Thread thread = new Thread(ri);
		
		directThread.start();
		thread.start();
		
	}

}
