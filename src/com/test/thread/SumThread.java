package com.test.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class SumThread {

	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		int sum=0;
		for(int i=0;i<1000;i++) {
			sum+=i;
		}
		System.out.println(sum);
		//499500
//		1

		System.out.println(System.currentTimeMillis()-t1);
	}
}

//public class SumThread implements Runnable{
//	
//	static Data data=new Data();
//	int sum=0;
//	public static void main(String[] args) throws Exception {
//		long t1 = System.currentTimeMillis();
//		SumThread  st = new SumThread();
//		Thread th1 = new Thread(st);
//		Thread th2 = new Thread(st);
//		
//		th1.start();
//		th2.start();
//		th2.join();
//		System.out.println(data.sum.get());
//		System.out.println(System.currentTimeMillis()-t1);
//	}
//	
//	@Override
//	public void run() {
//		int value = data.range.getAndAdd(500);
//		for(int i=value;i<data.range.get();i++) {
////			System.out.println(i);
//			data.sum.getAndAdd(i);
//		}
//	}
//}


class Data{
	AtomicInteger range = new AtomicInteger();
	AtomicInteger sum = new AtomicInteger();
	
	
}