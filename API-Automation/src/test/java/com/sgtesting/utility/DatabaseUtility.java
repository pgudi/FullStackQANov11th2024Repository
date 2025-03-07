package com.sgtesting.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseUtility {
    public static void main(String[] args) {
        String data=getEmployeeId("SELECT * FROM (SELECT * FROM system.tbl_employees ORDER BY CREATED_AT DESC) WHERE rownum=1");
        System.out.println("Expected Result:"+data);
    }
    public static String getEmployeeId(String query)
    {
        Connection conn=null;
        String empId=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
            System.out.println("Connection has established!!!");
            PreparedStatement stmt=conn.prepareStatement(query);
            ResultSet rs=stmt.executeQuery();
            rs.next();
            empId=rs.getString("id");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                conn.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return empId;
    }
}
