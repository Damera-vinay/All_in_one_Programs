package com.nit.blc;

public class EmployeeData 
{
	private int id;
	private String name;
	private double salary;


public void setEmployeeDetails(int id,String name,double salary) 
{
	
	this.id =id;
	this.name = name;
	this.salary=salary;
}
public void calculateSalaryIncrement() {
	
	double sal =0;
	if(salary <50000) {
		sal=(salary*10/100);
		
	}
	else if(salary>50000 && salary<=80000) {
		sal=(salary*7/100);
	}
	else{
		sal=(salary*5/100);
		
	}
	salary+=sal;
	System.out.println("----- Salary Increment Details -----");
	System.out.println("Salary Increment Amount"+(sal));
	System.out.println("Updated Salary:"+salary);
	
}
@Override
public String toString() {
	System.out.println("----- Employee Information -----");
	return "EmployeeData [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}