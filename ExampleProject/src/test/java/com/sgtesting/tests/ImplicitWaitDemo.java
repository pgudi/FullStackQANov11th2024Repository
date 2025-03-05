package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        login();
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
            oBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            oBrowser.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void login()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("admin");
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
            Thread.sleep(4000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
