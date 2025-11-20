package com.vinay.blc;

public class Bank {
	private String customerName;
	private int accountNumber;
	private double currentBalance;
	public static String bankName= "Sbi";
	public static String bankAddress="Huderabad";
	public static String bankIFSCCode = "SBIN0000123";

public void setCustomerDeatils(String name,int accNumber,double balance)
{
	customerName = name;
	accountNumber = accNumber;
	currentBalance = balance;
}
public void deposit(double amount) 
{
	if(amount>0) 
	{
		currentBalance+=amount;	
		System.out.println("deposit sucessfull "+amount+"debited.");
	}
}
public void withdraw(double amount)
{
	if(amount <currentBalance) {
		currentBalance-=amount;
	
		System.out.println("Withdral sucessfull "+amount+"debited.");	
	}
	else {
		System.out.println("Insufficiant Balance");
	}
}
public double getCurrentBalance()
{
	return currentBalance;
}
public String displayDetails() {
	return "[Name="+customerName+", AccountNumber="+accountNumber+", Balance="+currentBalance+"]";
}
}
