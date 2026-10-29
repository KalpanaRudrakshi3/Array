package com.oops;

class Address1{
	String city;
	
	public Address1(String city) {
		this.city=city;
	}
}


class Customer implements Cloneable{
	int cid;
	String cname;
	Address1 address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public Customer (int cid, String cname, Address1 address) {
		this.cid=cid;
		this.cname=cname;
		this.address=address;
	}
	
	
}

public class TestCustomer {

	public static void main(String[] args)throws CloneNotSupportedException {
		Address1 add=new Address1("gajapati");
		Customer c1=new Customer(1,"amma", add);
		System.out.println(c1.cid);
		System.out.println(c1.cname);
		System.out.println(c1.address.city);
		
		Customer c2=  (Customer)c1.clone();
		System.out.println(c2.cid);
		System.out.println(c2.cname);
		System.out.println(c2.address.city);
		
		c2.cid=2;
		c2.cname="nanna";
		c2.address.city="badagam";
		System.out.println(c2.cid);
		System.out.println(c2.cname);
		System.out.println(c2.address.city);
		System.out.println(c1.cid);
		System.out.println(c1.cname);
		System.out.println(c1.address.city);
				
		

	}

}
