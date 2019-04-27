package com.test.thread;

public class SimpleThreadRunnable{

	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableTest("Darshana"));
		Thread t2 = new Thread(new RunnableTest("Rohan"));
		t2.start();
		t1.start();
	}
}

class RunnableTest implements Runnable {

	String name;
	
	RunnableTest(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		try 
		{
		     for(int i = 5; i > 0; i--) {
		     System.out.println(name + ": " + i);
		      Thread.sleep(1000);
		     }
		}catch (InterruptedException e) {
		     System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}