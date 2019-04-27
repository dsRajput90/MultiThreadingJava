package com.test.thread;

public class SimpleRunnableInterruptThread implements Runnable{

	private boolean doStop;
	
	public static void main(String[] args) {
		SimpleRunnableInterruptThread st = new SimpleRunnableInterruptThread();
		Thread t1 = new Thread(st);
		t1.start();
		t1.interrupt();
		System.out.println("Thread interrupted");
	}
	
	@Override
	public void run() {
		System.out.println("Thread starts " + Thread.currentThread().getName());
		
		try{
			while(!keepRunning()) {
				Thread.sleep(100);
				System.out.println("Sleep over ");
			}
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	
	private boolean keepRunning() {
		return doStop;
	}
}
