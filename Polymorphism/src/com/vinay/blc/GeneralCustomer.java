package com.vinay.blc;

public class GeneralCustomer extends Customer {

	public GeneralCustomer(String name) {
		super(name);
		
	}
	@Override
	public double calculateBill(double... prices) {
		return super.calculateBill(prices);
	}
	

}
