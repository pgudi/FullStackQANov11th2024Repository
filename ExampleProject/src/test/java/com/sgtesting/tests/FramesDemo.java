package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
    private static WebDriver oDriver=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        handleFrames();
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
            oDriver.get("file:///G:/GitQARepository1/CurrentWorkSpace/FullStackQANov11th2024Repository/ExampleProject/HTML/FramesDemo.html");
            Thread.sleep(5000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void handleFrames()
    {
        try
        {
            oDriver.switchTo().frame(0);
            oDriver.findElement(By.id("pwd1pass1word1")).sendKeys("DemoUser1");
            oDriver.switchTo().defaultContent();
            Thread.sleep(2000);
            oDriver.switchTo().frame("second");
            oDriver.findElement(By.id("edit1")).sendKeys("24000");
            oDriver.switchTo().defaultContent();
            Thread.sleep(2000);
            WebElement oEle=oDriver.findElement(By.xpath("//iframe[@title='samplepage']"));
            oDriver.switchTo().frame(oEle);
            oDriver.findElement(By.linkText("S G Software Testing")).click();
            oDriver.switchTo().defaultContent();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
