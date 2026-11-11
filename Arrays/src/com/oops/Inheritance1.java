package com.oops;
//Single  Inheritance
//parent/super/base
class Account{
	double balance=10000.00;
	long accountnumber=12345;
	void openAccount() {
		System.out.println("welcome to vcube Banking");
		System.out.println("your account has been opened SucessFully  ");
	}
	void displayAccountDetails() {
		System.out.println("your account Detais are:");
	}
}
//single Inheritance:once class can extends another class was  consider as single inheritance
//child/sub/Derived

class BankAccount1 extends Account{
	 void deposit( double amount) {
		 System.out.println("your deposited ammount is:"+ amount);
		 balance=balance+amount;
		 System.out.println("the current balance is:"+balance);
	 } 
	 void withdraw( double amount) {
		 System.out.println("withdraw ammount is:"+ amount);
		 balance=balance+amount;
		 System.out.println("the current balance is:"+balance);
	 }
	 void checkBalance() {
		 System.out.println("the current balance is:"+balance);
		 
	 }
}
public class Inheritance1 {

	public static void main(String[] args) {
		
		
		BankAccount1 b1= new BankAccount1();
		b1.openAccount();
		b1.displayAccountDetails();
		b1.withdraw(10000);
		b1.deposit(20000);
	}

}
