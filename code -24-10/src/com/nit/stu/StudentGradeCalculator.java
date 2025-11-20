package com.nit.stu;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter marks");
		int marks = Integer.parseInt(sc.nextLine());
		
		Student data = new Student(name,marks);
		System.out.println(CalculateStudentGrade.calculateGrade(data));
		

	}

}
