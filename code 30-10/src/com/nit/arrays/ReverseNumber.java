package com.nit.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
    	Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = Integer.parseInt(sc.nextLine());
System.out.println("Enter array "+n+" of elements :");
		
		int arr1[] = new int[n];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		reverseNumbers.reverse(arr1);
	}
}


class reverseNumbers{
	public static void reverse(int brr[]) 
	{
	for(int j=brr.length-1;j>=0;j--) {
		System.out.print(brr[j]);
	}
	
	}	
}