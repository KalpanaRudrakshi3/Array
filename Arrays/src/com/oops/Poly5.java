package com.oops;

//find areas..?
//findArea() using polymorphism
//Area of Triangle->0.5 * base * height
//Area of Square-> side *side
//Area of Rectangle -> length * breadth
//Area of Circle-->PI.r *r
public class Poly5 {

 void main(String[] args) {
	 System.out.println("main method started");
	 System.out.println("Area of Triangle:"+findArea(10.5, 6.9));
	 System.out.println("area of square:"+findArea(10.5));
	 System.out.println("area of Rectangle:"+findArea(10.5,7.7f));
	 System.out.println("area of circle:"+findArea(10.5f));
	 {
	 
 }
	}
 double findArea(double base, double height) {
	 System.out.println("Tringle info");
	 return 0.5 * base* height;
 }
 double findArea(double l, float b) {
	 System.out.println("Rectangle info");
	 return l*b;
 }
 double findArea(double side) {
	 System.out.println(" Square info");
	 return side;
 }
 double findArea(float r) {
	 System.out.println("circle info");
	 return Math.PI*r*r;
 }

}
