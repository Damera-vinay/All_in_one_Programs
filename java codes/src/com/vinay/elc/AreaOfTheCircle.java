package com.vinay.elc;

import java.util.Scanner;
import java.text.DecimalFormat;
import com.vinay.blc.AreaOfCircle;

public class AreaOfTheCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		double ar = sc.nextDouble();
		
		String area = AreaOfCircle.getArea(ar);
		double area2 = Double.parseDouble(area);
//	    String num =  AreaOfCircle.getArea(ar);
		
		DecimalFormat df = new DecimalFormat("00.00");
		String area3 = df.format(area2);
		System.out.println("Area of circle "+area3);

}
	}

