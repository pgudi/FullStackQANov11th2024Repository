package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class PopupBrowsersDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        handlePopups();
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

    private static void handlePopups()
    {
        try
        {
            WebElement oLink=oBrowser.findElement(By.linkText("actiTIME Inc."));
            System.out.println("Before Click on Link Number of Popups :"+getPopusCount());
            oLink.click();
            Thread.sleep(1000);
            System.out.println("After Click on Link Number of Popups :"+getPopusCount());
            if(getPopusCount() >0)
            {
                popups();
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static int getPopusCount()
    {
        int count=oBrowser.getWindowHandles().size()-1;
        return count;
    }

    private static void popups()
    {
        try
        {
            String parentBrowser=oBrowser.getWindowHandle();
            System.out.println("Parent Browser :"+parentBrowser);
            Set<String> childAllBrowsers=oBrowser.getWindowHandles();
            Object arr[]=childAllBrowsers.toArray();
            for(int i=1;i<arr.length;i++)
            {
                String childBrowser=arr[i].toString();
                System.out.println("Child Browser :"+childBrowser);
                Thread.sleep(1000);
                oBrowser.switchTo().window(childBrowser);
                Thread.sleep(1000);
                String url=oBrowser.getCurrentUrl();
                System.out.println("Child Browser URL :"+url);
                String title=oBrowser.getTitle();
                System.out.println("Title of Child Browser:"+title);
                String childWindowhandler=oBrowser.getWindowHandle();
                System.out.println("Child Browser :"+childWindowhandler);
                oBrowser.findElement(By.linkText("Log in")).click();
                Thread.sleep(1000);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
