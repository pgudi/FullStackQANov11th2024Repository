package com.sgtesting.reflection5;

public class StringBufferDemo {

	public static void appendString()
	{
		StringBuffer s=new StringBuffer("Java");
		System.out.println(s);
		s.append(" Programming");
		System.out.println(s);
		System.out.println("++++++++++++++");
	}

	public static void insertString()
	{
		StringBuffer s=new StringBuffer("It is a book");
		StringBuffer s1=s.insert(8, "new ");
		System.out.println(s1);
		System.out.println("++++++++++++++");
	}

	public static void deleteString()
	{
		StringBuffer s=new StringBuffer("It is a new book");
		StringBuffer s1=s.delete(8, 12);
		System.out.println(s1);
		System.out.println("++++++++++++++");
	}

	public static void reverseString()
	{
		StringBuffer s=new StringBuffer("Programming");
		StringBuffer s1=s.reverse();
		System.out.println(s1);
		System.out.println("++++++++++++++");
	}
}
