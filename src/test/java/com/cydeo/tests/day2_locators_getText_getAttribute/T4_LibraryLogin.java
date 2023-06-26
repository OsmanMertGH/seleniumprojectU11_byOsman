package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLogin {
    public static void main(String[] args) {

        //TC #4: Library verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://library2.cybertekschool.com/login.html
        driver.get("http://library2.cybertekschool.com/login.html");
        //3. Enter username: “incorrect@email.com”

        WebElement username = driver.findElement(By.className("form-control"));
        username.sendKeys("incorrect@email.com");
        //4. Enter password: “incorrect password”
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect pass");

        driver.findElement(By.tagName("button")).click();


        //5. Verify: visually “Sorry, Wrong Email or Password”
        //displayed
        //PS: Locate username input box using “className” locator
        //Locate password input box using “id” locator
        //Locate Sign in button using “tagName” locato
    }
}
