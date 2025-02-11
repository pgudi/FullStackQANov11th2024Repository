package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsertConditionsDemo {

   @Test
    public void validateTrue()
    {
        try
        {
            int x,y;
            x=140;y=250;
            Assert.assertTrue(y>=x);
            System.out.println("The AssertTrue Step has passed successfully");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void validateFalse()
    {
        try
        {
            int x,y;
            x=140;y=250;
            Assert.assertFalse(x>=y);
            System.out.println("The AssertFalse Step has passed successfully");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
