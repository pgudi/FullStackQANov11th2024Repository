package com.sgtesting.javautil;

public class AutoboxingDemo {
    public static void main(String[] args) {
        autoBoxing();
    }

    private static void autoBoxing()
    {
        int a=35;
        System.out.println("int a:"+a);
        //coverting to wrapper object
        Integer b=Integer.valueOf(a);
        System.out.println("Integer b :"+b);
        //Autoboxing
        Integer c=a;
        System.out.println("Integer c :"+c);
    }
}
