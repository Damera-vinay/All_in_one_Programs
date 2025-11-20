package com.nit.blc;

import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//Employee data tax
		System.out.println("Enter employeeId :");
        int id = Integer.parseInt(sc.nextLine());
		
        System.out.println("Enter employee Name :");
		String name = sc.nextLine();
		
		System.out.println("Enter basicSalary :");
		double salary = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter HRAPer :");
		double HRAPer = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter DAPer :");
		double DAPer = Double.parseDouble(sc.nextLine());
		
		Employee e = new Employee(id, name, salary, HRAPer, DAPer);
		
		TaxUtil Tax=new TaxUtil();
		System.out.println(Tax.calculateTax(e));
		
		
		
		//Manager data tax
		
		System.out.println("Enter manager Id :");
        int id1 = Integer.parseInt(sc.nextLine());
		
        System.out.println("Enter  manager Name :");
		String name1 = sc.nextLine();
		
		System.out.println("Enter basicSalary :");
		double salary1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter HRAPer :");
		double HRAPer1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter DAPer :");
		
		double DAPer1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter projectAllowance :");
		double proall = Double.parseDouble(sc.nextLine());
		
		Manager m = new Manager(id1, name1, salary1, HRAPer1, DAPer1, proall);
		
		TaxUtil Tax1 = new TaxUtil();
		System.out.println("manger tax is "+Tax1.calculateTax(m));
	
		
		//

		System.out.println("Enter trainerId :");
        int tid = Integer.parseInt(sc.nextLine());
		
        System.out.println("Enter  trainerName :");
		String tname = sc.nextLine();
		
		System.out.println("Enter basicSalary :");
		double tsalary = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter HRAPer :");
		double tHRAPer = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter DAPer :");
		double tDAPer = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter batchCount :");
        int batchCount = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter perkPerBatch :");
        double perkPerBatch = Double.parseDouble(sc.nextLine());
        
		
		
		Trainer t = new Trainer(tid, tname, tsalary, tHRAPer, tDAPer, batchCount, perkPerBatch);
		
		TaxUtil trainerTax = new TaxUtil();
		System.out.println(trainerTax.calculateTax(t));
		
		
		System.out.println("Enter manager Id :");
        int s_id = Integer.parseInt(sc.nextLine());
		
        System.out.println("Enter  manager Name :");
		String s_name = sc.nextLine();
		
		System.out.println("Enter basicSalary :");
		double s_salary = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter HRAPer :");
		double s_HRAPer = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter DAPer :");
		double s_DAPer = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter enrollmentTarget :");
        int enrollmentTarget = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter enrollmentReached :");
        int enrollmentReached = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter perkPerEnrollment :");
        double perkPerEnrollment = Double.parseDouble(sc.nextLine());
        
        Sourcing s = new Sourcing(tid, s_name, s_salary, s_HRAPer, s_DAPer, enrollmentTarget, enrollmentReached, perkPerEnrollment);      
        
        System.out.println("Sourcing is "+Tax.calculateTax(s));  
		
		
		
		
		
		
		
		

	}

}
