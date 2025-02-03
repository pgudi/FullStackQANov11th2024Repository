package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutWebElementDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        withoutWebElement();

    }
    private static void launchBrowser()
    {
        try
        {
            oBrowser=new ChromeDriver();
            oBrowser.manage().window().maximize();
            Thread.sleep(4000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void navigateURL()
    {
        try
        {
            oBrowser.navigate().to("http://localhost/login.do");
            Thread.sleep(5000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void withoutWebElement()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
            Thread.sleep(1000);
            oBrowser.findElement(By.id("username")).clear();
            Thread.sleep(1000);
            oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
            Thread.sleep(1000);
            oBrowser.findElement(By.id("username")).clear();
            Thread.sleep(1000);
            oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
            Thread.sleep(1000);
            oBrowser.findElement(By.id("username")).clear();
            Thread.sleep(1000);
            oBrowser.findElement(By.id("username")).sendKeys("demoUser12345");
            Thread.sleep(1000);
            String v1=oBrowser.findElement(By.id("username")).getAttribute("value");
            System.out.println(v1);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
