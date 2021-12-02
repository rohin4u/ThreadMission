package com.spiderscrawl.secondsync;

public class Display {
	
	public synchronized void wish(String name) {
		
		for(int i=0; i<5; i++)
		{
			try {
				System.out.println("Good Morning");
				Thread.sleep(2000);
			
			}catch(Exception e) {}
			System.out.println(name);
		}
	}
}
