package com.sgtesting.javautil;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
   //     addElements();
   //     readAndRemoveElements();
        readKeyAndValues();
    }

    private static void addElements()
    {
        TreeMap<String, String> obj=new TreeMap<String, String>();
        System.out.println("Elements :"+obj);
        obj.put("mango","Mango is a king of all Fruits");
        obj.put("tiger","Tiger is a national animal of India");
        obj.put("bangalore","Bangalore is a garden city of karnataka");
        obj.put("lotus","Lotus is a national flower of India");
        obj.put("camel","Camel is a ship of Desert");
        obj.put("raichur","It is cotton city in Asia");
        System.out.println("Elements :"+obj);
    }

    private static void readAndRemoveElements()
    {
        TreeMap<String, String> obj=new TreeMap<String, String>();
        System.out.println("Elements :"+obj);
        obj.put("mango","Mango is a king of all Fruits");
        obj.put("tiger","Tiger is a national animal of India");
        obj.put("bangalore","Bangalore is a garden city of karnataka");
        obj.put("lotus","Lotus is a national flower of India");
        obj.put("camel","Camel is a ship of Desert");
        obj.put("raichur","It is cotton city in Asia");
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
        TreeMap<String, String> obj=new TreeMap<String, String>();
        System.out.println("Elements :"+obj);
        obj.put("mango","Mango is a king of all Fruits");
        obj.put("tiger","Tiger is a national animal of India");
        obj.put("bangalore","Bangalore is a garden city of karnataka");
        obj.put("lotus","Lotus is a national flower of India");
        obj.put("camel","Camel is a ship of Desert");
        obj.put("raichur","It is cotton city in Asia");
        System.out.println("Elements :"+obj);

        obj.forEach((k, v) -> System.out.println(k +" -> "+v));
    }
}
