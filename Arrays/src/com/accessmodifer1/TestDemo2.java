package com.accessmodifer1;

public class TestDemo2 {
	
	public static void main(String[] args) {
		System.out.println("maim method started from TestDemo2");
		
		
		 //we can't access private data members outside of the classes
		//The field TestDemo1.sid is not visible
		//The field TestDemo1.name is not visible
		//The method method1() from the type TestDemo1 is not visible
		
		
		TestDemo1 t1= new TestDemo1();
		//System.out.println(t1.sid);
		//System.out.println(t1.name);
		//t1.method1();
		
		//access the default data outside of the class within the package
		
		System.out.println(t1.sid2);
		System.out.println(t1.name2);
		t1.method2();
	
		//accessing the public data members within  the packages
				System.out.println(t1.sid3);
				System.out.println(t1.sname3); 
				t1.method3();
				
		
	}

}
