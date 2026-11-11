package com.oops;

class Payment{
	String customername;
	int amount;
	
	void makePayment(String customername, int amount) {
		
	}
	
	class UPIPayment extends Payment{
		
		String upi;
	
		
		
	}
	
	class cardPayment extends Payment{
	String pay;
	}
	
	
	
	
	class cashPayment extends Payment{
		int cash;
		
		
	}
}

public class TestDemoPay {

	public static void main(String[] args) {
		

	}

}
