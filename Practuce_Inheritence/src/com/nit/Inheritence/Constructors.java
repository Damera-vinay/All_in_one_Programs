package com.nit.Inheritence;


public class Constructors
{
   public static void main(String[] args)
   {
       new A1(3);
       new B1(5, 6);
       new B1(6, 7).C(1, 2, 3);
       new C(3, 3, 4).B(4, 5);
       new C(1, 1, 1);
   }
}
class A1
{
   A1(int i)
   {
     print(i * 2);
   }
   void print(int i)
   {
   System.out.print(i + " ");
   }
}
class B1 extends A1
{
   B1(int j, int k)
   {
       super(j);
       print(k * 4);
   }
   void C(int j, int k, int l)
   {
     print(j + k + l - 3);
   }
}
class C extends B1
{
   C(int j, int k, int l)
   {
       super(j, k);
       print(l - 3);
   }
   void B(int i, int k)
   {
     print(i * 6);
   }
}
