package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsDemo {

    @Test
    public void validateEquals()
    {
        try
        {
            String s1="JavaScript123";
            String s2=new String("JavaScript");
            Assert.assertEquals(s1, s2);
            System.out.println("The AssertEquals Step has passed successfully");
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
            Assert.assertNotEquals(s1, s2);
            System.out.println("The AssertNotEquals Step has passed successfully");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
