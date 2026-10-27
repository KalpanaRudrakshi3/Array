package com.oops;

public class BankAccount {
	
	private int accountid;
	private String accountHolderName;
	private double balance;
	
	public void setaccountid(int accountid) {
		this.accountid=accountid;
	}
	
	public  int getaccountid() {
		return accountid;
	}
	
	
	public void setaccountHolderName(String accountHolderName) {
		this.accountHolderName=accountHolderName;
	}
	
	public String getaccountHolderName(){
		return accountHolderName;
	}
	
	public void setbalance(double balance) {
		this.balance=balance;
	}
	
	public double getbalance() {
		return balance;
	}
	
	

}
