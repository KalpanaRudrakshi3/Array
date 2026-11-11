package com.oops;

class Shape{
	
public void area() {
	System.out.println("area of shape");
}
	
}
class Circle extends Shape{
	 double radius=3;
	 @Override
	public void area() {
		 double res=3.14*radius*radius;
		System.out.println("ares of circle:"+res);
	}
}

class Rectangle extends Shape{
	double l=5;
	double b=10;
	
	@Override
	public void area() {
		 double result=l*b;
		System.out.println("area of Rectangle:"+result);
		
		
	}
	
	
}

public class TestShape {

	public static void main(String[] args) {
		Circle c= new Circle();
		c.area();
		
		Rectangle r= new Rectangle();
		r.area();
		

	}

}
