package com.sgtesting.pojotests;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;

import java.util.HashMap;
import java.util.Map;

public class UserPojo {
    public static void main(String[] args) {
     //   createJsonObject1();
     //   createJsonObject2();
     //   createArrayOfJson();
        mapToJson();
    }

    private static void createJsonObject1()
    {
        try
        {
            Users obj=new Users("Santosh","santosh@gss.com","Dallas");
            ObjectMapper mapper=new ObjectMapper();

            String jsonobject1=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
            System.out.println(jsonobject1);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void createJsonObject2()
    {
        try
        {
            Users obj=new Users();
            obj.setFirstName("Vinith");
            obj.setEmailId("vinuu@skconsulting.com");
            obj.setLocation("California");
            ObjectMapper mapper=new ObjectMapper();

            String jsonobject1=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
            System.out.println(jsonobject1);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void createArrayOfJson()
    {
        try
        {
            Users obj[]={
                    new Users("Adams","adams@gmail.com","Tumkur"),
                    new Users("Miller","miller@gmail.com","Ireland"),
                    new Users("Ford","ford@gss.com","Paris")

            };
            ObjectMapper mapper=new ObjectMapper();

            String jsonobject1=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
            System.out.println(jsonobject1);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void mapToJson()
    {
        try
        {
            Map<String,String> obj=new HashMap<>();
            obj.put("firstName","Srinivasa");
            obj.put("Course","Full Stack Development");

            ObjectMapper mapper=new ObjectMapper();

            String jsonobject1=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
            System.out.println(jsonobject1);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
