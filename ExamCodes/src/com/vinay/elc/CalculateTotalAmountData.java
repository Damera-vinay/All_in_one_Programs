package com.vinay.elc;

import java.util.Scanner;

import com.vinay.blc.CalculateTotalAmount;

public class CalculateTotalAmountData {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Cutomer Name:");
			String name = sc.nextLine();
			System.out.println("Enter Hotal Nmae:");
			String Hname = sc.nextLine();
			System.out.println("Enter Room Rate per Day :");
			double Rent = sc.nextDouble();
			System.out.println("Enter Number of Days Stayed:");
			int day =sc.nextInt();
			
			double total = CalculateTotalAmount.calculateDiscountedAmount(day,Rent);
			double discountedTotal = CalculateTotalAmount.calculateDiscountedAmounts(day, Rent);
	        double discount = total - discountedTotal;

			System.out.println("\n----- Bill Summary -----");
	        System.out.println("Customer Name : " + name);
	        System.out.println("Hotel Name    : " + Hname);
	        System.out.println("Days Stayed   : " + day);
	        System.out.println("Rate per Day  : ₹" + Rent);
	        System.out.println("Total Amount  : ₹" + discount);

			

	}

}
