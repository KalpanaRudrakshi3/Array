package com.accessmodifer2;


import com.accessmodifer1.TestDemo1;
public class TestDemo3 extends TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started from TestDemo3");
	
		TestDemo1 t1= new TestDemo1();
		
		//Accessing the default data members outside of the package is not possible
		//System.out.println(t1.sid2); 
		//System.out.println(t1.name2);
		
		
		//accessing the public data members outside of the packages
		
		System.out.println(t1.sid3);
		System.out.println(t1.sname3); 
		t1.method3();
		
		TestDemo3 t3=new TestDemo3();
		
		System.out.println(t3.sid4);
		System.out.println(t3.sname4); 
		t3.method4();
		
		
		
		System.out.println("main method ended");
		
	}

}
