package com.nit.elc;

import java.util.Scanner;

import com.nit.blc.Shop;

public class ShopDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item Name :");
		String name = sc.nextLine();

		System.out.println("Enter Price Per Unit:");
		double price = Double.parseDouble(sc.nextLine());

		System.out.println("Enter Quantity In Stock:");
		int stock = Integer.parseInt(sc.nextLine());

		Shop data = new Shop(name, price, stock);
		System.out.println(data);
		System.out.println("Inventory Item Details:");
		System.out.println("Item Name:" + data.getItemName());
		System.out.println("Item Price Per Unit:" + data.getPricePerUnit());
		System.out.println("Quantity in Stock:" + data.getQuantityInStock());
		System.out.println("Total Inventory Value:" + data.calculateTotalValue());

		while (true) {
			System.out.println("Any updation in Stock Price OR Quantity:");
			String update = sc.nextLine();
			if (update.equalsIgnoreCase("yes")) {
				System.out.println("Enter new Price Per Unit:");
				double price1 = Double.parseDouble(sc.nextLine());
				data.setPricePerUnit(price1);

				System.out.println("Enter new  Quantity In Stock:");
				int stock1 = Integer.parseInt(sc.nextLine());
				data.setQuantityInStock(stock1);
				
				

			} else {
				System.exit(0);
			}
			
			

			System.out.println("Inventory Item Details:");
			System.out.println("Item Name:" + data.getItemName());
			System.out.println("Item Price Per Unit:" + data.getPricePerUnit());
			System.out.println("Quantity in Stock:" + data.getQuantityInStock());
			System.out.println("Total Inventory Value:"+data.calculateTotalValue());

		}

	}

}

