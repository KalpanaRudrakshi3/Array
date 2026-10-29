package com.oops;


class Address2{
	String city;
	
	public Address2(String city) {
		this.city=city;
	}
	public Address2(Address2 address) {
		this.city=address.city;
}
	
}



class Employe{
	int eid;
	double sal;
	String name;
	Address2 address;
	
	public Employe(int eid, double sal, String name, Address2 address) {
		this .eid=eid;
		this.sal=sal;
		this.name=name;
		this.address=address;
	}

//copy constructor
	public Employe(Employe emp) {
		this.eid=emp.eid;
		this.sal=emp.sal;
		this.name=emp.name;
		this.address=new Address2(emp.address);
	
	}

}

public class DeepCopy {

	public static void main(String[] args) {
		Address2 add=new Address2("kphb");
		Employe e1=new Employe(1, 50000.00,"rohit",add);
		Employe e2=new Employe(e1);
System.out.println(e2.eid);
System.out.println(e2.sal);
System.out.println(e2.name);
System.out.println(e2.address.city);

e2.address.city="jntu";
System.out.println(e2.address.city);
System.out.println(e1.address.city);
	}

}
