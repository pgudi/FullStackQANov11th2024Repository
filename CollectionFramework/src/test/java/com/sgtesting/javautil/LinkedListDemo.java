package com.sgtesting.javautil;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
    //    addElements();
    //    removeElements();
    //    readElements1();
    //    readElements2();
    //    readElementsByIterator();
    //    readElementsByListIterator();
    //    readElementsByListIterator();
    //    withOutGenerics();
        queueTesting();
    }
    private static void addElements()
    {
        LinkedList<String> obj=new LinkedList<String>();
        System.out.println("Elemenets :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Banana");
        obj.add("Watermelon");
        obj.add(1,"Kiwi");
        obj.add("Mango");
        System.out.println("Elemenets :"+obj);
        LinkedList<String> obj1=new LinkedList<String>();
        obj1.add("Blue");
        obj1.add("Green");
        obj1.add("White");
        obj.addAll(obj1);
        System.out.println("Elemenets :"+obj);
    }

    private static void removeElements()
    {
        LinkedList<String> obj=new LinkedList<String>();
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

    private static void readElements1()
    {
        LinkedList<String> obj=new LinkedList<String>();
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
        LinkedList<String> obj=new LinkedList<String>();
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
        LinkedList<String> obj=new LinkedList<String>();
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

    private static void readElementsByListIterator()
    {
        LinkedList<String> obj=new LinkedList<String>();
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

        ListIterator<String> elements=obj.listIterator();
        System.out.println("Forwrd Direction!!");
        while(elements.hasNext())
        {
            System.out.println(elements.next());
        }
        System.out.println("Backward Direction!!");
        while(elements.hasPrevious())
        {
            System.out.println(elements.previous());
        }
    }

    private static void withOutGenerics()
    {
        LinkedList obj=new LinkedList();
        System.out.println("Elemenets :"+obj);
        obj.add(45);
        obj.add('Y');
        obj.add(true);
        obj.add(10.175);
        obj.add("Lotus");
        System.out.println("Elemenets :"+obj);
    }

    private static void queueTesting()
    {
        Queue<Integer> obj=new LinkedList<Integer>();
        System.out.println("Elemenets :"+obj);
        obj.add(100);
        obj.add(200);
        obj.add(300);
        obj.add(400);
        obj.add(500);
        System.out.println("Elemenets :"+obj);
        obj.remove();
        System.out.println("Elemenets :"+obj);
    }
}
