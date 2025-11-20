package com.nit.Inheritence;

class BaseClass{
    BaseClass()
    {
        System.out.print("*");
    }
    BaseClass(String str) 
    {
        this();
        System.out.print("@" + str);
    }
}
public class ChildClass extends BaseClass {
    ChildClass()
    {
        super();
        System.out.print("#");
    }
    ChildClass(String name) 
    {
        this();
        System.out.print("$" + name);
    }
    public static void main(String args[]) 
    {
        new ChildClass("hello");
    }
}
