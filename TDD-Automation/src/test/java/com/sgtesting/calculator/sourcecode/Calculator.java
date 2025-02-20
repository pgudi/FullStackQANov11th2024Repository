package com.sgtesting.calculator.sourcecode;

public class Calculator {

    /**
     * Method Name: Subtraction
     */
    public int Subtraction(int number1, int number2)
    {
        int result=0;
        try
        {
            result=(number1 - number2);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Method Name: multiplication
     */
    public int multiplication(int number1, int number2)
    {
        int result=1;
        try
        {
            result=(number1 * number2);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Method Name: multiplication
     */
    public int multiplication(int numbers[])
    {
        int result=1;
        try
        {
            for(int i=0;i<numbers.length;i++)
            {
                result*=numbers[i];
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Method Name: addition
     */
    public int addition(int numbers[])
    {
        int result=0;
        try
        {
            for(int i=0;i<numbers.length;i++)
            {
                result+=numbers[i];
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Method Name: addition
     */
    public int addition(int number1, int number2)
    {
        int result=0;
        try
        {
            result=(number1 + number2);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Method Name: Division
     */
    public int division(int number1, int number2)
    {
        int result=0;
        try
        {
            result=(number1 / number2);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

}
