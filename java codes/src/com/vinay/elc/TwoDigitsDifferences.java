package com.vinay.elc;

import java.util.Scanner;

import com.vinay.blc.TwoDigitsDifference;

public class TwoDigitsDifferences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int num = sc.nextInt();
		int res = TwoDigitsDifference.getDiffOfDigits(num);
		System.out.println("result is :"+res);
        sc.close();
	}

}
