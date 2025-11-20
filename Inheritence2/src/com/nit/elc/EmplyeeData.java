package com.nit.elc;

import java.util.Scanner;



public class EmplyeeData {

	public static void main(String[] args) {
		for(int i=0;i<2;i++) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter permanent employee Id :");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter permanent employee Name :");
        String name = sc.nextLine();
        System.out.println("Enter permanent employee Salary :");
        double sal = Double.parseDouble(sc.nextLine());
        System.out.println("Enter contract duration in year :");
        int dure = Integer.parseInt(sc.nextLine());
        
        
        PermanentEmployee pem= new PermanentEmployee(id,name,sal);
        System.out.println(pem);
        
        ContractEmployee c_emp = new ContractEmployee(id, name, sal,dure);
        System.out.println(c_emp);
	}
	}

}
