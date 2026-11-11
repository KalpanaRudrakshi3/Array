package com.oops;

public class Poly3 {

	 void main(String[] args) {
		System.out.println("main method started");
add();
add(10,20);
	}
void add() {
	System.out.println("addition method called");
}
//return type is not part of method overloading
//method overloading means same method name+with different parameters
//Number of parameters should be different
//order of parameters should be different 
//types of parameters should be different
//int add() {
//	System.out.println("addition method called");
//	return 100;
//}


void add(int i) {
	System.out.println("addition method called with int");
}
void add(float f) {
	System.out.println("addition method called with float");
}
void add(int i, int j) {
	System.out.println("addition method called int + int");
}
void add(int i, float j) {
	System.out.println("addition method called int + float");
}
void add(float i, float j) {
	System.out.println("addition method called");
}
//void add(float i, int j) {
//	System.out.println("addition method called");
//}

}
