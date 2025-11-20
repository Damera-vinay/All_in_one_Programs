//Program 02:
//-----------
//Write a Program on OOPs to define Employee class properties and behaviour.
//
//properties/Field/Attribute :
//
//employeeId : int
//employeeName : String
//employeeSalary : double


package com.vinay.blc;

public class Employee {
	int EmployeeId;
	String Employeename;
	double EmployeeSalary;
	public void setEmployeedata(int id, String name,double salary) {
		EmployeeId = id;
		Employeename=name;
		EmployeeSalary=salary;
		
	}public void getEmployeeData() {
		System.out.println("Employee id is"+EmployeeId);
		System.out.println("Employee name is"+Employeename);
		System.out.println("Employee Salary is"+EmployeeSalary);
	}
	
	
	
}
	
	
	
	
	
	
//	int employeeId;
//	String employeeName;
//	double employeeSalary;
//	public void Emloyeedata(int a, String b,double c) {
//		employeeId = a;
//		employeeName=b;
//		employeeSalary = c;
//		
//	}
//		
//	public void getEmployeeData(){
//		System.out.println("EmployeeId is "+employeeId);
//		System.out.println("EmployeeId is "+employeeName);
//		
//		System.out.println("EmployeeId is "+employeeSalary);
//	}
	

//}
