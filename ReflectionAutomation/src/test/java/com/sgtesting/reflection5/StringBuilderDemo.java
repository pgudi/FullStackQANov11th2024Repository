package com.sgtesting.reflection5;

public class StringBuilderDemo {


	public static void appendString()
	{
		StringBuilder s=new StringBuilder("Java");
		System.out.println(s);
		s.append(" Programming");
		System.out.println(s);
		System.out.println("++++++++++++++");
	}

	public static void insertString()
	{
		StringBuilder s=new StringBuilder("It is a book");
		StringBuilder s1=s.insert(8, "new ");
		System.out.println(s1);
		System.out.println("++++++++++++++");
	}

	public static void deleteString()
	{
		StringBuilder s=new StringBuilder("It is a new book");
		StringBuilder s1=s.delete(8, 12);
		System.out.println(s1);
		System.out.println("++++++++++++++");
	}

	public static void reverseString()
	{
		StringBuilder s=new StringBuilder("Programming");
		StringBuilder s1=s.reverse();
		System.out.println(s1);
		System.out.println("++++++++++++++");
	}

}
