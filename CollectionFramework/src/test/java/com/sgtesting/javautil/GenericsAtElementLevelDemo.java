package com.sgtesting.javautil;
class Demo
{
    public static <E> void readElements(E[] elements)
    {
        for(E element:elements)
        {
            System.out.println(element);
        }
    }
}
public class GenericsAtElementLevelDemo {
    public static void main(String[] args) {
        String s[]={"Apple","Mango","Orange"};
        Demo.readElements(s);

        Integer[] a={2,4,6,8,10,12};
        Demo.readElements(a);

        Character ch[]={'A','S','D','F'};
        Demo.readElements(ch);
    }
}
