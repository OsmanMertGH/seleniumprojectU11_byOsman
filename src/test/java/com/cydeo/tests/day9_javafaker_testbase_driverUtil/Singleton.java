package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

public class Singleton {

    private Singleton(){}

    //prevent access and provide a getter method
    private static String word;

    public static String getWord(){
        if(word==null){
            System.out.println("First time");

            word="something";
        }else {
            System.out.println("Word already has value");
        }

        return word;
    }
}
