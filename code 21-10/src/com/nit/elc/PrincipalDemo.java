package com.nit.elc;

import java.util.Scanner;

import com.nit.blc.PrincipulAmount;

public class PrincipalDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Amount :");
		double amount = Double.parseDouble(sc.nextLine());
		System.out.println("ENter intrest :");
		double intrest = Double.parseDouble(sc.nextLine());
		System.out.println("Enter Duration Months :");
		int duretion = Integer.parseInt(sc.nextLine());
		
		
		
		PrincipulAmount Intrest =  new PrincipulAmount(amount,intrest,duretion);
		
		
		System.out.println(Intrest);
		
		System.out.println("Principal :"+Intrest.getPrincipal());
		System.out.println("Interest Rate (Yearly %) :"+Intrest.getInterestRate());
		System.out.println("Duration (months):"+Intrest.getDurationMonths());

}}
