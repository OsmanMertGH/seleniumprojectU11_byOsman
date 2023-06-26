package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @Test(priority = 1)
    public void test1() {
        System.out.println("Test 1 is running....");

        String actual = "Osman";
        String expected = "Osman";

        Assert.assertEquals(actual, expected);

    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("Test 2 is running....");
    }


    @BeforeClass
    public void setUpClass() {
        System.out.println("---> Before Class is running...");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("---> After Class is running...");
    }

    @BeforeTest
    public void setUpMethod() {
        System.out.println("---> Before Method is running...");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("---> After Method is running...");
    }

}
