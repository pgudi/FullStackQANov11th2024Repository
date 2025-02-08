package com.sgtesting.employee;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Employee {
    @Test
    public void createEmployee()
    {
        System.out.println("The Employee demoEmployee1 has created successfully!!");
    }

    @Test
    public void modifyEmployee()
    {
        System.out.println("The Employee demoEmployee1 has modified successfully!!");
    }

    @Test
    public void deleteEmployee()
    {
        System.out.println("The Employee demoEmployee1 has delete successfully!!");
    }

    @BeforeClass
    public void setUp()
    {
        System.out.println("Launch Browser, Navigate URL and Login into the Application");
    }

    @AfterClass
    public void tearDown()
    {
        System.out.println("Logout from the Application and close Application");
        System.out.println("++++++++++++++++++++++++++++");
    }
}
