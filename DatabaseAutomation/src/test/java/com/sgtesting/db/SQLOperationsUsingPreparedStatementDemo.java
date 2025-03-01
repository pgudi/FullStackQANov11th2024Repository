package com.sgtesting.db;

import java.sql.*;

public class SQLOperationsUsingPreparedStatementDemo {
    public static void main(String[] args) {
   //     readRecordsFromDatabase();
        insertRecordsInToDatabase();
    }

    private static void readRecordsFromDatabase()
    {
        Connection conn=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
            System.out.println("The Connection has established successfully");

            String query="select * from dept";
            PreparedStatement stmt=conn.prepareStatement(query);
            ResultSet rs =stmt.executeQuery();
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

    private static void insertRecordsInToDatabase()
    {
        Connection conn=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
            System.out.println("The Connection has established successfully");

            String query="insert into dept values(60,'PURCHASE','MYSORE')";
            PreparedStatement stmt=conn.prepareStatement(query);
            int v1=stmt.executeUpdate();
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
