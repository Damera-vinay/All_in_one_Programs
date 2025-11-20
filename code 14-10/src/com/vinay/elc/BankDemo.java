package com.vinay.elc;

import java.util.Scanner;

import com.vinay.blc.Bank;

public class BankDemo {
	public static void main(String[] args) {
		
	
	Bank acc = new Bank();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a name :");
	String name = sc.next();
	
	System.out.println("Enter a accountNumber :");
	int  aNum= sc.nextInt();
	
	System.out.println("Enter a currentBalance :");
	int  cBal= sc.nextInt();
	
	acc.setCustomerDeatils(name, aNum, cBal);
	
	for(int i=0;;i++) {
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
	switch(choice) {
	
	case 1->{
		System.out.println("Enter deposit amount :");
		double damount = sc.nextDouble();
		acc.deposit(damount);}
	
	case 2->{
		System.out.println("Enter withdraw :");
		double amount = sc.nextDouble();
		acc.withdraw(amount);}
	
	case 3->
	System.out.println(acc.getCurrentBalance());
	
	
	case 4->
	System.out.println(acc.displayDetails());
	
	case 5->
	System.exit(0);
	
	}
	}	
	}	
	}
