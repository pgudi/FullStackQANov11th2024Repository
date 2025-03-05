package com.sgtesting.programs;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
    //    intergerInput();
    //    stringInput();
        sentanceInput();
    }

    private static void intergerInput()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Marks of the Student:");
            int v1=sc.nextInt();
            System.out.println("Marks :"+v1);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void stringInput()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Name of the Student:");
            String v1=sc.next();
            System.out.println("Student Name :"+v1);
            System.out.println("Enter the Sentence:");
            String v2=sc.nextLine();
            System.out.println("The Sentence :"+v2);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void sentanceInput()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Sentence:");
            String v2=sc.nextLine();
            System.out.println("The Sentence :"+v2);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
