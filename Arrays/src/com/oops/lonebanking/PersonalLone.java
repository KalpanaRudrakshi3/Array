package com.oops.lonebanking;

import java.util.Scanner;

public class PersonalLone {
static 	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("welcome to vcube personal lone banking:");
		//by using child object child reference
		//we can call both child class & parent class functionalities
		PersonalLone pl =new PersonalLone();
		double salary = pl.getEmployeSalary();
int cibil =pl.getCibilScore();
if(salary >=1000000.00 && cibil >=300 && cibil <=900) {
	System.out.println("good to know lets start the remaining process");
	
	if(pl.isAadharvalid() && pl.isPanvalid() && pl.isPhonevalid()) {
		System.out.println("congrtulations !!");
		System.out.println("personal loan ROI is:" +pl.getROI());
	}	
}else {
	System.out.println("your lone got Rejected.....pls try again later. ");
}


	}
	Double getEmployeSalary(){
		System.out.println("Enter your salary:");
		double salary=sc.nextDouble();
		return salary;	
	}
	int getEmployeAge() {
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		return age;
	}
	int getCibilScore() {
		System.out.println("Enter cibil score!");
		int cibil =sc.nextInt();
		return cibil; 
	}
	double getROI() {
		double roi=15.5;
		int cibil=getCibilScore();
		if(cibil >800 && cibil<=900) {
			System.out.println("Excellent: strong credit profile, best lone terms.");
			roi=9.0;
		}else if (cibil>770 && cibil <=800) {
			System.out.println("very good:high approval chances, competitive rates.");
			roi=9.5;
		}else if (cibil>700 && cibil<= 770) {
			System.out.println("good:Eligible for most loans with decent terms.");
			roi=10.0;
		}else if(cibil>600 && cibil <=700) {
		System.out.println("average: may get loans but at higher interest.");
		roi=12.0;
	}else if(cibil>300 && cibil <=600) {
		System.out.println("poor:high risk; loan applications often rejected. ");
		roi=14.5;
	}else {
		System.out.println("invaid cibil scor");
	}
		return roi;
	}
	
	
	boolean isAadharvalid() {
		System.out.println("Enter your 12 digits aadhar card number ");
		String aadhar=sc.next();
		boolean aadharStatus=aadhar.matches("[2-9][0-9]{11}");
		
		return aadharStatus;
	}
	
	boolean isPanvalid() {
		System.out.println("Enter your 10 digits pan card number ");
		String pan=sc.next();
		
		boolean panStatus=pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return panStatus;
	} 
	boolean isPhonevalid() {
		System.out.println("Enter your 10 digits Phone card number ");
	String phone=sc.next();
	boolean phoneStatus=phone.matches("[6-9]{1}[0-9]{9}");
		return phoneStatus;
	} 
	
}
