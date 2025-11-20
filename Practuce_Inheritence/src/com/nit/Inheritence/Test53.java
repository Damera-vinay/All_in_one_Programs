package com.nit.Inheritence;

public class Test53
{
	int x = 10; 
	public static void main(String[] args) 
	{ 	 
		Test53 obj = passObject(null);
		System.out.println(obj.x);
	}
	
	static
	{ 
	  Test53 t = new Test53();	
	  System.out.print(t.x + " "); 
	  passObject(t);
	} 
	
	public static Test53 passObject(Test53 t1)
	{
		return t1;
		
	}	
}

