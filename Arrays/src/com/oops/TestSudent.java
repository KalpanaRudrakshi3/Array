package com.oops;

public class TestSudent {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address add=new Address("hyd");
		Student s1= new Student(1,"kalpana",add);
		
	System.out.println(s1.sid);
	System.out.println(s1.sname);
	System.out.println(s1.address.city);
	System.out.println("**************************");
	Student s2=(Student)s1 .clone();
	System.out.println(s2.sid);
	System.out.println(s2.sname);
	System.out.println(s2.address.city);
	System.out.println("************************");
	s2.sid=2;
	s2.sname="rohit";
	s2.address.city="pune";
	
	System.out.println(s2.sid);
	System.out.println(s2.sname);
	System.out.println(s2.address.city);
	
	System.out.println(s1.sid);
	System.out.println(s1.sname);
	System.out.println(s1.address.city);
	
		
	}

}

