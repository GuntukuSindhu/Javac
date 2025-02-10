package com.tnsif.abstractiondemo;

public class Square extends Shape{
private float side;
	
	// const
	public Square() {
		side=2.0f;
	}
	public Square(float side) {
		this.side=side;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Shape [area=" + area + "]";
	}

	@Override
	void calarea() {
		// TODO Auto-generated method stub
		super.area=side*side;
		
	}
	public static void main(String[] args) {
		//	Square s=new Square();
			
			Shape p=new Square(4.0f);
			System.out.println(p);
			p.calarea();
			p.show();
		}

}
