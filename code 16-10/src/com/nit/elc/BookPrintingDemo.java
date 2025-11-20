package com.nit.elc;

import java.util.Scanner;

import com.nit.blc.BookPrinting;

public class BookPrintingDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  title :");
		String title  = sc.nextLine();
		System.out.println("Enter author :");
		String author  = sc.nextLine();
		System.out.println("Enter book price :");
		double price  = Double.parseDouble(sc.nextLine());
        
		System.out.println("Enter book discount :");
//		double discount  = Double.parseDouble(sc.nextLine());
		
		BookPrinting bp = new BookPrinting(title,author,price);
		System.out.println(bp);
		bp.Disount(discount);
		sc.close();
		
	}

}
