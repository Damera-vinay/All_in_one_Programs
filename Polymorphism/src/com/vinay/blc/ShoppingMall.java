package com.vinay.blc;
import java.util.Scanner;
public class ShoppingMall {

	public static void main(String[] args) {
		
		System.out.println("Please select the Customer Type to get additional Discount :");
		System.out.println("\t 1) General Customer");
		System.out.println("\t 2) Prime Customer");
		System.out.println("\t 3) VIP Customer");
		
		System.out.println("choose one :");
		Scanner sc =new Scanner(System.in);
		Customer c;
		
		int choice = Integer.parseInt(sc.nextLine());
		System.out.println("Enter custmor name");
		String name = sc.nextLine();
		
		System.out.println("Enter no of Items");
		int items = Integer.parseInt(sc.nextLine());
		
		double itemPrice[] = new double[items];
		for(int i=0;i<items;i++) {
			System.out.println((i + 1) + ") Item Name :");
			String itemname=sc.nextLine();
			System.out.println("   Item Price :");
			
			itemPrice[i] = Double.parseDouble(sc.nextLine());
		}
		switch(choice){
		case 1 ->{
			
			
			
			c=new GeneralCustomer(name);
			
                   
		    c.calculateBill(itemPrice);
		    c.printDetails();
		}
		
		
		case 2 ->{
			
			
			
			
			c = new PrimeCustomer(name);
            c.calculateBill(itemPrice);
            c.printDetails();
        }
		
		
		case 3 ->{
			

	            c = new VIPCustomer(name);
	            c.calculateBill(itemPrice);
	            c.printDetails();
		    				
		}
		default ->{
			 System.out.println("Invalid choice!");
		}
			
		
		}
		sc.close();
	}
}
