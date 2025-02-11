package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;

public class AssertNullDemo {

    @Test
    public void validateNull()
    {
        try
        {
            File f1=null;
            Assert.assertNull(f1);
            System.out.println("The AssertNull Step has passed successfully");
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
            Assert.assertNotNull(f1);
            System.out.println("The AssertNotNull Step has passed successfully");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
