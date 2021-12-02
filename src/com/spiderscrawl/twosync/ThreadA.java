package com.spiderscrawl.twosync;

public class ThreadA extends Thread {
	
	Display d;
	String name;
	
	public ThreadA(Display d, String name) {
		
		this.d = d;
		this.name = name;
	}
	
	
	public void run() {
		d.syncA(name);
		
	}

}
