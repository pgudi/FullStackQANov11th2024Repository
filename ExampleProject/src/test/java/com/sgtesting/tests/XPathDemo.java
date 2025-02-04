package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    private static WebDriver oDriver=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
   //     absoluteXPath();
   //     relativeXpathUsingTagName();
   //     relativeXpathUsingTagNameAndIndex();
   //     relativeXpathUsingTagNameWithAttributeNameValueCombination();
   //     relativeXpathUsingTagNameWithMultipleAttributeNameValueCombination();
   //     relativeXpathUsingTagNameWithMultipleAttributeNameValueCombinationByAndOperator();
   //     relativeXpathUsingTagNameWithMultipleAttributeNameValueCombinationByOROperator();//relativeXpathUsingTagNameWithAttributeValue();
        relativeXpathUsingAttributeNameValueCombination();
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

    private static void absoluteXPath()
    {
        oDriver.findElement(By.xpath("/html/body/div/form/input")).sendKeys("DemoUser1");
    }

    /**
     * case 1 : identify the eleemnt using tagName alone
     * syntax: //<tagName>
     */
    private static void relativeXpathUsingTagName()
    {
        oDriver.findElement(By.xpath("//input")).sendKeys("DemoUser1");
    }

    /**
     * case 2 : identify the element using tagName and index
     * syntax: //<tagName>[index]
     */
    private static void relativeXpathUsingTagNameAndIndex()
    {
        oDriver.findElement(By.xpath("//input[2]")).sendKeys("DemoUser1");
    }

    /**
     * case 3 : identify the eleemnt using tagName and attribute name value combination
     * syntax: //<tagName>[@attributename='attributeValue']
     */
    private static void relativeXpathUsingTagNameWithAttributeNameValueCombination()
    {
        oDriver.findElement(By.xpath("//input[@value='Submit']")).click();
    }

    /**
     * case 4 : identify the eleemnt using tagName with multiple  attribute name value combination
     * syntax: //<tagName>[@attributename1='attributeValue'][@attributename2='attributeValue']
     */
    private static void relativeXpathUsingTagNameWithMultipleAttributeNameValueCombination()
    {
        oDriver.findElement(By.xpath("//input[@value='Submit'][@type='button']")).click();
    }

    /**
     * case 5 : identify the eleemnt using tagName with multiple  attribute name value combination using And Operator
     * syntax: //<tagName>[@attributename1='attributeValue' and @attributename2='attributeValue']
     */
    private static void relativeXpathUsingTagNameWithMultipleAttributeNameValueCombinationByAndOperator()
    {
        oDriver.findElement(By.xpath("//input[@value='Submit' and @type='button']")).click();
    }

    /**
     * case 6 : identify the eleemnt using tagName with multiple  attribute name value combination using OR Operator
     * syntax: //<tagName>[@attributename1='attributeValue' and @attributename2='attributeValue']
     */
    private static void relativeXpathUsingTagNameWithMultipleAttributeNameValueCombinationByOROperator()
    {
        oDriver.findElement(By.xpath("//input[@value='Submit1234' or @type='button']")).click();
    }

    /**
     * case 7 : identify the element using tagName with attribute NAme alone
     * syntax: //<tagName>[@*='attributeValue']
     */
    private static void relativeXpathUsingTagNameWithAttributeValue()
    {
        oDriver.findElement(By.xpath("//input[@*='Submit']")).click();
    }

    /**
     * case 8 : identify the element using attribute Name and Value combination alone
     * syntax: //*[@attributename='attributeValue']
     */
    private static void relativeXpathUsingAttributeNameValueCombination()
    {
        oDriver.findElement(By.xpath("//input[@*='Submit']")).click();
    }
}
