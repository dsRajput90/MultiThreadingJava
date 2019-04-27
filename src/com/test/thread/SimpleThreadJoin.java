package com.test.thread;

public class SimpleThreadJoin {

	public static void main(String[] args) {
		Thread r1 = new Thread(new RunnableTest("R1"));
		Thread r2 = new Thread(new RunnableTest("R2"));
		Thread r3 = new Thread(new RunnableTest("R3"));
		System.out.println("Thread starting");
		try {
			r1.start();
			r2.start();
			r3.start();
			r3.join();
			
		}catch(InterruptedException ie)
		{
			ie.printStackTrace();	
		}
		
		System.out.println("Main ends");
	
	}
}

