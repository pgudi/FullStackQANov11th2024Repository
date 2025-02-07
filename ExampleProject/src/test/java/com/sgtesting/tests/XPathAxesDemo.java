package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {
    private static WebDriver oDriver=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
    //    enterTheSalaryForPersonSachinTendulakr();
    //    basedOnPersonRahulDravidEnterSalaryFor2ndRecord();
    //    makeTheStatusAsActiveForIndianFreedomFighter();
    //    makeTheStatusAsActiveForRecordWhichIsPreviousToPreviousFromSachinTendulkar();
    //    basedOnChildIdentifyTheParentElement();
        basedOnParentIdentifyTheChildElement();
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
            oDriver.get("file:///G:/GitQARepository1/CurrentWorkSpace/FullStackQANov11th2024Repository/ExampleProject/HTML/WebTableHTML.html");
            Thread.sleep(5000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * case 1: following-sibling
     * Description: based on Person Sachin Tendulakr, Enter the salary in the Salary Text field
     */
    private static void enterTheSalaryForPersonSachinTendulakr()
    {
        oDriver.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("14000");
    }

    /**
     * case 2: following
     * Description: based on Person Rahul Dravid, Enter the salary in the 2nd Record
     */
    private static void basedOnPersonRahulDravidEnterSalaryFor2ndRecord()
    {
        oDriver.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[2]/td[6]/input")).sendKeys("16000");
    }

    /**
     * case 3: preceding-sibling
     * Description: based on Designation Indina Freedom Fighter, make the status as Active
     */
    private static void makeTheStatusAsActiveForIndianFreedomFighter()
    {
        oDriver.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
    }

    /**
     * case 4:  preceding
     * Description: based on Person Sachin Tendulakr, his previous 2nd record make the status as ACtive
     */
    private static void makeTheStatusAsActiveForRecordWhichIsPreviousToPreviousFromSachinTendulkar()
    {
        oDriver.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[1]/preceding::tr[1]/td[1]/input")).click();
    }
    /**
     * case 5: ancestor
     * Description: Based on child Element identify the parent Element
     */
    private static void basedOnChildIdentifyTheParentElement()
    {
        String v1=oDriver.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::tr/ancestor::table")).getAttribute("id");
        System.out.println(v1);
    }

    /**
     * case 6: descendant
     * Description: Based on Parent Element identify the child Element
     */
    private static void basedOnParentIdentifyTheChildElement() {
        oDriver.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[6]/td[6]/input")).sendKeys("14000");
    }

}
