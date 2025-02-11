package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreaetUserScenario {
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

    @Test(priority = 5, dataProvider = "createUser")
    public void createUser(String fname,String lname,String email,String userName,String password,String retypepwd)
    {
        try
        {
            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.name("firstName")).sendKeys("demo");
            oBrowser.findElement(By.name("lastName")).sendKeys("User1");
            oBrowser.findElement(By.name("email")).sendKeys("demo@gss.com");
            oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
            oBrowser.findElement(By.name("password")).sendKeys("welcome123");
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome123");
            oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(5000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 6)
    public void deleteUser()
    {
        try
        {
            oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
            Thread.sleep(2000);
            Alert oAlert=oBrowser.switchTo().alert();
            String content=oAlert.getText();
            System.out.println(content);
            oAlert.accept();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 7)
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

    @Test(priority = 8)
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

    @DataProvider(name="createUser")
    public Object[][] getCreateUserData()
    {
        return new Object[][] {{"demo","User1","demo@gmail.com","demoUser1","Welcome123","Welcome123"}};
    }
}

