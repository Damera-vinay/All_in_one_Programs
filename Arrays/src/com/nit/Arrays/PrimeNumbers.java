package com.nit.Arrays;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size :");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter size "+size+"of elements :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
			
		for(int i=0;i<arr.length;i++) {
			int c=0;
			for(int j=1;j<=arr[i];j++) 
			{
				if(arr[i]%j==0) 
				{
					c++;
					
				}
			
		}
		if(c==2){
			System.out.println(arr[i]);
		}
		}
	
	}
//	
//	public static void main(String[] args) {
//
//		int arr[] = { 11, 2, 3, 4, 5, 6, 7 };
//
//		for (int i = 0; i < arr.length; i++) {
//			int c = 0;
//			for (int j = 1; j <= arr[i]; j++) {
//				if (arr[i] % j == 0)
//					c++;
//			}
//			if (c == 2)
//				System.out.println(arr[i]);
//		}
//
//	}
//
//}


}
