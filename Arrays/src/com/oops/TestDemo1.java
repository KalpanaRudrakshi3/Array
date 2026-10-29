package com.oops;

public class TestDemo1  {
	String name="test";
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}
	@Override
	public String toString() {
		return "TestDemo1[name="+name+"]";
	}
public static void main(String[] args) {
	TestDemo1  t1= new TestDemo1();
	TestDemo1 t2=new TestDemo1();
	TestDemo1 t3=new TestDemo1 ();
	t3=t2;
	System.out.println(t1.equals(t2));
	System.out.println(t3.equals(t2));
	System.out.println(t1);
	int a=0x2b2fa4f7;
	System.out.println(a);
	System.out.println(t1.hashCode());
	System.gc();
	System.out.println(t1.getClass());

	}

}
