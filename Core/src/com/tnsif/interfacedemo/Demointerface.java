package com.tnsif.interfacedemo;

public class Demointerface implements Childinterface,Interfaceone {

	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demointerface d=new Demointerface();
		d.show();
		d.print();
	}

}
