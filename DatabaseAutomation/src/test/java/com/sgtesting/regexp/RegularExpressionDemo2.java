package com.sgtesting.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo2 {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
    }

    private static void example1()
    {
        String str="Bangalore has received 125 mili miter of rain yesterday";
        Pattern pattern=Pattern.compile("[0-9][0-9][0-9]");
        Matcher match=pattern.matcher(str);

        boolean val=match.find();
        System.out.println("Match has found successfullly");
    }

    private static void example2()
    {
        String str="Bangalore has received 125 mili miter of rain yesterday";
        Pattern pattern=Pattern.compile("[0-9][0-9][0-9]");
        Matcher match=pattern.matcher(str);

       String result=match.replaceAll("many");
        System.out.println(result);
    }

    private static void example3()
    {
        String str="Bangalore has received 125 mili miter of rain yesterday";
        Pattern pattern=Pattern.compile("[0-9]{3}");
        Matcher match=pattern.matcher(str);

        String result=match.replaceAll("many");
        System.out.println(result);
    }

    private static void example4()
    {
        String str="The temple is at the top of the hill";
        Pattern pattern=Pattern.compile("[A-Za-z]+");
        Matcher match=pattern.matcher(str);

        while(match.find())
        {
            System.out.print(match.group()+" ");
        }
    }
}
