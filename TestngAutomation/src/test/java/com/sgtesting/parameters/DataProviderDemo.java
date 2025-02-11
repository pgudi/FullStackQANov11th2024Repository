package com.sgtesting.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo
{
     @Test(dataProvider = "credentials")
    public void login(String username, String password)
     {
         System.out.println(username+"  -->  "+password);
     }

     @DataProvider(name = "credentials")
    public Object[][] getData(){
         return new  Object[][] {{"user1","welcome123"},
             {"user2", "Password123"}, {"user3","123456"}};
     }


}
