package com.nit.Inheritence;

class Base
{
      public Base(String s)
      {
        System.out.println("Base class parameterized String");
      }
      public Base(int i)
      {
 	   System.out.println("Base class parameterized int");
      }
}
class Derived extends Base
{
      public Derived(String s)
      {
         super(s);
         System.out.println("Derived class parameterized String");
      }
      public Derived(int i)
      {
            super(i);
         System.out.println("Derived class parameterized int");
      }
}
public class Test
{
  public static void main(String[] argv)
  {
	   new Derived("Java");
	   //new Derived(10);
  }
}


