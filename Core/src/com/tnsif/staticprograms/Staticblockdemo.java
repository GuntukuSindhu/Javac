package com.tnsif.staticprograms;

public class Staticblockdemo {
	static {
		System.out.println("welcome to java");
	}
	
	public static void main(String[] args) {
		System.out.println("welcome to python");
	}

}

public class Finalvariable {
	
	final int x=9;
	
	final static int n;
	
	void change() {
		//n=8;
	}
	static  {	
		n=9;
		
	}

}
