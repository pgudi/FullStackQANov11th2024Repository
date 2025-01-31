package com.sgtesting.javautil;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
     //   addElements();
     //   readAndRemoveElements();
        readKeyAndValues();
    }

    private static void addElements()
    {
        HashMap<String,String> obj=new HashMap<String, String>();
        System.out.println("Elements :"+obj);
        obj.put("mango","Mango is a king of all Fruits");
        obj.put("tiger","Tiger is a national animal of India");
        obj.put("bangalore","Bangalore is a garden city of karnataka");
        obj.put("lotus","Lotus is a national flower of India");
        obj.put("camel","Camel is a ship of Desert");
        obj.put(null,"HashMap supports Null Keys");
        System.out.println("Elements :"+obj);
    }

    private static void readAndRemoveElements()
    {
        HashMap<String,String> obj=new HashMap<String, String>();
        System.out.println("Elements :"+obj);
        obj.put("mango","Mango is a king of all Fruits");
        obj.put("tiger","Tiger is a national animal of India");
        obj.put("bangalore","Bangalore is a garden city of karnataka");
        obj.put("lotus","Lotus is a national flower of India");
        obj.put("camel","Camel is a ship of Desert");
        obj.put(null,"HashMap supports Null Keys");
        System.out.println("Elements :"+obj);
        //Read Value
        String v1=obj.get("lotus");
        System.out.println(v1);
        //Remove Key
        obj.remove("lotus");
        String v2=obj.get("lotus");
        System.out.println(v2);
    }

    private static void readKeyAndValues()
    {
        HashMap<String,String> obj=new HashMap<String, String>();
        System.out.println("Elements :"+obj);
        obj.put("mango","Mango is a king of all Fruits");
        obj.put("tiger","Tiger is a national animal of India");
        obj.put("bangalore","Bangalore is a garden city of karnataka");
        obj.put("lotus","Lotus is a national flower of India");
        obj.put("camel","Camel is a ship of Desert");
        obj.put(null,"HashMap supports Null Keys");
        System.out.println("Elements :"+obj);

        obj.forEach((k,v) -> System.out.println(k +" -> "+v));
    }
}
