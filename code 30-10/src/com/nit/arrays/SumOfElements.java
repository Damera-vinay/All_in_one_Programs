package com.nit.arrays;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = Integer.parseInt(sc.nextLine());
        System.out.println("Enter array of elements :");
        int arr[] = new int[n];
        int sum=0;
        for(int i=0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        }
        sum=arr[0]+arr.length;
        
        System.out.println(sum);

	}

}
