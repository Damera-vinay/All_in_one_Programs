package com.vinay.blc;

public class EmployeeData {

		String firstName;
		String lastName;
		int employeeId;
		double salary;
		int noOfProject;

	public void setEmployeeData(String finame,String sename,int id , double sal,int n)
	{
		firstName= finame;
		lastName = sename;
		employeeId = id;
		salary = sal;
		noOfProject=n;
	}
	public void calculateSalary() {
		System.out.println("Employee first name"+firstName);
		System.out.println("Employee "+lastName);
		System.out.println("Employee "+employeeId);
		System.out.println("Employee "+salary);
		System.out.println("Employee "+noOfProject);
		if(noOfProject>=5 && noOfProject<=10) {
			salary +=5000;
		}
		else if (noOfProject>=11 && noOfProject<=20) {
			salary +=10000;
		}
		else{
			salary +=10000;
	}
		System.out.println("Total amount is "+salary);

}
	}
