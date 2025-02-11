package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginLogout {
   public static WebDriver oBrowser=null;
    @Test(priority = 1)
    public void launchBrowser()
    {
        try
        {
            oBrowser=new ChromeDriver();
            oBrowser.manage().window().maximize();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void navigateURL()
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

    @Test(priority = 3, dataProvider = "login")
    public void login(String username,String password)
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys(username);
            oBrowser.findElement(By.name("pwd")).sendKeys(password);
            oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
            Thread.sleep(4000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void minimizeFlyOutwindow()
    {
        try
        {
            oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void logout()
    {
        try
        {
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 6)
    public void closeApplication()
    {
        try
        {
            oBrowser.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @DataProvider(name = "login")
    public Object[][] getLoginData()
    {
        return new Object[][] {{"admin","manager"}};
    }
}
