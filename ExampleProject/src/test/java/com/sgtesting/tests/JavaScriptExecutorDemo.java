package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
    private static WebDriver oDriver=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        displayURLOfApplication();
        displayTitleOfApplication();
        displayNumberOfLinksInApplication();
   //     enterValueInTextField1();
    //    enterValueInTextField2();
    //    clickOnButton1();
    //    clickOnButton2();
    //    clickOnCheckButton1();
    //    clickOnCheckButton2();
        clickOnRadioButton1();
        clickOnRadioButton2();
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

    private static void displayURLOfApplication()
    {
        JavascriptExecutor js=(JavascriptExecutor) oDriver;
        String url=(String) js.executeScript("var v1=document.URL;return v1;");
        System.out.println("URL :"+url);

    }

    private static void displayTitleOfApplication()
    {
        JavascriptExecutor js=(JavascriptExecutor) oDriver;
        String title=(String) js.executeScript("var v1=document.title;return v1;");
        System.out.println("Title :"+title);

    }

    private static void displayNumberOfLinksInApplication()
    {
        JavascriptExecutor js=(JavascriptExecutor) oDriver;
        long linkCount=(long) js.executeScript("var v1=document.getElementsByTagName('A');return v1.length;");
        System.out.println("# of Links in the Application:"+linkCount);
    }

    private static void enterValueInTextField1()
    {
        JavascriptExecutor js=(JavascriptExecutor) oDriver;
        js.executeScript("document.getElementById('uid1user1name1').value='DemoUser1';");

    }

    private static void enterValueInTextField2()
    {
        WebElement oEle=oDriver.findElement(By.id("pwd1pass1word1"));
        JavascriptExecutor js=(JavascriptExecutor) oDriver;
        js.executeScript("arguments[0].value='Welcome123';",oEle);

    }

    private static void clickOnButton1()
    {
        JavascriptExecutor js=(JavascriptExecutor) oDriver;
        js.executeScript("document.getElementById('btn1submit1button1').click();");
    }

    private static void clickOnButton2()
    {
        WebElement oEle=oDriver.findElement(By.id("btn1submit1button1"));
        JavascriptExecutor js=(JavascriptExecutor) oDriver;
        js.executeScript("arguments[0].click();",oEle);

    }

    private static void clickOnCheckButton1()
    {
        JavascriptExecutor js=(JavascriptExecutor) oDriver;
        js.executeScript("document.getElementById('chk1windows').click();");
    }

    private static void clickOnCheckButton2()
    {
        WebElement oEle=oDriver.findElement(By.id("chk2linux"));
        JavascriptExecutor js=(JavascriptExecutor) oDriver;
        js.executeScript("arguments[0].click();",oEle);

    }

    private static void clickOnRadioButton1()
    {
        JavascriptExecutor js=(JavascriptExecutor) oDriver;
        js.executeScript("document.getElementById('rad1chrome').click();");
    }

    private static void clickOnRadioButton2()
    {
        WebElement oEle=oDriver.findElement(By.id("rad2firefox"));
        JavascriptExecutor js=(JavascriptExecutor) oDriver;
        js.executeScript("arguments[0].click();",oEle);

    }
}
