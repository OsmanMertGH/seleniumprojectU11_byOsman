package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T1_xPath_cssSelector_practice {
    public static void main(String[] args) {
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        System.out.println(driver.findElement(By.cssSelector("a[class='nav-link']")).getText());
        System.out.println(driver.findElement(By.cssSelector("a.nav-link")).getText());

        System.out.println("XPATH Result");
        System.out.println(driver.findElement(By.xpath("//a[@class='nav-link']")).getText());


        //b. “Forgot password” header
        System.out.println(driver.findElement(By.cssSelector("div[class='example']>h2")).getText());
        System.out.println(driver.findElement(By.cssSelector("div.example>h2")).getText());
        System.out.println("XPATH Result");
        System.out.println(driver.findElement(By.xpath("//div[@class='example']")));

        //c. “E-mail” text
        System.out.println(driver.findElement(By.cssSelector("label[for='email']")).getText());

        //d. E-mail input box
        System.out.println(driver.findElement(By.cssSelector("input[name='email']")).getText());

        //e. “Retrieve password” button
        driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']")).click();

        //f. “Powered by Cydeo text
        System.out.println(driver.findElement(By.cssSelector("div[style='text-align: center;']")).getText());


        //4. Verify all web elements are displayed.
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possibl
    }
}
