package com.spiderscrawl.twosync;

public class Test {

	public static void main(String[] args) {
		
		Display d = new Display();
		
		ThreadA tA = new ThreadA(d, "Delhi");
		ThreadB tB = new ThreadB(d, "Mumbai");
		
		tA.start();
		tB.start();
		
		

	}

}
