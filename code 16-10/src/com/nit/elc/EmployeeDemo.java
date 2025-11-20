package com.nit.elc;

import java.util.Scanner;

import com.nit.blc.Employee;

public class EmployeeDemo {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter FirstName :");
	String fName = sc.nextLine();
	System.out.println("Enter lastName :");
	String lName = sc.nextLine();
	System.out.println("Enter  employeeId :");
	int eId = Integer.parseInt(sc.nextLine());
	System.out.println("Enter Employee  salary :");
	double salary  = Double.parseDouble(sc.nextLine());
	System.out.println("Enter no of Projects :");
	int nop = Integer.parseInt(sc.nextLine());
	
	Employee vinay = new Employee(fName,lName,eId,salary,nop);
	System.out.println(vinay);
	vinay.calculateSalary();
	sc.close();
	
}
}
