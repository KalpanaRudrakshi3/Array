package com.oops;
//Multi-level  Inheritance

//SuperParent class
class Account1{
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
//Parent Class
class BankAccount2 extends Account1{
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
//child class
class SavingAccount extends  BankAccount2{
	void calculateInterest() {
		System.out.println("calculateInterest called");
	}
}
 
//main class
public class Inheritance2 {

	public static void main(String[] args) {
		SavingAccount b1= new SavingAccount();
		b1.openAccount();
		b1.displayAccountDetails();
		b1.withdraw(10000);
		b1.deposit(20000);
		b1.calculateInterest();

	}

}
