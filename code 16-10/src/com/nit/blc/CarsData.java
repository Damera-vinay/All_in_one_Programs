package com.nit.blc;

public class CarsData
{
	private String model;
	private int year;
	
	private double price;

	public CarsData(String model, int year, double price) {
		super();
		this.model = model;
		if(year>2010) {
			this.year = year;
         			
		}else {
			System.err.println("year must be greater than 2010");
			System.exit(0);
		}
		if(price>0) {
		this.price = price;
				
		}else {
        System.err.println("Price must be positive integer");		
        System.exit(0);
		}
	}

	@Override
	public String toString() {
		return "CarsData [model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
	
	

}
