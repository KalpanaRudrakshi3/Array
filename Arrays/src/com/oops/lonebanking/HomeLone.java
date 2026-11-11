
package com.oops.lonebanking;

import java.util.Scanner;

public class HomeLone {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Vcube Personal Loan Banking:");

        HomeLone pl = new HomeLone();

        double salary = pl.getEmployeSalary();
        int cibil = pl.getCibilScore();

        if (salary >= 1000000.00 && cibil >= 300 && cibil <= 900) {

            System.out.println("Good to know! Let's start the remaining process.");

            if (pl.isAadharvalid() && pl.isPanvalid() && pl.isPhonevalid()) {

                System.out.println("Congratulations!!");

                System.out.println("Personal Loan ROI is: " + pl.getROI(cibil) + "%");

            } else {
                System.out.println("Invalid documents. Loan Rejected.");
            }

        } else {

            System.out.println("Your loan got rejected. Please try again later.");
        }

        sc.close();
    }

    double getEmployeSalary() {

        System.out.println("Enter your salary:");

        double salary = sc.nextDouble();

        return salary;
    }

    int getEmployeAge() {

        System.out.println("Enter your age:");

        int age = sc.nextInt();

        return age;
    }

    int getCibilScore() {

        System.out.println("Enter CIBIL score:");

        int cibil = sc.nextInt();

        return cibil;
    }

    double getROI(int cibil) {

        double roi = 15.5;

        if (cibil > 800 && cibil <= 900) {

            System.out.println("Excellent: Strong credit profile, best loan terms.");
            roi = 9.0;

        } else if (cibil > 770 && cibil <= 800) {

            System.out.println("Very Good: High approval chances, competitive rates.");
            roi = 9.5;

        } else if (cibil > 700 && cibil <= 770) {

            System.out.println("Good: Eligible for most loans with decent terms.");
            roi = 10.0;

        } else if (cibil > 600 && cibil <= 700) {

            System.out.println("Average: May get loans but at higher interest.");
            roi = 12.0;

        } else if (cibil >= 300 && cibil <= 600) {

            System.out.println("Poor: High risk; loan applications often rejected.");
            roi = 14.5;

        } else {

            System.out.println("Invalid CIBIL score.");
        }

        return roi;
    }

    boolean isAadharvalid() {

        System.out.println("Enter your 12-digit Aadhar card number:");

        String aadhar = sc.next();

        boolean aadharStatus = aadhar.matches("[2-9][0-9]{11}");

        return aadharStatus;
    }

    boolean isPanvalid() {

        System.out.println("Enter your 10-digit PAN card number:");

        String pan = sc.next();

        boolean panStatus = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");

        return panStatus;
    }

    boolean isPhonevalid() {

        System.out.println("Enter your 10-digit phone number:");

        String phone = sc.next();

        boolean phoneStatus = phone.matches("[6-9][0-9]{9}");

        return phoneStatus;
    }
}
