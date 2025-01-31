package com.sgtesting.javautil;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
    //    writeContent();
        readContent();
    }

    private static void writeContent()
    {
        FileOutputStream fout=null;
        Properties prop=null;
        try
        {
            fout=new FileOutputStream("F:\\Demo\\Test\\Credentail.properties");
            prop=new Properties();
            prop.setProperty("user","admin");
            prop.setProperty("pwd","manager");
            prop.setProperty("pin","2011");

            prop.store(fout, "It is for Testing purpose");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fout.close();
                prop.clear();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    private static void readContent()
    {
        FileInputStream fin=null;
        Properties prop=null;
        try
        {
            fin=new FileInputStream("F:\\Demo\\Test\\Credentail.properties");
            prop=new Properties();

            prop.load(fin);

            String v1=prop.getProperty("user");
            System.out.println(v1);

            String v2=prop.getProperty("pwd");
            System.out.println(v2);

            String v3=prop.getProperty("pin");
            System.out.println(v3);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {

            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
