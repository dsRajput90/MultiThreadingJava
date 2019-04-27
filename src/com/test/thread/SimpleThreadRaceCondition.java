package com.test.thread;


/**
 * The addition in add method is synchronized to avoid
 * race condition
 * 
 * */
public class SimpleThreadRaceCondition extends Thread {
	static TwoSums ts;
	
	public static void main(String[] args) {
		ts = new TwoSums();
		Thread t1 = new SimpleThreadRaceCondition();
		Thread t2 = new SimpleThreadRaceCondition();
		t1.start();
		t2.start();
	}
	
	public void run() {
		ts.add(10, 20);
	}
}

class TwoSums {
    
    private int sum1 = 0;
    private int sum2 = 0;

    private Integer sum1Lock = new Integer(1);
    private Integer sum2Lock = new Integer(2);

    public void add(int val1, int val2){
        synchronized(this.sum1Lock){
            this.sum1 += val1;   
            System.out.println(this.sum1);
        }
        synchronized(this.sum2Lock){
            this.sum2 += val2;
            System.out.println(this.sum2);
        }
    }
}