package com.tnsif.polymorphism;

public class Car extends Vehicle {

	@Override
	void move() {
		// TODO Auto-generated method stub
		super.move();
		move();
	}
	void display() {
		super.move();
		move();
	}
	
	public static void main(String[] args) {
		Car c=new Car();
		//c.move();
		
		c.display();
	}

}
