package com.nit.blc;



public class TaxUtil
{
   
	public double calculateTax(Employee e) {
		double tax=0;
		if(e.calculateGrossSalary()>50000) {
			tax= e.calculateGrossSalary()+((e.calculateGrossSalary()*0.20));
			
		}else {
			tax= e.calculateGrossSalary()+((e.calculateGrossSalary()*0.05));
		}
		return tax;
		
	}
	public double calculateTax(Manager m) {
		double tax=0;
		if(m.calculateGrossSalary()>50000) {
			tax= m.calculateGrossSalary()+(m.calculateGrossSalary()*0.20);
			
		}else {
			tax= m.calculateGrossSalary()+(m.calculateGrossSalary()*0.5);
		}
		return tax;
	}
	public double calculateTax(Trainer t) {
		double tax=0;
		if(t.calculateGrossSalary()>50000) {
			tax= t.calculateGrossSalary()+(t.calculateGrossSalary()*0.20);
			
		}else {
			tax= t.calculateGrossSalary()+(t.calculateGrossSalary()*0.5);
		}
		return tax;
	}
	public double calculateTax(Sourcing s) {
		double tax=0;
		if(s.calculateGrossSalary()>50000) {
			tax= s.calculateGrossSalary()+(s.calculateGrossSalary()*0.20);
			
		}else {
			tax= (s.calculateGrossSalary()*0.5);
			
		}
		return tax;
	}
	
	
	


}
