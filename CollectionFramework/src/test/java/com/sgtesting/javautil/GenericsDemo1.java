package com.sgtesting.javautil;
class Sample<T>
{
    T obj=null;
    void add(T obj)
    {
        this.obj=obj;
    }

    T get()
    {
        return obj;
    }
}
public class GenericsDemo1 {
    public static void main(String[] args) {
        //With Generic Approach of Object Creation
        Sample<Integer> obj1=new Sample<Integer>();
        obj1.add(45);
        int v1=obj1.get();
        System.out.println(v1);
        obj1.add(75);
        int v2=obj1.get();
        System.out.println(v2);
        // Without Geenrics
        Sample obj2=new Sample();
        obj2.add("Mango");
        String s1=(String) obj2.get();
        System.out.println(s1);
        obj2.add(12.75);
        double d1=(double) obj2.get();
        System.out.println(d1);
    }
}
