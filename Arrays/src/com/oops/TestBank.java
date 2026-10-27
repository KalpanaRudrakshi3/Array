package com.oops;

public class TestBank {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		BankAccount b1=new BankAccount();
		
		b1.setaccountid(13);
		b1.setaccountHolderName("kalpana");
		b1.setbalance(80000);
		System.out.println(b1.getaccountid());
		System.out.println(b1.getaccountHolderName());
		System.out.println(b1.getbalance());
		
		
	}

}
