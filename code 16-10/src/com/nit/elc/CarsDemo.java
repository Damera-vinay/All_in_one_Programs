package com.nit.elc;

import java.util.Scanner;

import com.nit.blc.CarsData;

public class CarsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter car model");
		String model = sc.nextLine();
		System.out.println("Enter car year");
		int year = Integer.parseInt(sc.nextLine());
		System.out.println("Enter car price");
		double price = Double.parseDouble(sc.nextLine());
		
		CarsData car = new CarsData(model,year,price);
		System.out.println(car);		
		
		car.toString();
		sc.close();
		

	}

}
