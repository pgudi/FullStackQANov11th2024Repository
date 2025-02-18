package com.sgtesting.tests;
interface University
{
    void showUniversity(String name);
}

interface College
{
    void showCollegeName(String name);
}

class LVDCollege implements College, University
{
    public void showUniversity(String name)
    {
        System.out.println("University Name :"+name);
    }

    public void showCollegeName(String name)
    {
        System.out.println("College Name :"+name);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        University university=new LVDCollege();
        university.showUniversity("VTU Belguam");

        College college=(College) university;
        college.showCollegeName("LVD Degree College");
    }
}
