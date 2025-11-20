package com.nit.blc;

public class Employee {
	private String firstName;
	private String stringName;
	private int employeeID;
	private double salary;
	private int NoOfProjects;
	public Employee(String firstName, String stringName, int employeeID, double salary, int noOfProjects) {
		super();
		this.firstName = firstName;
		this.stringName = stringName;
		this.employeeID = employeeID;
		this.salary = salary;
		if(noOfProjects>=5 ) {
		this.NoOfProjects = noOfProjects;
	}else {
		System.err.println("Number of projects must be > 5 & positive");
		System.out.println("Salary remains"+this.salary);
		System.exit(0);
	}
		}
	public void calculateSalary() {
		if(NoOfProjects>5 &&  NoOfProjects<10) {
			salary+=5000;
		}
		else if(NoOfProjects>=10 &&  NoOfProjects<20) {
			salary+=10000;
			
		}else {
			salary+=15000;
			
		}
		System.out.println("the updated salary:"+salary);
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", stringName=" + stringName + ", employeeID=" + employeeID
				+ ", salary=" + salary + ", NoOfProjects=" + NoOfProjects + "]";
	}
	

}
