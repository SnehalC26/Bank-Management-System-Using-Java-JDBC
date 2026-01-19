package com.bank.main;

import java.util.Scanner;

import com.bank.dao.BankOperations;
import com.bank.model.Account;

public class BankApp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	BankOperations bb = new BankOperations();
	while(true) {
		System.out.println("Choose option: ");
		System.out.println("\n--- Bank Menu ---");
		System.out.println("1. Create Account");
		System.out.println("2. Show Account");
		System.out.println("3. Deposit");
		System.out.println("4. Withdraw");
		System.out.println("5. Delete Account");
		System.out.println("6. Exit");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			 System.out.print("Enter Account No: ");
             int accNo = sc.nextInt();
             sc.nextLine();
             System.out.print("Enter Holder Name: ");
             String name = sc.nextLine();
             System.out.print("Enter Balance: ");
             double bal = sc.nextDouble();
             bb.createAccount(new Account(accNo, name, bal));
             break;
		case 2: 
			System.out.println("Enter account no.: ");
			accNo = sc.nextInt();
			bb.showAccount(accNo);
			break;
		case 3:
			System.out.println("Enter account no.: ");
			accNo=sc.nextInt();
			System.out.println("Enter the amount to be deposited: ");
			double dd=sc.nextDouble();
			bb.deposit(accNo, dd);
			break;
		case 4:
			System.out.println("Enter account no.: ");
			accNo=sc.nextInt();
			System.out.println("Enter the amount to be withdrawn: ");
			double d=sc.nextDouble();
			bb.withdraw(accNo, d);
			break;
		case 5:
			System.out.println("Enter account no.: ");
			bb.deleteAccount(sc.nextInt());
			break;
		case 6: 
			System.out.println("Thank you! Visit Again.");
			sc.close();
		default: 
			System.out.println("Invalid option.");
		
		}
	}
}
}
