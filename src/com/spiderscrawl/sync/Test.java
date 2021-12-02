package com.spiderscrawl.sync;

public class Test {

	public static void main(String[] args) {
		
		Display d = new Display();
		
		MyThread t1 = new MyThread(d, "Delhi");
		MyThread t2 = new MyThread(d, "Mumbai");
		MyThread t3 = new MyThread(d, "Pune");
		MyThread t4 = new MyThread(d, "Kerela");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}
