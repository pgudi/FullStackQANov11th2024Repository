package com.sgtesting.employee.stepdefinitions;

import io.restassured.path.json.JsonPath;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;

public class StepDefinitions{
	public static Logger log=LogManager.getLogger(StepDefinitions.class);
	public static RequestSpecification httpRequest=null;
	public static Response response=null;
	public static File createEmployeeJosnFile=null;
	public static String employee_id;
	/**
	 * Step Name: I provide Get Employee EndPoint
	 */
	@Given("^I provide Get Employee EndPoint$")
	public void I_provide_Get_Employee_EndPoint()
	{
		try
		{
			log.info("I provide Get Employee EndPoint");
			RestAssured.baseURI="http://localhost:8081/sgtesting/api/v1/employees/1";
			
		}catch (Exception e) 
		{
			log.error("there is a Error message has occured during execution of I_provide_Get_Employee_EndPoint, Exception :"+e );
		}
	}
	
	/**
	 * Step Name: I provide Get Employee Request EndPoint
	 */
	@Given("^I provide Get Employee (.*) EndPoint with employeeId$")
	public void I_provide_Get_Employee_Request_EndPoint_with_employeeId(String request)
	{
		try
		{
			log.info("I provide Get Employee Request EndPoint");
			RestAssured.baseURI = request;
		}catch (Exception e) 
		{
			log.error("there is a Error message has occured during execution of I_provide_Get_Employee_Request_EndPoint_with_employeeId, Exception :"+e );
		}
	}

	/**
	 * I provide Get Employee <Request> EndPoint
	 */
	@Given("^I provide Get Employee (.*) EndPoint$")
	public void I_provide_Get_Employee_Request_EndPoint(String request)
	{
		try
		{
			log.info("I provide Get Employee Request EndPoint");
			RestAssured.baseURI = request+"/"+employee_id;
		}catch (Exception e)
		{
			log.error("there is a Error message has occured during execution of I_provide_Get_Employee_Request_EndPoint, Exception :"+e );
		}
	}
	/**
	 * Step Name: I provide Get Employee Request EndPoint
	 */
	@Given("^I provide Post Employee (.*) End Point$")
	public void I_provide_Post_Employee_Request_EndPoint(String request)
	{
		try
		{
			log.info("I provide Post Employee Request EndPoint");
			RestAssured.baseURI = request;
		}catch (Exception e)
		{
			log.error("there is a Error message has occured during execution of I_provide_Post_Employee_Request_EndPoint, Exception :"+e );
		}
	}
	/**
	 * I provide Delete Employee <Request> EndPoint
	 */
	@Given("^I provide Delete Employee (.*) EndPoint$")
	public void I_provide_Delete_Employee_Request_EndPoint(String request)
	{
		try
		{
			log.info("I provide Delete Employee Request EndPoint");
			RestAssured.baseURI = request+"/"+employee_id;
		}catch (Exception e)
		{
			log.error("there is a Error message has occured during execution of I_provide_Delete_Employee_Request_EndPoint, Exception :"+e );
		}
	}
	/**
	 * Step Name: I create RequestSpecification object
	 */
	@And("^I create RequestSpecification object$")
	public void I_create_RequestSpecification_object()
	{
		try
		{
			log.info("I create RequestSpecification object");
			httpRequest=RestAssured.given();
		}catch (Exception e) 
		{
			log.error("there is a Error message has occured during execution of I_create_RequestSpecification_object, Exception :"+e );
		}
	}
	/**
	 * I provide the Request Body
	 */
	@And("^I provide the Request Body$")
	public void I_provide_the_Request_Body()
	{
		try
		{
			log.info("I provide the Request Body");
			String create_employee_file="./datafiles/createemployee.json";
			createEmployeeJosnFile=new File(create_employee_file);
		}catch (Exception e)
		{
			log.error("there is a Error message has occured during execution of I_provide_the_Request_Body, Exception :"+e );
		}
	}
	/**
	 * Step Name: I provide header for the request
	 */
	@And("^I provide header for the request$")
	public void I_provide_header_for_the_request()
	{
		try
		{
			log.info("I provide header for the request");
			httpRequest.header("Content-Type", "application/json");
		}catch (Exception e) 
		{
			log.error("there is a Error message has occured during execution of I_provide_header_for_the_request, Exception :"+e );
		}
	}

	/**
	 * I enter request object to body method
	 */
	@And("^I enter request object to body method$")
	public void I_enter_request_object_to_body_method()
	{
		try
		{
			log.info("I enter request object to body method");
			httpRequest.body(createEmployeeJosnFile);
		}catch (Exception e)
		{
			log.error("there is a Error message has occured during execution of I_enter_request_object_to_body_method, Exception :"+e );
		}
	}
	/**
	 * Step Name: I run the GET Http Method
	 */

	@When("^I run the GET Http Method$")
	public void I_run_the_GET_Http_Method()
	{
		try
		{
			log.info("I run the GET Http Method");
			response=httpRequest.get();
			String content=response.asPrettyString();
			log.info(content);
		}catch (Exception e) 
		{
			log.error("there is a Error message has occured during execution of I_run_the_GET_Http_Method, Exception :"+e );
		}
	}

	/**
	 * I run the POST http Method
	 */
	@When("^I run the POST http Method$")
	public void I_run_the_POST_http_Method()
	{
		try
		{
			log.info("I run the POST http Method");
			response=httpRequest.post();
			String content=response.asPrettyString();
			log.info(content);
		}catch (Exception e)
		{
			log.error("there is a Error message has occured during execution of I_run_the_POST_http_Method, Exception :"+e );
		}
	}

	/**
	 * I run the DELETE Http Method
	 */
	@When("^I run the DELETE Http Method$")
	public void I_run_the_DELETE_Http_Method()
	{
		try
		{
			log.info("I run the DELETE Http Method");
			response=httpRequest.delete();
			String content=response.asPrettyString();
			log.info(content);
		}catch (Exception e)
		{
			log.error("there is a Error message has occured during execution of I_run_the_DELETE_Http_Method, Exception :"+e );
		}
	}
	/**
	 * I get the status code as 201
	 */
	@Then("^I get the status code as 201$")
	public void I_get_the_status_code_as_201()
	{
		try
		{
			log.info("I get the status code as 201");
			int statusCode=response.getStatusCode();
			Assert.assertEquals(statusCode, 201);
		}catch (Exception e)
		{
			log.error("there is a Error message has occured during execution of I_get_the_status_code_as_201, Exception :"+e );
		}
	}
	/**
	 * Step Name: I get the status code as 200
	 */

	@Then("^I get the status code as 200$")
	public void I_get_the_status_code_as_200()
	{
		try
		{
			log.info("I get the status code as 200");
			int statusCode=response.getStatusCode();
			Assert.assertEquals(statusCode, 200);
		}catch (Exception e) 
		{
			log.error("there is a Error message has occured during execution of I_get_the_status_code_as_200, Exception :"+e );
		}
	}

	/**
	 * I store employeeId in a variable
	 */
	@And("^I store employeeId in a variable$")
	public void I_store_employeeId_in_a_variable()
	{
		try
		{
			log.info("I store employeeId in a variable");
			JsonPath jPath=response.jsonPath();
			employee_id= jPath.getString("id");
			log.info("Employee Id :"+employee_id);
		}catch (Exception e)
		{
			log.error("there is a Error message has occured during execution of I_store_employeeId_in_a_variable, Exception :"+e );
		}
	}

	@Given("^I connect to the Oracle Database$")
	public void I_connect_to_the_Oracle_Database()
	{
		System.out.println("I connect to the Oracle Database");
	}
	
	@Given("^I fetch records from Oracle Database$")
	public void I_fetch_records_from_Oracle_Database()
	{
		System.out.println("I fetch records from Oracle Database");
	}
}
