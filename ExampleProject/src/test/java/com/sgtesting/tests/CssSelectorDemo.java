package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CssSelectorDemo {
    private static WebDriver oDriver=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
   //     absoluteCSSPath();
   //     relativeCSSUsingTagName();
   //     relativeCSSUsingTagNameWithIdAttributeValue();
   //     relativeCSSUsingIdAttributeValue();
   //     relativeCSSUsingTagNameWithClassAttributeValue();
   //     relativeCSSUsingClassAttributeValue();
  //      relativeCSSUsingTagNameWithAttributeNameValue();
  //      relativeCSSUsingTagNameWithMultipleAttributeNameValue();
  //      relativeCSSUsingTagNameWithPartialMatchingOfAttributeNameValue();
  //      relativeCSSUsingTagNameWithAttributeName();
  //      relativeCSSUsingTagNameWithAttributeName_01();
  //      relativeCSSUsingTagNameWithAttributeName_02();
  //      relativeCSSUsingTagNameWithAttributeName_03();
   //     relativeCSSUsingTagNameWithAttributeName_04();
   //     relativeCSSUsingNthChildConcept();
        relativeCSSUsingSiblingApproach();
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

    private static void absoluteCSSPath()
    {
        oDriver.findElement(By.cssSelector("html body div form input")).sendKeys("demoUser1");
    }

    /**
     * case 1: identify the Element using tagName alone
     * syntax: <tagName>
     */
    private static void relativeCSSUsingTagName()
    {
        oDriver.findElement(By.cssSelector("input")).sendKeys("DemoUsr11");
    }

    /**
     * case 2: Identify the Eleemnt using tagName with id attribute value
     * Syntax: <tagName>#<id attribute value>
     *
     */
    private static void relativeCSSUsingTagNameWithIdAttributeValue()
    {
        oDriver.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("Password123");
    }

    /**
     * case 3: Identify the Eleemnt using id attribute value
     * Syntax: <tagName>#<id attribute value>
     *
     */
    private static void relativeCSSUsingIdAttributeValue()
    {
        oDriver.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("Password@13");
    }

    /**
     * case 4: Identify the Eleemnt using tagName with class attribute value
     * Syntax: <tagName>.<Class attribute value>
     *
     */
    private static void relativeCSSUsingTagNameWithClassAttributeValue()
    {
        oDriver.findElement(By.cssSelector("input.submit1btn1")).click();
    }

    /**
     * case 5: Identify the Eleemnt using class attribute value
     * Syntax: .<Class attribute value>
     *
     */
    private static void relativeCSSUsingClassAttributeValue()
    {
        oDriver.findElement(By.cssSelector(".submit1btn1")).click();
    }

    /**
     * case 6: Identify the Eleemnt using tagName with attribute name and value
     * Syntax: <tagName>[attributeName='attributeValue']
     *
     */
    private static void relativeCSSUsingTagNameWithAttributeNameValue()
    {
        oDriver.findElement(By.cssSelector("input[value='Submit']")).click();
    }

    /**
     * case 7: Identify the Eleemnt using tagName with multiple attribute name and value
     * Syntax: <tagName>[attributeName='attributeValue']
     *
     */
    private static void relativeCSSUsingTagNameWithMultipleAttributeNameValue()
    {
        oDriver.findElement(By.cssSelector("input[value='Submit'][type='button']")).click();
    }

    /**
     * case 8: Identify the Eleemnt using Partial Matching of attribute name and value
     *       ^=   -  stars-with
     *       $=   -  ends-with
     *       *=   -  contains
     * Syntax: <tagName>[attributeName ^= 'partial attributeValue']
     * Syntax: <tagName>[attributeName $= 'partialattributeValue']
     * Syntax: <tagName>[attributeName *= 'partialattributeValue']
     */
    private static void relativeCSSUsingTagNameWithPartialMatchingOfAttributeNameValue()
    {
     //   oDriver.findElement(By.cssSelector("input[id ^= 'btn1']")).click();
        oDriver.findElement(By.cssSelector("input[id *= 'submit1']")).click();
    }

    /**
     * case 9: Identify Elements using tagName with AttributeName alone
     * Syntax: <tagName>[AttributeName]
     */
    private static void relativeCSSUsingTagNameWithAttributeName()
    {
        // display Number of Links in the Application
        List<WebElement> oLinks=oDriver.findElements(By.cssSelector("a[href]"));
        System.out.println("# of Links in Application:"+oLinks.size());
    }

    private static void relativeCSSUsingTagNameWithAttributeName_01()
    {
        // display Each Link Names in the Application
        List<WebElement> oLinks=oDriver.findElements(By.cssSelector("a[href]"));
        for(int i=0;i<oLinks.size();i++)
        {
            WebElement link=oLinks.get(i);
            String name=link.getText();
            System.out.println(name);
        }
    }

    private static void relativeCSSUsingTagNameWithAttributeName_02()
    {
        // display Each Link Names in the Application
        List<WebElement> oLinks=oDriver.findElements(By.cssSelector("a[href]"));
        for(int i=0;i<oLinks.size();i++)
        {
            WebElement link=oLinks.get(i);
            String name=link.getText();
            System.out.println(name);
        }
    }

    private static void relativeCSSUsingTagNameWithAttributeName_03()
    {
        // Perfrom click operation on particular Link
        List<WebElement> oLinks=oDriver.findElements(By.cssSelector("a[href]"));
        for(int i=0;i<oLinks.size();i++)
        {
            WebElement link=oLinks.get(i);
            String name=link.getText();
            if(name.endsWith("HQ"))
            {
                link.click();
                break;
            }
        }
    }

    private static void relativeCSSUsingTagNameWithAttributeName_04()
    {
        // org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
        List<WebElement> oLinks=oDriver.findElements(By.cssSelector("a[href]"));
        for(int i=0;i<oLinks.size();i++)
        {
            WebElement link=oLinks.get(i);
            String name=link.getText();
            if(name.endsWith("HQ"))
            {
                link.click();
            }
        }
    }

    /**
     * case 10: nth-child Element
     * Syntax: :nth-child(child number);
     *
     */
    private static void relativeCSSUsingNthChildConcept()
    {
        oDriver.findElement(By.cssSelector("#frm3 > :nth-child(1)")).sendKeys("DemoUserData1");
        oDriver.findElement(By.cssSelector("#frm3 > :nth-child(2)")).sendKeys("DemoUserData2");
        oDriver.findElement(By.cssSelector("#frm3 > :nth-child(3)")).sendKeys("DemoUserData3");
        oDriver.findElement(By.cssSelector("#frm3 > :nth-child(4)")).sendKeys("DemoUserData4");
    }

    /**
     * case 11: Identify sibling Element
     * Syntax: :<Element> + <Element>
     *
     */
    private static void relativeCSSUsingSiblingApproach()
    {
        oDriver.findElement(By.cssSelector("#frm3 > input")).sendKeys("DemoUserData1");
        oDriver.findElement(By.cssSelector("#frm3 > input + input")).sendKeys("DemoUserData2");
        oDriver.findElement(By.cssSelector("#frm3 > input + input + input")).sendKeys("DemoUserData3");
        oDriver.findElement(By.cssSelector("#frm3 > input + input+ input + input")).sendKeys("DemoUserData4");
    }
}
