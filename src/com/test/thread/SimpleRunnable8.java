package com.test.thread;

import java.util.concurrent.TimeUnit;

public class SimpleRunnable8 {

	public static void main(String[] args) {
		Runnable task = (() -> {
			try {
		        String name = Thread.currentThread().getName();
		        System.out.println("Foo " + name);
		        TimeUnit.SECONDS.sleep(1);
		        System.out.println("Bar " + name);
		    }
		    catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		});
		
		Thread t1 = new Thread(task);
		t1.start();
		System.out.println("Done!");
	}
}
