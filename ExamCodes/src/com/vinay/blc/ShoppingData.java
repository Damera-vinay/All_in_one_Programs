package com.vinay.blc;

public class ShoppingData{
	public static double calculateDiscount(double bill){
		double sum = 0;
		if(bill>=5000) {
			sum=bill-(0.25*bill);
		}
		else if(bill>=3000) {
			sum = bill-(0.15*bill);
		}else if(bill>=1000) {
			sum = bill-(0.10*bill);
		}else {
			sum = bill-(0.5*bill);
		}
		return sum;
	}
	
	
	

}
