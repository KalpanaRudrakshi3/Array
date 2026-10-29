   package com.accessmodifer1;

public class TestDemo1 {
	
	static{
		System.out.println("static block called from TestDemo1");
	}
	
	{
		System.out.println("instance block called from TestDemo1");
	}	
	 public TestDemo1(){
		System.out.println("no-args constructor called");
	}
	 //protected data members
	 protected int sid4=45;
	 protected String sname4 ="rohit";
	 
	 protected void method4() {
		 System.out.println("method4 called ");
	 }
	  
	 
	 
	 //public data members
	public  int sid3=10;
	public String sname3="virat";
	 
	  public void method3() {
		 System.out.println("method3 called");
	 }
	
	 //whenever we didn't specify any access modifier will consider as default
	//default data members
	int sid2=7;
	String name2="ravi";
	
	void method2() {
		System.out.println("methos2 called");
	}
	
	
	
	//private data members
	private int sid=1;
	private String name="kalpana";
	
	private void method1() {
		System.out.println("method1 called");
	}
	public static void main(String[] args) {
		System.out.println("main method started from TestDemo1");
		
		//accessing the private data within the class
		
	TestDemo1 t1= new TestDemo1();
	System.out.println(t1.sid);
	System.out.println(t1.name);
	t1.method1();
	
	
	
	//accessing the default data member within the class and outside of the class within the package
	System.out.println(t1.sid2);
	System.out.println(t1.name2);
	t1.method2();
	
	
	//accessing the public data members within  the class
			System.out.println(t1.sid3);
			System.out.println(t1.sname3); 
			t1.method3();
			

	}

}
