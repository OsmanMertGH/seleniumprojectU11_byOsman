package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {

        //TC #1: Cydeo practice tool verifications
        WebDriverManager.chromedriver().setup();
        //1. Open Chrome browser
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");
        //3. Verify URL contains
        //Expected: cydeo
        String currentURL = driver.getCurrentUrl();
        if (currentURL.contains("cydeo")) {
            System.out.println("Passed");
        } else System.out.println("Failed");

        //4. Verify title:
        //Expected: Practic
        String currentTitle = driver.getTitle();
        if (currentTitle.contains("Practice")) {
            System.out.println("Passed");
        } else System.out.println("Failed");

        driver.close();
    }
}
