package com.sgtesting.javautil;

public class UnboxingDemo {
    public static void main(String[] args) {
        unBoxing();
    }

    private static void unBoxing()
    {
        Integer a=Integer.valueOf(55);
        System.out.println("Integer a :"+a);
        //Convert to primitive
        int b=a.intValue();
        System.out.println("int b:"+b);
        //Unboxing
        int c=a;
        System.out.println("int c:"+c);
    }
}
