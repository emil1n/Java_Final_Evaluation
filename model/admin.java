package com.nissan.model;

import java.io.IOException;
import java.util.Scanner;

public class admin implements administrator {

	Scanner sc = new Scanner(System.in);

	public bank addcustomer() {
		// enter the details of customer
		bank b = new bank();
		try {
			System.out.println("Name: ");
			b.setCustomerNames(sc.nextLine());
			b.setAccountNo(b.generateaccountno());
			System.out.println("Account Type : ");
			b.setAccountType(sc.nextLine());
			System.out.println("Mobile Number: ");
			b.setMobileNumber(sc.nextLine());

			System.out.println("emil id : ");
			b.setEmailId(sc.next());
			b.setATMPin(b.generateatmpin());
			
		} catch (Exception e) {
			System.out.println("Error: " + e);

		}
		return b;
	}

	// update the existing customer details

	public void updatecustomer(bank obj) {
		System.out.println(" new emil id : ");
		obj.setEmailId(sc.nextLine());
		System.out.println(" new Mobile Number: ");
		try {
			obj.setMobileNumber(sc.nextLine());
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	// display the details of specific customer
	public void specificcustomer(bank obj) {
		System.out.println(" AccountNo : " + obj.getAccountNo() + "customerNames:  " + obj.getCustomerNames()
				+ " AccountType : " + obj.getAccountType() + " Balance : " + obj.getBalance() + " MobileNumber : "
				+ obj.getMobileNumber() + " EmailId : " + obj.getEmailId());
	}

}
