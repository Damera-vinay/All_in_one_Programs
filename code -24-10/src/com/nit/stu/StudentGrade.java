package com.nit.stu;

public class StudentGrade {
	private Student student;
	private char studentGrade;
	
	
	public StudentGrade(Student student, char studentGrade) {
		super();
		this.student = student;
		this.studentGrade = studentGrade;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		student = student;
	}


	public char getStudentGrade() {
		return studentGrade;
	}


	public void setStudentGrade(char studentGrade) {
		studentGrade = studentGrade;
	}


	@Override
	public String toString() {
		return "The Student "+this.student+" has '"+this.studentGrade+"' Grade.";
	}
	
	
	
	

}
