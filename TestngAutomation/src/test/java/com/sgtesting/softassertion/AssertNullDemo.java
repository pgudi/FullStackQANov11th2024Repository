package com.sgtesting.softassertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;

public class AssertNullDemo {
    SoftAssert obj=new SoftAssert();
    @Test
    public void validateNull()
    {
        try
        {
            File f1=null;
            obj.assertNull(f1);
            System.out.println("The AssertNull Step has passed successfully");
            obj.assertAll();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void validateNotNull()
    {
        try
        {
            File f1=null;
            f1=new File("F:\\Demo");
            obj.assertNotNull(f1);
            System.out.println("The AssertNotNull Step has passed successfully");
            obj.assertAll();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
