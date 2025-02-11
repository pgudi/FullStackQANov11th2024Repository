package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsDemo {
    SoftAssert obj=new SoftAssert();
    @Test
    public void validateEquals()
    {
        try
        {
            String s1="JavaScript123";
            String s2=new String("JavaScript");
            obj.assertEquals(s1, s2);
            System.out.println("The AssertEquals Step has passed successfully");
            obj.assertAll();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void validateNotEquals()
    {
        try
        {
            String s1="JavaScriptNew";
            String s2=new String("JavaScript");
            obj.assertNotEquals(s1, s2);
            System.out.println("The AssertNotEquals Step has passed successfully");
            obj.assertAll();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
