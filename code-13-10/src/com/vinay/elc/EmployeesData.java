package com.vinay.elc;


import java.util.Scanner;

import com.vinay.blc.EmployeeData;

public class EmployeesData {

	public static void main(String[] args) {
		EmployeeData em = new EmployeeData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee firstname");
		String fi = sc.next();
		System.out.println("Enter Employee SecondName");
		String SC = sc.next();
		
		System.out.println("Enter Employee EmployeeId");
		int id = sc.nextInt();
		System.out.println("Enter Employee Salary");
		double sal = sc.nextLong();
		System.out.println("Enter Employee no Of Projects");
		int n = sc.nextInt();
		em.setEmployeeData(fi, SC, id, sal, n);
		em.calculateSalary();
		
		
		

	}

}
