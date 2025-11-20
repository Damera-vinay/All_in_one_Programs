package com.vinay.cases;

import java.util.Scanner;

public class EmployeeDatas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first Name :");
//		
//		System.out.println("Enter first Sccond Name :");
//		
//		System.out.println("Enter first id :");
		System.out.println("Enter  salary :");
		
		double sal = sc.nextDouble();
		System.out.println("Enter first no of projects :");
		int pro = sc.nextInt();
		
/*	double bonus = */switch(pro){
		
		case  0,1,2,3,4 ->{    
			  sal+=1000;
			}
		
		case  5,6,7,8,9,10 ->{
			sal+=5000;
			}
		
		case  11,12,13,14,15,16,17,18,19,20 ->{sal+=10000;}
		
		default ->{ sal+=15000;}
		
		}
	   System.out.println("bonus is "+sal);
		
		
	}

}
