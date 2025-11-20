package com.vinay.blc;

public class StudentData 
{
	String StudentName;
	int Studentid;
	int SutdentMarks;
	char SutdentGrade;    

public void displayDetails(String name,int id ,int marks) {
	StudentName=name;
	Studentid = id;
	SutdentMarks=marks;	
}
public void calculateGrade() {
	System.out.println("name of student is name:"+StudentName);
	System.out.println("name of student is id:"+Studentid);
	System.out.println("name of student is marks:"+SutdentMarks);
	if(SutdentMarks>90){
		SutdentGrade='A';
		
	}else if(SutdentMarks<=90 && SutdentMarks>=81){
		SutdentGrade='B';	
		
	}else if(SutdentMarks<=80 && SutdentMarks>=71){
	SutdentGrade='C';	
	
    }
	else if(SutdentMarks<=70 && SutdentMarks>=61){
	SutdentGrade='D';	
}
	else{
		SutdentGrade='E';	
		
	}
	System.out.println("name of student is marks:"+SutdentGrade);
	
}
}