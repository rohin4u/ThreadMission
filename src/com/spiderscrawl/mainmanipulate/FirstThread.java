package com.spiderscrawl.mainmanipulate;

public class FirstThread extends Thread{
	
	public static Thread mt;
	
	public void run() {
		
		for(int i=0; i<5; i++) {
			try {
				mt.join();
				System.out.println("in first Thread");
				Thread.sleep(2000);
			}
			catch(Exception e) {}
		}
	}

}
