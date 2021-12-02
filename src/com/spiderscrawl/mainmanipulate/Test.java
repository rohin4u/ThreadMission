package com.spiderscrawl.mainmanipulate;

public class Test {

	public static void main(String[] args) {
		
		FirstThread.mt = Thread.currentThread();
		
		FirstThread first = new FirstThread();
		
		first.start();
		
		for(int i=0; i<5; i++) {
			try {
				System.out.println("in main");
				Thread.sleep(2000);
			}catch(Exception e) {}
		}

	}

}
