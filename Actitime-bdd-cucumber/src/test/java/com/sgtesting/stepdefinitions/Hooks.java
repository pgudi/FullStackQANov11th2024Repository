package com.sgtesting.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void connectDB()
    {
        System.out.println("Connection to the Oracle Database has done succsssfully");
    }

    @After
    public void disConnectDB()
    {
        System.out.println("Disconnection from the ORacle Database has done succsssfully");
    }
}
