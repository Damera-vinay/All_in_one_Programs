package com.nit.arrays;

import java.util.Scanner;

public class EvenAndOdd 
{
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter numbers :");
	int num = sc.nextInt()
			;
	System.out.println("Enter array "+num+" of elements :");
	int arr[]= new int[num];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}
	
for(int k=0;k<=arr.length;k++) {
     if(arr[k]%2==0) {
	System.out.println("Even Elements are "+arr[k]);}
     
	for(int j=0;j<arr.length;j++) {
		arr[j]=sc.nextInt();
		if(arr[j]%2!=0) {
			System.out.println("odd is :"
					+ " are "+arr[j]);
		}
	}
}
}
}
