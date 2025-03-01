package com.sgtesting.db;

import java.sql.*;

public class SQLOpearationsUsingStatementDemo {
    public static void main(String[] args) {
     //   readRecordsFromDatabase();
        insertRecordsUsingStatementDemo();
    }

    private static void readRecordsFromDatabase()
    {
        Connection conn=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
            System.out.println("The Connection has established successfully");
            Statement stmt=conn.createStatement();
            String query="select * from dept";
            ResultSet rs =stmt.executeQuery(query);
            ResultSetMetaData rsmeta=rs.getMetaData();
            String colname1=rsmeta.getColumnName(1);
            String colname2=rsmeta.getColumnName(2);
            String colname3=rsmeta.getColumnName(3);
            System.out.printf("%-12s",colname1);
            System.out.printf("%-12s",colname2);
            System.out.printf("%-12s",colname3);
            System.out.printf("\n");
            while(rs.next())
            {
                String deptno=rs.getString("DEPTNO");
                String deptname=rs.getString("DNAME");
                String place=rs.getString("LOC");
                System.out.printf("%-12s",deptno);
                System.out.printf("%-12s",deptname);
                System.out.printf("%-12s",place);
                System.out.printf("\n");
            }
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
    }

    private static void insertRecordsUsingStatementDemo()
    {
        Connection conn=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
            System.out.println("The Connection has established successfully");
            Statement stmt=conn.createStatement();
            String query="insert into dept values(50,'HEALTH','BANGALORE')";
            int v1=stmt.executeUpdate(query);
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {
                conn.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
