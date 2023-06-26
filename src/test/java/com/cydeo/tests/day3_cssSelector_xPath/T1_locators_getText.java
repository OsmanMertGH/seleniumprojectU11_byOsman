package com.cydeo.tests.day3_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T1_locators_getText {

    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();
        //ChromeDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        driver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("incorrect");
        driver.findElement(By.className("login-btn")).click();

        if (driver.findElement(By.className("errortext")).getText().equals("Incorrect login or password")) {
            System.out.println("Wrong Password Test Verification is PASSED!!!");
        } else {
            System.out.println("Wrong Password Test Verification is FAILED!!!");
        }

        driver.close();
    }
}
