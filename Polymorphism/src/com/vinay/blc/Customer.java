package com.vinay.blc;

class Customer {
	protected String name;
	protected double total;
	public Customer(String name) {
		super();
		if(name.isBlank()) {
			System.err.println("Invalid");
		}else {
			this.name = name;			
		}
	}
		public double calculateBill(double ...prices){
			total = 0;
			for(double p:prices) {
				if(p<0) {
					System.out.println("Item price cannot be negative.");
	                System.exit(0);
				}
				total+=p;
			}
			return total;

}
		public void printDetails() {
			System.out.println("Welcome to Hyderabad Mall  :");
	        System.out.println("Customer: " + name);
	        System.out.println("Total cost RS : " + total);
	        System.out.println("Discount: No discount for general customers.");		}
}
