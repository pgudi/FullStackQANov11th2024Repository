package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOprationsDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        moveMouseOnElement();
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
            oBrowser.navigate().to("https://www.flipkart.com/");
            Thread.sleep(5000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void moveMouseOnElement()
    {
        try
        {
            Actions oMouse=new Actions(oBrowser);
            WebElement oFashion=oBrowser.findElement(By.xpath("//span[text()='Fashion']"));
            oMouse.moveToElement(oFashion).build().perform();
            Thread.sleep(2000);
            WebElement oEthnic=oBrowser.findElement(By.xpath("//a[text()='Women Ethnic']"));
            oMouse.moveToElement(oEthnic).build().perform();
            Thread.sleep(2000);
            WebElement oEthnicDress=oBrowser.findElement(By.xpath("//a[text()='Ethnic Dresses']"));
            oMouse.moveToElement(oEthnicDress).build().perform();
            Thread.sleep(2000);
            oMouse.click(oEthnicDress).build().perform();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
