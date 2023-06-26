package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_SelectFacebook {

    WebDriver driver;

    @BeforeTest
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @AfterMethod
    public void tearDownMethod() {
        //driver.close();
    }

    @Test
    public void selectFacebook() {

        WebElement dropdownLink = driver.findElement(By.cssSelector("a[class='btn btn-secondary dropdown-toggle']"));
        dropdownLink.click();

        WebElement facebookLink= driver.findElement(By.cssSelector("a[href='https://www.facebook.com/']"));
        facebookLink.click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Giriş Yap veya Kaydl";


        Assert.assertEquals(actualTitle, expectedTitle);
    }
}

//TC #7: Selecting value from non-select dropdown
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/dropdown
//3. Click to non-select dropdown
//4. Select Facebook from dropdown
//5. Verify title is “Facebook - Log In or Sign Up