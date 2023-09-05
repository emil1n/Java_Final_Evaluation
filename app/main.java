package com.nissan.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.nissan.model.admin;
import com.nissan.model.bank;
import com.nissan.model.cust;

public class main {

	public static void main(String[] args) {
		boolean bool = false;
		int chrr;
		Scanner s = new Scanner(System.in);
		ArrayList<bank> ar = new ArrayList<>();
		admin admin = new admin(); // object of admin
		cust cust = new cust(); // object of customer
		do {
			System.out.println("1.Admin");
			System.out.println("2.customer");
			System.out.println("enter your choice: ");
			int ans = s.nextInt();

			switch (ans) {
			case 1:
				System.out.println("1. Add customer");
				System.out.println("2. Update customer");
				System.out.println("3. Delete customer");
				System.out.println("4. List all customer");
				System.out.println("5. specific customer details");
				System.out.println("6.Exit");
				System.out.println("Enter choice : ");
				int ch = s.nextInt();

				if (ch == 1) {
					ar.add(admin.addcustomer());

					break;
				} else if (ch == 2) {
					bool = false;
					System.out.println("acc. No : ");
					int acc = s.nextInt();
					for (bank obj : ar) {
						if (obj.getAccountNo() == acc) {
							bool = true;
							admin.updatecustomer(obj);

						}
					}
					if (!bool) {
						System.out.println("Customer not found ");
					}

					break;

				} else if (ch == 3) {
					bool = false;
					System.out.println("Account No : ");
					int acc = s.nextInt();
					for (bank obj : ar) {
						if (obj.getAccountNo() == acc) {
							bool = true;
							ar.remove(obj);

						}

					}
					if (!bool) {
						System.out.println("Customer not found ");
					}
					break;
				}

				else if (ch == 4) {
					for (bank obj : ar) {
						System.out.println(" AccountNo : " + obj.getAccountNo() + " Customer Names : "
								+ obj.getCustomerNames() + " AccountType : " + obj.getAccountType() + " Balance "
								+ obj.getBalance() + " MobileNumber : " + obj.getMobileNumber() + " EmailId : "
								+ obj.getEmailId() + " ATMPin : " + obj.getATMPin());
					}
					break;
				}

				else if (ch == 5) {
					bool = false;
					System.out.println("acc. No : ");
					int acc = s.nextInt();
					for (bank obj : ar) {
						if (obj.getAccountNo() == acc) {
							bool = true;
							admin.specificcustomer(obj);
						}

					}
					if (!bool) {
						System.out.println("Customer not found ");
					}
					break;
				}

				else {
					break;
				}

			case 2:
				System.out.println("1. Deposite");
				System.out.println("2. withdraw");
				System.out.println("3. show balance");
				System.out.println("4. Transfer Money");
				System.out.println("5.Exit");
				System.out.println("Enter choice : ");
				int cho = s.nextInt();

				if (cho == 1) {
					bool = false;
					System.out.println("Account No : ");
					int acc = s.nextInt();
					for (bank obj : ar) {
						if (obj.getAccountNo() == acc) {
							bool = true;
							cust.deposit(obj);

						}
					}

					if (!bool) {
						System.out.println("Customer not found ");
					}
					break;
				} else if (cho == 2) {
					System.out.println("Account No : ");
					int acc = s.nextInt();
					for (bank obj : ar) {
						if (obj.getAccountNo() == acc) {
							cust.withdraw(obj);

						}

					}
					break;
				} else if (cho == 3) {
					bool = false;
					System.out.println("Account No : ");
					int acc = s.nextInt();
					for (bank obj : ar) {
						if (obj.getAccountNo() == acc) {
							bool = true;
							cust.showbalance(obj);

						}
					}
					if (!bool) {
						System.out.println("Customer not found ");
					}
					break;
				}

				else if (cho == 4) {
					System.out.println("Account No : ");
					int acc = s.nextInt();
					for (bank obj : ar) {
						if (obj.getAccountNo() == acc) {
							cust.transfer(obj);

						}
					}
					break;
				}
			default:
				break;
			}
			System.out.println("press 1 to continue : ");
			chrr = s.nextInt();
		} while (chrr == 1);
	}
}
