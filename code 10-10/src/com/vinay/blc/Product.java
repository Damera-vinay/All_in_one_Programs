//Program 01:
//-----------
//Write a Program on OOPs to define Product class properties and behaviour.
//
//Properties/Field/Attribute :
//
//productId : int
//productName : String
//productPrice : double

package com.vinay.blc;

//import com.vinay.elc.product;

public class Product{
	int productId;
	String productName;
	double productPrice;
	public void productdata(int a ,String b,double c) {
		productId = a;
		productName =b;
		productPrice = c;
	}
	public void getProductInfo() {
		System.out.println("Product Id :"+productId);
		System.out.println("Product Id :"+productName);
		System.out.println("Product Id :"+productPrice);
	}

}
