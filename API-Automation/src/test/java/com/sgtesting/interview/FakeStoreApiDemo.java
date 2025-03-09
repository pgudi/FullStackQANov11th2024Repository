package com.sgtesting.interview;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.List;

public class FakeStoreApiDemo {
    public static void main(String[] args) {
    //    imageCount();
    //    displayAllTitles();
        sumOfPrices();
    }

    private static void imageCount()
    {
        try
        {
            RestAssured.baseURI="https://fakestoreapi.com/products/";
            RequestSpecification httpRequest= RestAssured.given();

            httpRequest.header("Content-Type","application/json");

            Response response=httpRequest.get();

            JsonPath jpath=response.jsonPath();
            List<String> obj=jpath.getList("image");
            int count=0;
            for(String image:obj)
            {
                count+=1;
            }
            System.out.println("# of Images in a Response :"+count);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void displayAllTitles()
    {
        try
        {
            RestAssured.baseURI="https://fakestoreapi.com/products/";
            RequestSpecification httpRequest= RestAssured.given();

            httpRequest.header("Content-Type","application/json");

            Response response=httpRequest.get();

            JsonPath jpath=response.jsonPath();
            List<String> obj=jpath.getList("title");

            for(String title:obj)
            {
                System.out.println(title);
            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void sumOfPrices()
    {
        try
        {
            RestAssured.baseURI="https://fakestoreapi.com/products/";
            RequestSpecification httpRequest= RestAssured.given();

            httpRequest.header("Content-Type","application/json");

            Response response=httpRequest.get();

            JsonPath jpath=response.jsonPath();
            List<Object> obj=jpath.getList("price");
            double sum=0.0;
           for(Object price: obj)
           {
               String newprice= price.toString();
        //       System.out.println(newprice);
               sum=sum + Double.parseDouble(newprice);
           }
            System.out.println("The Total Sum of Price :"+sum);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
