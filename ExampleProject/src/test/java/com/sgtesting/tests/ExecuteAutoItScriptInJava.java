package com.sgtesting.tests;

public class ExecuteAutoItScriptInJava {

    public static void main(String[] args) {
        runAutoItScript();
    }

    private static void runAutoItScript()
    {
        try
        {
    //        Runtime.getRuntime().exec("G:\\GitQARepository1\\CurrentWorkSpace\\FullStackQANov11th2024Repository\\AutoIt\\LaunchFileAndSaveFile.exe");
            Runtime runTime=Runtime.getRuntime();
            runTime.exec("G:\\GitQARepository1\\CurrentWorkSpace\\FullStackQANov11th2024Repository\\AutoIt\\LaunchFileAndSaveFile.exe");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
