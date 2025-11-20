package com.nit.blc;

public class ProductData {
	private int id;
	private String name;
	private double price;

public void setProductDetails(int id ,String name,double price) {
	this.id =id;
	this.name = name;
	this.price=price;
}	
public void calculateDiscount() {
	double discount =0;
	
		if(price<1000) {
			discount =price*0.5;
		}else if(price>=1000 && price <=5000) {
			discount =price*0.10;
		}else{
		discount =price*0.15;
	}
		price-=discount;
	System.out.println("Discount Amount :"+discount);
	System.out.println("Price After Discount :"+price);
	}

	public String toString() {
		return "ProductData [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

		
	}

