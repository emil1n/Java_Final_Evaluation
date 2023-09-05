package com.nissan.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.regex.Pattern;

public class bank {
	int AccountNo;
	String customerNames;
	String AccountType;
	double Balance;
	long MobileNumber;
	String EmailId;
	int ATMPin;

	public int getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}

	public String getCustomerNames() {
		return customerNames;
	}

	public void setCustomerNames(String customerNames) {
		this.customerNames = customerNames;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public long getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// a valid mobile number
        Pattern pattern = Pattern.compile("^\\d{10}$");
        // mobile number against the pattern
       
        do {
        	 boolean a= pattern.matcher(mobileNumber).matches();
        if(!a)
        {
        	System.out.println("Enter a valid mobile number");
        	mobileNumber = br.readLine();
        	
        }else {
        
		this.MobileNumber = Long.parseLong(mobileNumber);
		break;
        }
        }while(true);
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public int getATMPin() {
		return ATMPin;
	}

	public void setATMPin(int aTMPin) {
		ATMPin = aTMPin;
	}

	public int generateaccountno() {
		int n = 100000000 + new Random().nextInt(900000000);
		return n;
	}

	public int generateatmpin() {
		int t = 1000 + new Random().nextInt(9000);
		return t;
	}

	@Override
	public String toString() {
		return "bank [AccountNo=" + AccountNo + ", customerNames=" + customerNames + ", AccountType=" + AccountType
				+ ", Balance=" + Balance + ", MobileNumber=" + MobileNumber + ", EmailId=" + EmailId + ", ATMPin="
				+ ATMPin + "]";
	}

}
