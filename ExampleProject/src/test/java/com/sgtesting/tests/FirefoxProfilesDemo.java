package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FirefoxProfilesDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
    }

    private static void launchBrowser()
    {
        try
        {
//            ProfilesIni profile=new ProfilesIni();
//            FirefoxProfile ffprofile =profile.getProfile("sgtest");
//            FirefoxOptions options=new FirefoxOptions();
//            options.setProfile(ffprofile);

            FirefoxProfile profile=new FirefoxProfile();
            profile.setPreference("browser.startup.homepage","http://sgtestinginstitute.com/");
            FirefoxOptions options=new FirefoxOptions();
            options.setProfile(profile);
            oBrowser=new FirefoxDriver(options);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
