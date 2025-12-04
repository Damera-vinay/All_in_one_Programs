package com.vinay.blc;

public class PrimeCustomer extends Customer {
	protected double discountRate = 10.0;

	public PrimeCustomer(String name) {
		super(name);
	}
        public double calculateBill(double... prices) {
        	return super.calculateBill(prices);        	
        }
        public void printDetails() {
        	double discount = (total* discountRate)/100;
        	double finalAmount = total-discount;
        	
        	System.out.println("Welcome to Hyderabad Mall :");
            System.out.println("Customer: " + name);
            System.out.println("Total cost RS :" + total);
            System.out.println("Discount RS :" + discount);
            System.out.println("Final amount RS :" + finalAmount);
        }
	

}
