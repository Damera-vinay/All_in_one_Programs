package com.vinay.elc;

import java.util.Scanner;

import com.vinay.blc.StudentData;

public class StudentsData {

	public static void main(String[] args) {
		StudentData st =new StudentData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name :");
		String name = sc.next();
		System.out.println("Enter student Id :");
		int id = sc.nextInt();
		System.out.println("Enter student marks :");
		int marks = sc.nextInt();
		st.displayDetails(name, id, marks);
		st.calculateGrade();
		sc.close();
	}

}
