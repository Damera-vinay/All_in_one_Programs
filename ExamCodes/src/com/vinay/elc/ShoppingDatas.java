package com.vinay.elc;

import java.util.Scanner;

import com.vinay.blc.ShoppingData;

public class ShoppingDatas{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Cutomer Name:");
		String name = sc.nextLine();
		System.out.println("Enter Total Bill Amount:");
		double bill = sc.nextDouble();
	    double fn=	ShoppingData.calculateDiscount(bill);
		System.out.println("Amount Payable after Discount: "+fn);
		
		
	}

}
