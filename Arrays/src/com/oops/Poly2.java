package com.oops;

//byte short int long float double
public class Poly2 {

	void main(String[] args) {
		System.out.println("maim method started");
		addition();
		addition(100);
		addition(100.0f);
		addition(5.8);
	}
     void addition() {
		System.out.println("addition method called");
	}
     void addition(int i) {
    	 System.out.println("addition method called with int parameters:"+i);
     }
     void addition(long i) {
    	 System.out.println("addition method called with long parameters:"+i);
     }

     void addition(float i) {
    	 System.out.println("addition method called with float parameters:"+i);
     }
     void addition(double i) {
    	 System.out.println("addition method called with double parameters:"+i);
     }
}
