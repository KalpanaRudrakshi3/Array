package com.oops;

public class Poly4 {

 void main(String[] args) {
	System.out.println("main method started");
	hello("java");
	//The method hello(Object) is ambiguous for the type Poly4
    //hello(null);
	System.out.println("main method ended ");
	}
	void hello(Object o) {
		System.out.println("hello method called with object");
}
	 void hello(String s) {
		System.out.println("main method called with String");
	}
	 void hello(Integer s) {
			System.out.println("main method called with Integer");
	}

}
