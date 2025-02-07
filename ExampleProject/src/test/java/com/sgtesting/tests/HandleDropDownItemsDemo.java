package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownItemsDemo {
    private static WebDriver oDriver=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        handleDropDown();

    }
    private static void launchBrowser()
    {
        try
        {
            oDriver=new ChromeDriver();
            oDriver.manage().window().maximize();
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
            oDriver.get("file:///G:/GitQARepository1/CurrentWorkSpace/FullStackQANov11th2024Repository/ExampleProject/HTML/Sample.html");
            Thread.sleep(5000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void handleDropDown()
    {
        try
        {
            WebElement oEle=oDriver.findElement(By.id("tools"));
            Select oSelect=new Select(oEle);
            oSelect.selectByIndex(1);
            Thread.sleep(1000);
            oSelect.selectByValue("rc");
            Thread.sleep(1000);
            oSelect.selectByVisibleText("Selenium WebDriver");
            Thread.sleep(1000);
            oSelect.selectByContainsVisibleText("IDE");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
