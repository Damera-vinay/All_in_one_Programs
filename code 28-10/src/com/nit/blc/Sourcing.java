package com.nit.blc;

public class Sourcing 
{
	private int sourceId;
	private String sourcaName;
	private double basicSalary;
	private double HRAPer;
	private double DAPer;
	private int enrollmentTarget;
	private int enrollmentReached;
	private double perkPerEnrollment;
	public Sourcing(int sourceId, String sourcaName, double basicSalary, double HRAPer, double DAPer,
			int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
		super();
		this.sourceId = sourceId;
		this.sourcaName = sourcaName;
		this.basicSalary = basicSalary;
		this.HRAPer = HRAPer;
		this.DAPer = DAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
		
	}
	public double calculateGrossSalary() {
		return this.basicSalary +this.HRAPer +this.DAPer +(((this.enrollmentReached/this.enrollmentTarget)*100)*this.perkPerEnrollment);
	}
	
	
	

}
