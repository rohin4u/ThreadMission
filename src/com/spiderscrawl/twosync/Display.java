package com.spiderscrawl.twosync;

public class Display {
	
	public synchronized void syncA(String name) {
		
		for(int i=0; i<5; i++)
		{
			try {
				System.out.println("Good Morning");
				Thread.sleep(2000);
			
			}catch(Exception e) {}
			System.out.println(name);
		}
	}
	public synchronized void syncB(String name) {
		
		for(int i=0; i<5; i++)
		{
			try {
				System.out.println("Good Evening");
				Thread.sleep(2000);
			
			}catch(Exception e) {}
			System.out.println(name);
		}
	}
	
}
