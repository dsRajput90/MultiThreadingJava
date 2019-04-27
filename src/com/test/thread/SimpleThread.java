package com.test.thread;

public class SimpleThread extends Thread{

	
	SimpleThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " ends");
	}
	
	public static void main(String[] args) throws Exception{
		Thread t1= new SimpleThread("Thread Name t1");
		Thread t2 = new SimpleThread("Thread Name t2");
		t1.start();
		Thread.sleep(500);
		t2.start();

		System.out.println(Thread.currentThread().getName() + " Main thread exits.");
	}
	
}
