package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ImportUserTasks {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        login();
        minimizeFlyOutwindow();
        importTasks();
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

    private static void login()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("admin");
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            Robot robot=new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(4000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void minimizeFlyOutwindow()
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

    private static void importTasks()
    {
        try
        {
            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//div[text()='Add New Task']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//div[contains(text(),'Import tasks from CSV')]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("dropzoneClickableArea")).click();
            Thread.sleep(2000);
            String fileName="F:\\Demo\\Test\\Sample.csv";
            copyFilePath(fileName);
            Robot robot=new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_V);
            Thread.sleep(1000);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(1000);
            robot.keyRelease(KeyEvent.VK_V);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void copyFilePath(String fileName)
    {
        StringSelection stringSelection=new StringSelection(fileName);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
    }
}
