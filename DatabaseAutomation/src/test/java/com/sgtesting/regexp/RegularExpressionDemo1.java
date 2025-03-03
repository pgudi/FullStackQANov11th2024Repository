package com.sgtesting.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo1 {
    public static void main(String[] args) {
    //    matches();
    //    findDemo();
    //    countOfOccurance();
    //    showMatches();
    //    showStartAndEndPositionMatches();
    //    replaceDemo();
        splitDemo();
    }

    private static void matches()
    {
        Pattern pattern=Pattern.compile("PlayWright");
        Matcher match=pattern.matcher("PlayWright");
        boolean val=match.matches();
        System.out.println(val);
    }

    private static void findDemo()
    {
        Pattern pattern=Pattern.compile("PlayWright");
        Matcher match=pattern.matcher("PlayWright Automation using JavaScript");
        boolean val=match.find();
        System.out.println(val);
    }

    private static void countOfOccurance()
    {
        Pattern pattern=Pattern.compile("PlayWright");
        Matcher match=pattern.matcher("PlayWright Selenium JMeter PlayWright");
        int count=0;
        while(match.find())
        {
            count++;
        }
        System.out.println("# of Occurance :"+count);
    }

    private static void showMatches()
    {
        Pattern pattern=Pattern.compile("PlayWright");
        Matcher match=pattern.matcher("PlayWright Selenium JMeter PlayWright");

        while(match.find())
        {
            System.out.println(match.group());
        }

    }

    private static void showStartAndEndPositionMatches()
    {
        Pattern pattern=Pattern.compile("PlayWright");
        Matcher match=pattern.matcher("PlayWright Selenium JMeter PlayWright");

        while(match.find())
        {
            System.out.println(match.group()+" has found Start Pos "+match.start()+ " and End Pos :"+match.end());
        }

    }

    private static void replaceDemo()
    {
        Pattern pattern=Pattern.compile("PlayWright");
        Matcher match=pattern.matcher("PlayWright Selenium JMeter PlayWright");

       String str=match.replaceAll("Selenium");
        System.out.println(str);

    }

    private static void splitDemo()
    {
        Pattern pattern=Pattern.compile("[!@#$%]");
        String str="Apple!Mango@Banana#Orange$Grapes%";
        String s[]= pattern.split(str);
        for(String kk:s)
        {
            System.out.println(kk);
        }
    }
}
