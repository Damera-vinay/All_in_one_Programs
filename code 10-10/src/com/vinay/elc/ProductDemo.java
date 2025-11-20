package com.vinay.elc;

import java.util.Scanner;

import com.vinay.blc.Product;


public class ProductDemo {

	public static void main(String[] args) {
		Product pd =new Product();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter productId");
		int id = sc.nextInt();
		System.out.println("Enter product");
		String name = sc.next();
		
		System.out.println("Enter productId");
		double price = sc.nextDouble();
		pd.productdata(id, name, price);
		pd.getProductInfo();
		
	}

}
