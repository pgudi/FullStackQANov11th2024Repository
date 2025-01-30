package com.sgtesting.javautil;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
     //   addElements();
     //   removeElements();
     //   readElements();
     //   readElements2();
     //   readElementsByIterator();
        withOutGenerics();
    }

    private static void addElements()
    {
        ArrayList<String> obj=new ArrayList<String>();
        System.out.println("Elemenets :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Banana");
        obj.add("Watermelon");
        obj.add(1,"Kiwi");
        obj.add("Mango");
        System.out.println("Elemenets :"+obj);
        ArrayList<String> obj1=new ArrayList<String>();
        obj1.add("Blue");
        obj1.add("Green");
        obj1.add("White");
        obj.addAll(obj1);
        System.out.println("Elemenets :"+obj);
    }

    private static void removeElements()
    {
        ArrayList<String> obj=new ArrayList<String>();
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
        obj.remove("Kiwi");
        System.out.println("Elemenets :"+obj);
        obj.remove(4);
        System.out.println("Elemenets :"+obj);
        obj.removeAll(obj);
        System.out.println("Elemenets :"+obj);
    }

    private static void readElements()
    {
        ArrayList<String> obj=new ArrayList<String>();
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
        for(String kk:obj)
        {
            System.out.println(kk);
        }
    }

    private static void readElements2()
    {
        ArrayList<String> obj=new ArrayList<String>();
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
        for(int i=0;i<obj.size();i++)
        {
            System.out.println(obj.get(i));
        }
    }

    private static void readElementsByIterator()
    {
        ArrayList<String> obj=new ArrayList<String>();
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
        Iterator<String> elements=obj.iterator();
        while(elements.hasNext())
        {
            System.out.println(elements.next());
        }
    }

    private static void withOutGenerics()
    {
        ArrayList obj=new ArrayList();
        System.out.println("Elemenets :"+obj);
        obj.add(45);
        obj.add('Y');
        obj.add(true);
        obj.add(10.175);
        obj.add("Lotus");
        System.out.println("Elemenets :"+obj);
    }
}
