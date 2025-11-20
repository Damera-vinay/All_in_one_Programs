package com.vinay.blc;

public class CalculateTotalAmount{
	public static double calculateDiscountedAmount(int day,double Rent){
	return day*Rent;
}
	public static double calculateDiscountedAmounts(int day,double Rent){
		double total =day*Rent;


	
		
	double sum=0;
//	double total=2000;
	if(day>=1 && day<=2) {
		sum = 0;
	}else if(day>=3 && day<=4) {
		sum = 0.05*total;
	}
	else if(day>=5 && day<=9) {
		sum = 0.10*total;
		
	
	}else if(day>=10) {
		sum = 0.20*total;
	}
	return total-sum;
}
}
