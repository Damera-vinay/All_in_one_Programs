package com.nit.elc;

public class EmployeeDemo {
	protected int EmployeeId;
	protected String EmployeeName;
	protected double EmployeeSalary;

	public EmployeeDemo(int employeeId, String employeeName, double employeeSalary) {
		super();
		if (employeeId >0) {
			EmployeeId = employeeId;
		}else {
			System.err.println("Invalid Employee Id");
			System.exit(0);
		}

		EmployeeName = employeeName;
		
		EmployeeSalary = employeeSalary;

	}
}
