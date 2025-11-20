package com.vinay.elc;


import java.util.Scanner;

import com.vinay.blc.SumOfThreeNumbers;

public class SumOfThreeNumber {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter a number");
		int num2 = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter a number");
		int num3 = sc3.nextInt();	
		
		int res = SumOfThreeNumbers.getsumOfRoundedValues(num1,num2,num3);
		System.out.println("sum of rounded numbers is "+res);
		

	}

}
