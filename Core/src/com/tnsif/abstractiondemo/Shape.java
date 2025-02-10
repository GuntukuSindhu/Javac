package com.tnsif.abstractiondemo;

public abstract class Shape {
	protected float area;
	abstract void calarea();
	void show() {
       
}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Shape [area=" + area + "]";
	}
}