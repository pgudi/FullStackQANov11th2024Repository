package com.sgtesting.programs;
class GeneralMaths
{
    static GeneralMaths obj=null;
    private GeneralMaths()
    {
        // No Args private constructor
    }
    void addition(int x,int y)
    {
        int res=(x + y);
        System.out.println("Addition Result :"+res);
    }

    void multiplication(int x, int y)
    {
        int res=(x * y);
        System.out.println("Multiplication Result :"+res);
    }

    public static GeneralMaths getInstance()
    {
        if(obj==null)
        {
            obj=new GeneralMaths();
        }
        return obj;
    }
}
public class AfterApplyingSingletomDemo {
    public static void main(String[] args) {
        GeneralMaths o1=GeneralMaths.getInstance();
        o1.addition(20,10);
        o1.multiplication(12,10);

        GeneralMaths o2=GeneralMaths.getInstance();
        o2.addition(230,100);
        o2.multiplication(15,11);

        GeneralMaths o3=GeneralMaths.getInstance();
        o3.addition(50,20);
        o3.multiplication(19,10);

        if(o1==o2 && o2==o3)
        {
            System.out.println("Object has achieved singleton concept");
        }
        else
        {
            System.out.println("Object has not achieved singleton concept");
        }
    }
}
