package com.nit.stu;

public class CalculateStudentGrade 
{
	public static StudentGrade calculateGrade(Student obj) 
	{
		int marks = obj.getMarks();
//		StudentGrade grade=new StudentGrade();
		if(marks >90) {
			return new StudentGrade(obj,'A');
//		 grade.setStudentGrade('A'); ;
		}
		else if (marks>=75 && marks <90 ) {
			return new StudentGrade(obj,'B');
		}else if(marks >=60 && marks <75) {
			return new StudentGrade(obj, 'C');
				
			}else {
				return new StudentGrade(obj, 'D');
		}		
	}

}
