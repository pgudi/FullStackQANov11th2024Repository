package com.sgtesting.softassertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSameDemo {
    SoftAssert obj=new SoftAssert();
    @Test
    public void validateSame()
    {
        try
        {
            String s1="JavaScript";
            String s2=new String("JavaScript");
            obj.assertSame(s1, s2);
            System.out.println("The AssertSame Step has passed successfully");
            obj.assertAll();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void validateNotSame()
    {
        try
        {
            String s1="JavaScriptNew";
            String s2=new String("JavaScript");
            obj.assertNotSame(s1, s2);
            obj.assertAll();
            System.out.println("The AssertNotSame Step has passed successfully");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
