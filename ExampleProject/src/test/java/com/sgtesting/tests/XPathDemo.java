package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

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
   //     relativeXpathUsingAttributeNameValueCombination();
   //     relativeXpathUsingTagNameWithAttributeName();
   //     relativeXpathUsingTagNameWithAttributeName_01();
   //     relativeXpathUsingTagNameWithAttributeName_02();
   //     relativeXpathUsingTagNameWithAttributeName_03();
   //     relativeXpathUsingPartialMatchingOfAttributeValue();
   //     relativeXpathUsingTagNameWithtextContent();
        relativeXpathUsingTagNameWithPartialtextContent();
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
        oDriver.findElement(By.xpath("//*[@value='Submit']")).click();
    }

    /**
     * case 9 : identify the eleemnt using tagName and attribute name value combination
     * syntax: //<tagName>[@attributename='attributeValue']
     */
    private static void relativeXpathUsingTagNameWithAttributeName()
    {
        List<WebElement> oLinks=oDriver.findElements(By.xpath("//a[@href]"));
        System.out.println("# of Links in a Web Page :"+oLinks.size());
    }

    private static void relativeXpathUsingTagNameWithAttributeName_01()
    {
        //Click on a link which has link name contains "ware" string
        List<WebElement> oLinks=oDriver.findElements(By.xpath("//a[@href]"));
        for(int i=0;i<oLinks.size();i++)
        {
            WebElement link=oLinks.get(i);
            String linkname=link.getText();
            System.out.println("Link Name :"+linkname);
            if(linkname.contains("ware"))
            {
                link.click();
                break;
            }
        }
    }

    private static void relativeXpathUsingTagNameWithAttributeName_02()
    {
        //Display All available Link Names
        List<WebElement> oLinks=oDriver.findElements(By.xpath("//a[@href]"));
        for(int i=0;i<oLinks.size();i++)
        {
            WebElement link=oLinks.get(i);
            String linkname=link.getText();
            System.out.println("Link Name :"+linkname);

        }
    }

    private static void relativeXpathUsingTagNameWithAttributeName_03()
    {
        //StaleElementReferenceException
        //StaleElementReferenceException: stale element reference: stale element not found
        List<WebElement> oLinks=oDriver.findElements(By.xpath("//a[@href]"));
        for(int i=0;i<oLinks.size();i++)
        {
            WebElement link=oLinks.get(i);
            String linkname=link.getText();
            System.out.println("Link Name :"+linkname);
            if(linkname.contains("Software"))
            {
                link.click();
            }
        }
    }

    /**
     * case 10 : identify the eleemnt using Partial Matching of Attribute Value
     * syntax:
     *  starts-with(@attributeName, 'attributeValue')
     *  ends-with(@attributeName, 'attributeValue')
     *  contains(@attributeName, 'attributeValue')
     *
     * //<tagName>[starts-with(@attributeName, 'attributeValue')]
     * //<tagName>[ends-with(@attributeName, 'attributeValue')]
     * //<tagName>[contains(@attributeName, 'attributeValue')]
     */
    private static void relativeXpathUsingPartialMatchingOfAttributeValue()
    {
        oDriver.findElement(By.xpath("//input[starts-with(@id,'chk1')]")).click();
     //   oDriver.findElement(By.xpath("//input[contains(@id,'win')]")).click();
     //   oDriver.findElement(By.xpath("//input[ends-with(@id,'dows')]")).click();
    }

    /**
     * case 11 : identify the element using text content
     * syntax: //<tagName>[text()='content']
     */
    private static void relativeXpathUsingTagNameWithtextContent()
    {
        oDriver.findElement(By.xpath("//a[text()='POI Apache']")).click();
    }

    /**
     * case 12 : identify the element using partial matching of text content
     * syntax:
     * starts-with(text(),'content');
     * ends-with(text(),'content');
     * contains(text(),'content');
     * //<tagName>[starts-with(text(),'content')]
     * //<tagName>[ends-with(text(),'content')]
     * //<tagName>[contains(text(),'content')]
     */
    private static void relativeXpathUsingTagNameWithPartialtextContent()
    {
        oDriver.findElement(By.xpath("//a[starts-with(text(),'S G')]")).click();
    }
}
