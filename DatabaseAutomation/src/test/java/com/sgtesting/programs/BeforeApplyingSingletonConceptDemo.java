package com.sgtesting.programs;
class GeneralMaths1
{
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
}
public class BeforeApplyingSingletonConceptDemo {
    public static void main(String[] args) {
        GeneralMaths1 o1=new GeneralMaths1();
        o1.addition(20,10);
        o1.multiplication(12,10);

        GeneralMaths1 o2=new GeneralMaths1();
        o2.addition(230,100);
        o2.multiplication(15,11);

        GeneralMaths1 o3=new GeneralMaths1();
        o3.addition(50,20);
        o3.multiplication(19,10);
    }
}
