package com.nit.elc;

import java.util.Scanner;

import com.nit.blc.EmployeeData;

public class EmployeeDemo {

	public static void main(String[] args) {
		EmployeeData nit = new EmployeeData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id :");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter name :");
		String name = sc.nextLine();
		System.out.println("Enter Salary :");
		double salary = Double.parseDouble(sc.nextLine());
		nit.setEmployeeDetails(id, name, salary);
		System.out.println(nit);
		
		nit.calculateSalaryIncrement();
        sc.close();
	}

}
