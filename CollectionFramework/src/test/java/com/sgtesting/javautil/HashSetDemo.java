package com.sgtesting.javautil;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
    //    addElements();
    //    removeElements();
    //    readElements1();
    //    readElemensByIterator();
    //    convertToArray();
        withOutGenerics();
    }

    private static void addElements()
    {
        HashSet<String> obj=new HashSet<String>();
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
        HashSet<String> obj1=new HashSet<String>();
        obj1.add("Blue");
        obj1.add("Green");
        obj1.add("White");
        obj.addAll(obj1);
        System.out.println("Elemenets :"+obj);
    }

    private static void removeElements()
    {
        HashSet<String> obj=new HashSet<String>();
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
        HashSet<String> obj=new HashSet<String>();
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

    private static void readElemensByIterator()
    {
        HashSet<String> obj=new HashSet<String>();
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

    private static void convertToArray()
    {
        HashSet<String> obj=new HashSet<String>();
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

    private static void withOutGenerics()
    {
        HashSet obj=new HashSet();
        System.out.println("Elemenets :"+obj);
        obj.add(45);
        obj.add('Y');
        obj.add(true);
        obj.add(10.175);
        obj.add("Lotus");
        System.out.println("Elemenets :"+obj);
    }
}
