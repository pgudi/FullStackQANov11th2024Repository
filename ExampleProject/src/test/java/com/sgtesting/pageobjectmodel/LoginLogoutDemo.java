package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
    private static WebDriver oBrowser=null;
    private static ActiTimePage oPage=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        login();
        minimizeFlyOutWindow();
        logout();
        closeApplication();
    }

    private static void launchBrowser()
    {
        try
        {
            oBrowser=new ChromeDriver();
            oPage=new ActiTimePage(oBrowser);
            oBrowser.manage().window().maximize();
            Thread.sleep(5000);
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

    private static void login()
    {
        try
        {
            oPage.getUserName().sendKeys("admin");
            oPage.getPassword().sendKeys("manager");
            oPage.getLogin().click();
            Thread.sleep(5000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void minimizeFlyOutWindow()
    {
        try
        {
            oPage.getFlyOutWindow().click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void logout()
    {
        try
        {
            oPage.getLogout().click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void closeApplication()
    {
        try
        {
            oBrowser.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
