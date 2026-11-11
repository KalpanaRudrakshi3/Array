package com.oops;

class Address3{
	String city;
	
	public Address3(String city) {
		this.city=city;
	}
	public Address3(Address3 address) {
		this.city=address.city;
	}	
}

class School{
	int sid;
	String sname;
	int marks;
	Address3 address;
	
	
	public School(int sid, String sname, int marks, Address3 address) {
		this.sid=sid;
		this.sname=sname;
		this.marks=marks;
		this.address=address;
		
	}
		public School(School sch){
			this.sid=sch.sid;
			this.sname=sch.sname;
			this.marks=sch.marks;
			this.address=(sch.address);
			//output:{1,ravi,99,delhi,pune,pune}
		//this.address=new Address3(sch.address);
			//output:{1,ravi,99,delhi,pune,delhi}

		
	}
	
}


public class DeepCopy2 {

	public static void main(String[] args) {
		Address3 add=new Address3("delhi");
		School s1=new School(1,"ravi",99,add);
		School s2=new School(s1);
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.marks);
		System.out.println(s2.address.city);
		s2.address.city="pune";
		System.out.println(s2.address.city);
		System.out.println(s1.address.city);
	
	}

}
