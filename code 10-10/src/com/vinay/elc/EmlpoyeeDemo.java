package com.vinay.elc;

import java.util.Scanner;

import com.vinay.blc.Employee;

public class EmlpoyeeDemo {

	private static final String String = null;

	public static void main(String[] args) {
		Employee data = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a id :");
		int id =  sc.nextInt();
		System.out.println("Enter a name :");
		String name  = sc.next();
		System.out.println("Enter a Salary :");
		double salary  = sc.nextDouble();
		data.setEmployeedata(id,name, salary);
		data.getEmployeeData();	
		
		
	}
	}
//		Employee data = new Employee();
//		Scanner sc =new Scanner(System.in);
//		
//		System.out.println("Enter Employee id :");
//		int id = sc.nextInt();
//		System.out.println("Enter Employee name :");
//		String name = sc.next();
//		System.out.println("Enter Employee Salary :");
//		double salary = sc.nextDouble();
//		
//		data.Emloyeedata(id, name, salary);
//		data.getEmployeeData();
//		
//
//	}
//
//}
