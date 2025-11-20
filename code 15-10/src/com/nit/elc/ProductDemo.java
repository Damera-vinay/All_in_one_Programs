package com.nit.elc;

import java.util.Scanner;

import com.nit.blc.ProductData;

public class ProductDemo {

	public static void main(String[] args) {
		ProductData pd = new ProductData() ;
			Scanner sc = new Scanner(System.in); 
			System.out.println("Enter product id :");
            int id = Integer.parseInt(sc.nextLine());			
			
			System.out.println("Enter product name :");
		    String name = sc.nextLine();
			System.out.println("Enter product price");
			double price = Double.parseDouble(sc.nextLine());
			
			pd.setProductDetails(id, name, price);
			System.out.println(pd);
			pd.calculateDiscount();		
			sc.close();
			

	}

}
