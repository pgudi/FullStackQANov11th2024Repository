package com.sgtesting.validation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sgtesting.pojotests.Employee;
import com.sgtesting.utility.DatabaseUtility;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class EmployeeTests {

    @Test (enabled = false)
    public void displayEmployee()
    {
        String filename=null;
        try
        {
            //This method performs display of Employee
            filename="./datafiles/employeeschemadata.txt";

            String jsonschema=FileUtils.readFileToString(new File(filename));
            RestAssured.baseURI="http://localhost:9090/sgtesting/api/v1/employees/1";
            RequestSpecification httpRequest = RestAssured.given();
            //Setup Headers
            httpRequest.header("Content-Type","application/json");
            //execute Http Method
            Response response=httpRequest.get();
            String content=response.prettyPrint();
            System.out.println(content);
            response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonschema));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test (enabled = true)
    public void createEmployeeValidateWithDB()
    {
        try
        {
            //This method performs creation of Employee
            RestAssured.baseURI="http://localhost:9090/sgtesting/api/v1/employees";
            RequestSpecification httpRequest = RestAssured.given();
            //Pojo class Object
            Employee obj=new Employee();
            obj.setEmployeeFirstName("Srikanth");
            obj.setEmployeeLastName("Poojari");
            obj.setEmailId("srikanth@gmail.com");
            obj.setAge(24);
            obj.setSalary(45000L);
            obj.setAddress("4th Stage, 5th Cross, 8th Main, Raichur");
            obj.setCityName("Raichur");
            obj.setContactNumber(7090345678L);
            obj.setDepartmentName("Operations");
            obj.setJobName("Automation Engineer");

            ObjectMapper mapper=new ObjectMapper();

            String employeeobject=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
            System.out.println(employeeobject);

            //Setup Headers
            httpRequest.header("Content-Type","application/json");
            //Provide request as body
            httpRequest.body(employeeobject);
            //execute Http Method
            Response response=httpRequest.post();
            String content=response.prettyPrint();
            System.out.println(content);
            JsonPath jpath=response.jsonPath();
            String employee_id=jpath.getString("id");
            System.out.println("Employee Id :"+employee_id);
            String actual_emp_id= DatabaseUtility.getEmployeeId("SELECT * FROM (SELECT * FROM system.tbl_employees ORDER BY CREATED_AT DESC) WHERE rownum=1");

            Assert.assertEquals(actual_emp_id, employee_id);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
