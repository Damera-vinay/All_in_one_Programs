package com.nit.blc;

public class PrincipulAmount
{
   private double principal;
   private double interestRate;
   private int durationMonths;
   public PrincipulAmount(double principal, double intrest, int durationMonths) {
	super();
	if(principal >0) {
	this.principal = principal;
	}else {
	
	System.err.println("Error");
	System.exit(0);
	}
	if(intrest>0) {
	this.interestRate = intrest;
	}
	else{System.err.println("Error");
	System.exit(0);
	
	}
	if(durationMonths>0) {
	this.durationMonths = durationMonths;
	}else {
	System.err.println("Error");
	System.exit(0);
   }
	}
   public double getPrincipal() {
	return principal;
   }
//   public void setPrincipal(double principal) {
//	this.principal = principal;
//   }
   public double getInterestRate() {
	return interestRate;
   }
//   public void setInterestRate(double interestRate) {
//	this.interestRate = interestRate;
//   }
   public int getDurationMonths() {
	return durationMonths;
   }
//   public void setDurationMonths(int durationMonths) {
//	this.durationMonths = durationMonths;
//   }
   
   
   
}

