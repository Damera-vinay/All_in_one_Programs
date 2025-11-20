package com.vinay.elc;

import java.util.Scanner;

import com.vinay.blc.NextMultipleOfHundred;
public class NextMultipleOfHundreds{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numnber");
		int num = sc.nextInt();
	    int res = NextMultipleOfHundred.getNextMultipleOfHundred(num);	
		System.out.println("result is :"+res);
        sc.close();
	}

}
