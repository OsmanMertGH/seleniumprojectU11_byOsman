package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetText_GetAttribute {
    public static void main(String[] args) throws InterruptedException {
        //TC #5: getText() and getAttribute() method practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        Thread.sleep(3000);
        //3- Verify header text is as expected:
        //Expected: Registration form
        if (driver.findElement(By.tagName("h2")).getText().equals("Registration form")) {
            System.out.println("Form Title Test PASSED!!!");
        } else
            System.out.println("Title test FAILED!!!");

        //4- Locate “First name” input box
        String actualPlaceHolder = driver.findElement(By.name("firstname")).getAttribute("placeholder");
        if (actualPlaceHolder.equals("first name")) {
            System.out.println("Place Holder Test Verification PASSED!!!");
        } else
            System.out.println("Place Holder (First Name) Title Test Verification FAILED!!!");

        //5- Verify placeholder attribute’s value is as expected:
        //Expected: first name

        driver.close();
    }
}
