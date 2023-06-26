package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {

    WebDriver driver;

    //TC#4: Verifying “Simple dropdown” and “State selection” dropdown
    //default values
    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/dropdown


    @BeforeTest
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }

    @Test
    public void dropDownsTest() {
        driver.get("https://practice.cydeo.com/dropdown");
        Select simpleDropDown = new Select(driver.findElement(By.cssSelector("select[id='dropdown']")));
        WebElement currentSelectedOption = simpleDropDown.getFirstSelectedOption();
        String actualSelectedOption = currentSelectedOption.getText();
        String expectedSelectedOption = "Please select an option";
        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Assert.assertEquals(actualSelectedOption, expectedSelectedOption);


        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State
        Select simpleDropDown2 = new Select(driver.findElement(By.cssSelector("select[id='state']")));
        WebElement currentSelectedOption2 = simpleDropDown2.getFirstSelectedOption();
        String actualSelectedOption2 = currentSelectedOption2.getText();
        String expectedSelectionOption2 = "Select a State";
        Assert.assertEquals(actualSelectedOption2, expectedSelectionOption2);
    }

}
