package com.nit.blc;

public class Employee
{
	private int EmployeeId;
	private String EmployeeName;
	private double basicSalary;
	private double HRAper;
	private double DAper;
	public Employee(int employeeId, String employeeName, double basicSalary, double HRAper, double DAper) {
		super();
		this.EmployeeId = employeeId;
		this.EmployeeName = employeeName;
		this.basicSalary = basicSalary;
		this.HRAper = HRAper;
		this.DAper = DAper;
	}
	
	
	public double calculateGrossSalary() {
		return this.basicSalary +this.HRAper +this.DAper;
	}
	
	

}
