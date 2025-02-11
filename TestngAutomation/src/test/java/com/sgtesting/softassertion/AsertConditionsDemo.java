package com.sgtesting.softassertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;

public class AsertConditionsDemo {

    SoftAssert obj=new SoftAssert();
    @Test
    public void validateTrue()
    {
        try
        {
            int x,y;
            x=140;y=250;
            obj.assertTrue(y>=x);
            System.out.println("The AssertTrue Step has passed successfully");
            obj.assertAll();
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
            obj.assertFalse(x>=y);
            System.out.println("The AssertFalse Step has passed successfully");
            obj.assertAll();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
