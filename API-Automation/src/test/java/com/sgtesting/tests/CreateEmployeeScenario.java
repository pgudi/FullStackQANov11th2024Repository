package com.sgtesting.tests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class CreateEmployeeScenario
{
    public static String employee_id=null;
    @Test(priority = 1)
    public void createEmployee()
    {
        try
        {
            //This method performs creation of Employee
            RestAssured.baseURI="http://localhost:9090/sgtesting/api/v1/employees";
            RequestSpecification httpRequest = RestAssured.given();
            //File Object
            String filename="./datafiles/createemployee.json";
            File fileObject=new File(filename);

            //Setup Headers
            httpRequest.header("Content-Type","application/json");
            //Provide request as body
            httpRequest.body(fileObject);
            //execute Http Method
            Response response=httpRequest.post();
            String content=response.prettyPrint();
            System.out.println(content);
            JsonPath jpath=response.jsonPath();
            employee_id=jpath.getString("id");
            System.out.println("Employee Id :"+employee_id);
            Assert.assertEquals(response.getStatusCode(), 201);
            Assert.assertNotNull(response);
            Assert.assertTrue(Integer.parseInt(employee_id)!=0);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void displayEmployee()
    {

        try
        {
            //This method performs display of Employee
            RestAssured.baseURI="http://localhost:9090/sgtesting/api/v1/employees/"+employee_id;
            RequestSpecification httpRequest = RestAssured.given();
            //Setup Headers
            httpRequest.header("Content-Type","application/json");
            //execute Http Method
            Response response=httpRequest.get();
            String content=response.prettyPrint();
            System.out.println(content);
            Assert.assertEquals(response.getStatusCode(), 200);
            Assert.assertNotNull(response);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void deleteEmployee()
    {
        try
        {
            //This method performs delete of Employee
            RestAssured.baseURI="http://localhost:9090/sgtesting/api/v1/employees/"+employee_id;
            RequestSpecification httpRequest = RestAssured.given();
            //Setup Headers
            httpRequest.header("Content-Type","application/json");
            //execute Http Method
            Response response=httpRequest.delete();
            String content=response.prettyPrint();
            System.out.println(content);
            Assert.assertTrue(content!=null);
            Assert.assertTrue(content.contains("deleted successfully"));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
