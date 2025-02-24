package com.sgtesting.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StepDefinitions {
    private static WebDriver oDriver=null;
    /**
     * I launch the Chrome Browser
     */
    @Given("^I launch the Chrome Browser$")
    public void I_launch_the_Chrome_Browser()
    {
        try
        {
            oDriver=new ChromeDriver();
            oDriver.manage().window().maximize();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /**
     * I navigate the Application URL
     */
    @And("^I navigate the Application URL$")
    public void I_navigate_the_Application_URL()
    {
        try
        {
            oDriver.get("http://localhost/login.do");
            Thread.sleep(3000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I enter username in username text field
     */
    @When("^I enter username in username text field$")
    public void I_enter_username_in_username_text_field()
    {
        try
        {
            oDriver.findElement(By.id("username")).sendKeys("admin");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I enter password in password text field
     */
    @When("^I enter password in password text field$")
    public void I_enter_password_in_password_text_field()
    {
        try
        {
            oDriver.findElement(By.name("pwd")).sendKeys("manager");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I click on SignIn button
     */
    @And("^I click on SignIn button$")
    public void I_click_on_SignIn_button()
    {
        try
        {
            oDriver.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(5000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I find the Home Page
     */
    @Then("^I find the Home Page$")
    public void I_find_the_Home_Page()
    {
        String expected,actual;
        try
        {
            expected="actiTIME - Enter Time-Track";
            actual=oDriver.getTitle();
            Assert.assertEquals(actual, expected);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /**
     * I minimize the flyout window
     */
    @And("^I minimize the flyout window$")
    public void I_minimize_the_flyout_window()
    {
        try
        {
            oDriver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I find the Logout Link in Home Page
     */
    @Given("^I find the Logout Link in Home Page$")
    public void I_find_the_Logout_Link_in_Home_Page()
    {
        try
        {
            WebElement oLink=oDriver.findElement(By.linkText("Logout"));
            Assert.assertTrue(oLink.isDisplayed());
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I click on Logout Link
     */
    @When("^I click on Logout Link$")
    public void I_click_on_Logout_Link()
    {
        try
        {
            oDriver.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I find the Login Page
     */
    @Then("^I find the Login Page$")
    public void I_find_the_Login_Page()
    {
        String expected,actual;
        try
        {
            expected="actiTIME - Login";
            actual=oDriver.getTitle();
            Assert.assertEquals(actual, expected);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I close Chrome Browser
     */
    @And("^I close Chrome Browser$")
    public void I_close_Chrome_Browser()
    {
        try
        {
            oDriver.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
