package com.nit.Inheritence;

class OutPut
{
    public static void main(String s[])
    {
        int i = 2;
        B b = new B();
        b.execute();
    }
}

class A
{
    A()
    {
        int i = 1;
    }
}

class B extends A
{
    void execute()
    {
        System.out.println("i = " + this.i);
    }
}
