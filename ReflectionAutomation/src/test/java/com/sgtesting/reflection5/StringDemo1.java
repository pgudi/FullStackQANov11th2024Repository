package com.sgtesting.reflection5;

public class StringDemo1 {


	public static void getStrLength()
	{
		String s="Welcome";
		System.out.println("# of Characters :"+s.length());
		System.out.println("++++++++++++++++++");
	}


	public static void isStringEmpty()
	{
		String s=new String();
		System.out.println("Whether String is Empty?:"+s.isEmpty());
		System.out.println("++++++++++++++++++");
	}

	public static void getCharacterFromString()
	{
		String s=new String("Welcome");
		char v1=s.charAt(3);
		System.out.println("Character value :"+v1);
		System.out.println("++++++++++++++++++");
	}

	public static void comapreString1()
	{
		String s1="WELCOME";
		String s2="welcome";
		System.out.println("s1 and s2 are equal?:"+s1.equals(s2));
		System.out.println("s1 and s2 are equal by ignoring case?:"+s1.equalsIgnoreCase(s2));
		System.out.println("++++++++++++++++++");
	}

	public static void comapreString2()
	{
		String s1="WELCOME";
		String s2="welcome";
		System.out.println("s1 and s2 are equal?:"+s1.compareTo(s2));
		System.out.println("s1 and s2 are equal by ignoring case?:"+s1.compareToIgnoreCase(s2));
		System.out.println("++++++++++++++++++");
	}

	public static void partialMatchingOfString()
	{
		String s="It is an old palace";
		System.out.println("Whether the given String starts-with 'It' :"+s.startsWith("It"));
		System.out.println("Whether the given String ends-with 'palace' :"+s.endsWith("palace"));
		System.out.println("Whether the given String contains 'old' :"+s.contains("old"));
		System.out.println("++++++++++++++++++");
	}

	public static void replaceString()
	{
		String s="It is a new book";
		System.out.println("Replaced String :"+s.replace("is", "was"));
		System.out.println("++++++++++++++++++");
	}

	public static void displaySubString()
	{
		String s="Programming";
		System.out.println("Substring 1 :"+s.substring(3));
		System.out.println("Substring 2 :"+s.substring(3,7));
		System.out.println("++++++++++++++++++");
	}

	public static void splitString()
	{
		String s="Mango,Apple,Banana,Orange";
		String str[]=s.split(",");
		for(String kk:str)
		{
			System.out.println(kk);
		}
		System.out.println("++++++++++++++++++");
	}

	public static void convertToString()
	{
		double v1=45.175;
		String str1=String.valueOf(v1);
		System.out.println(str1);
		boolean v2=true;
		String str2=String.valueOf(v2);
		System.out.println(str2);
		System.out.println("++++++++++++++++++");
	}

	public static void lowercase()
	{
		String s="WELCOME";
		System.out.println("Lower case :"+s.toLowerCase());
		System.out.println("++++++++++++++++++");
	}

	public static void uppercase()
	{
		String s="programming";
		System.out.println("Upper case :"+s.toUpperCase());
		System.out.println("++++++++++++++++++");
	}

	public static void positionOfString()
	{
		String s="It is a book, It is a pen";
		System.out.println("indexOf 'left to right' :"+s.indexOf("is"));
		System.out.println("indexOf 'right to left' :"+s.lastIndexOf("is"));
		System.out.println("++++++++++++++++++");
	}

	public static void trimDemo()
	{
		String s="   Welcome   ";
		System.out.println("Before Trim, # of Chars :"+s.length());
		System.out.println("After trim,# of Chars :"+s.trim().length());
		System.out.println("++++++++++++++++++");
	}

	public static void concateStringDemo()
	{
		String s1="Hello";
		String s2="Welcome";
		System.out.println("Concatenation 1:"+(s1+" "+s2));
		System.out.println("Concatenation2:"+(s1.concat(s2)));
		System.out.println("++++++++++++++++++");
	}

	public static void convertToArray()
	{
		String s1="WELCOME";
		char ch[]=s1.toCharArray();
		for(char xx:ch)
		{
			System.out.println(xx);
		}
		System.out.println("++++++++++++++++++");
	}

	public static void formatString()
	{
		String s1="Santosh";
		String s2="Adams";
		String str=String.format("%s and %s are best friends", s1,s2);
		System.out.println(str);
	}
}

