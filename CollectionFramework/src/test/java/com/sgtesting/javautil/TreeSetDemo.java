package com.sgtesting.javautil;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
     //   addElements();
     //   removeElements();
     //   readElements1();
    //    readElementsByIterator();
        converToArray();
    }

    private static void addElements()
    {
        TreeSet<String> obj=new TreeSet<String>();
        System.out.println("Elemenets :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Banana");
        obj.add("Watermelon");
        obj.add("Kiwi");
        obj.add("Guava");
        obj.add("Kiwi");
        System.out.println("Elemenets :"+obj);
        TreeSet<String> obj1=new TreeSet<String>();
        obj1.add("Blue");
        obj1.add("Green");
        obj1.add("White");
        obj.addAll(obj1);
        System.out.println("Elemenets :"+obj);
    }

    private static void removeElements()
    {
        TreeSet<String> obj=new TreeSet<String>();
        System.out.println("Elemenets :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Banana");
        obj.add("Watermelon");
        obj.add("Kiwi");
        obj.add("Guava");
        obj.add("Pineapple");
        System.out.println("Elemenets :"+obj);
        obj.remove("Kiwi");
        System.out.println("Elemenets :"+obj);
        obj.removeAll(obj);
        System.out.println("Elemenets :"+obj);
    }

    private static void readElements1()
    {
        TreeSet<String> obj=new TreeSet<String>();
        System.out.println("Elemenets :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Banana");
        obj.add("Watermelon");
        obj.add("Kiwi");
        obj.add("Guava");
        obj.add("Pineapple");
        System.out.println("Elemenets :"+obj);
        for(String kk:obj)
        {
            System.out.println(kk);
        }
    }

    private static void readElementsByIterator()
    {
        TreeSet<String> obj=new TreeSet<String>();
        System.out.println("Elemenets :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Banana");
        obj.add("Watermelon");
        obj.add("Kiwi");
        obj.add("Guava");
        obj.add("Pineapple");
        System.out.println("Elemenets :"+obj);
        Iterator<String> elements=obj.iterator();
        while(elements.hasNext())
        {
            System.out.println(elements.next());
        }
    }

    private static void converToArray()
    {
        TreeSet<String> obj=new TreeSet<String>();
        System.out.println("Elemenets :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Banana");
        obj.add("Watermelon");
        obj.add("Kiwi");
        obj.add("Guava");
        obj.add("Pineapple");
        System.out.println("Elemenets :"+obj);
        Object[] arr=obj.toArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
