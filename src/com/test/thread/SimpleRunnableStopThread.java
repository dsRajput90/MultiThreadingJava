package com.test.thread;

import java.util.concurrent.atomic.AtomicBoolean;

public class SimpleRunnableStopThread implements Runnable {

	private final AtomicBoolean doStop = new AtomicBoolean();
	
	public static void main(String[] args) {
		SimpleRunnableStopThread st = new SimpleRunnableStopThread();
		Thread t1 = new Thread(st);
		t1.start();
		st.doStop();
	}
	
	public void run() {
		System.out.println("Thread starts " + Thread.currentThread().getName());
		try {
			while(!keepRunning()) {
				Thread.sleep(100);
				System.out.println("Sleep over");
			}
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Thread ends");
	}
	
    public synchronized void doStop() {
        this.doStop.compareAndSet(false, true);
    }

    private synchronized boolean keepRunning() {
        return this.doStop.get();
    }
}
