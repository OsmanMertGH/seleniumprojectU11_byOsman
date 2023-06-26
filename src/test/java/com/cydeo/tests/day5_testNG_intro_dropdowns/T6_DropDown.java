package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_DropDown {
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
    public void dateSelect() {
        Select selectYear = new Select(driver.findElement(By.cssSelector("select[id='year']")));
        selectYear.selectByVisibleText("1924");

        Select selectMonth = new Select(driver.findElement(By.cssSelector("select[id='month']")));
        selectMonth.selectByValue("11");

        Select selectDay = new Select(driver.findElement(By.cssSelector("select[id='day']")));
        selectDay.selectByIndex(0);

        String actualSelectedDate = selectMonth.getFirstSelectedOption().getText() + " " + selectDay.getFirstSelectedOption().getText() + "st, " + selectYear.getFirstSelectedOption().getText();
        String expectedResult = "December 1st, 1924";

        Assert.assertEquals(actualSelectedDate, expectedResult);

    }

}

//TC #6: Selecting date on dropdown and verifying
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/dropdown
//3. Select “December 1st, 1923” and verify it is selected.
//Select year using : visible text
//Select month using : value attribute
//Select day using : index number
