package com.spiderscrawl.twosync;

public class ThreadB extends Thread{

		
		Display d;
		String name;
		
		public ThreadB(Display d, String name) {
			
			this.d = d;
			this.name = name;
		}
		
		
		public void run() {
			d.syncB(name);
			
		}

}

