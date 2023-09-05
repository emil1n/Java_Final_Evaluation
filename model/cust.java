package com.nissan.model;

import java.util.Scanner;

public class cust extends bank implements customer {

	Scanner sc = new Scanner(System.in);

	public void deposit(bank obj) {
		System.out.print("Enter the amount : ");
		int amount = sc.nextInt();
		System.out.println("Money has been deposited sucessfully");
		if (amount > 50000) {
			System.out.print("Enter PAN Card number: ");
			String panCard = sc.nextLine();
			System.out.println("PAN Card number: " + panCard);

		}
	}

	public void withdraw(bank obj) {
		double Balance= obj.getBalance();
		double availableBalance = Balance - 1000; //minimum balance as 1000
		System.out.print("Enter the amount : ");
		int amount = sc.nextInt();
		if (availableBalance > amount ) {
            System.out.println("Insufficient funds..!!!");
		}
		if (amount > 50000) {
			System.out.print("Enter PAN Card number: ");
			String panCard1 = sc.nextLine();
			
		}
            
	}

	public void showbalance(bank obj) {
		System.out.println("AccountNo : " + obj.getAccountNo() + " CustomerNames: "
				+ obj.getCustomerNames() + "  AccountType : "
				+ obj.getAccountType() + " Balance :  " + obj.getBalance() );
		
	}


	public void transfer(bank obj) {
		System.out.print("Enter the account number to transfer : ");
		int AccountNoTo=sc.nextInt(); // account no. to which amount to transfer
		
		System.out.print("Enter the amount  to transfer : ");
		int amountto=sc.nextInt(); // amount to transfer 
		
		obj.setBalance(Balance-amountto);
		System.out.println("Transferred Amount Successfully......");
	}



}
