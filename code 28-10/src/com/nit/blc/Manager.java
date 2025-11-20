package com.nit.blc;

public class Manager 
{
	
	private int mangerId; 
	private String managerName;
	private double BasicSalary;
	private double HRAPer;
    private double DAPer;
    private double projectAllowance;
    
	public Manager(int mangerId, String managerName, double basicSalary, double HRAPer, double DAPer,double projectAllowance) {
		super();
		this.mangerId = mangerId;
		this.managerName = managerName;
		this.BasicSalary = basicSalary;
		this.HRAPer = HRAPer;
		this.DAPer = DAPer;
		this.projectAllowance= projectAllowance;
		
	}
	
    public double calculateGrossSalary() {
    	return this.BasicSalary +this.HRAPer +this.DAPer + this.projectAllowance;
    }
	
}
