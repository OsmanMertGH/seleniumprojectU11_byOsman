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

public class T5_DropdownSelect {
    //TC #5: Selecting state from State dropdown and verifying result
    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
    //3. Select Illinois
    //4. Select Virginia
    //5. Select California
    //6. Verify final selected option is California.
    //Use all Select options. (visible text, value, index

    WebDriver driver;

    @BeforeTest
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @AfterMethod
    public void tearDownMethod(){
        //driver.close();
    }

    @Test
    public void selectOption() throws InterruptedException {
        Select select=new Select(driver.findElement(By.cssSelector("select[id='state']")));
        //3. Select Illinois
        Thread.sleep(2000);
        select.selectByValue("IL");

        //4. Select Virginia
        Thread.sleep(2000);
        select.selectByVisibleText("Virginia");
        //5. Select California
        Thread.sleep(2000);
        select.selectByIndex(5);

        //6. Verify final selected option is California.
        //Use all Select options. (visible text, value, index)
        String selectedOptionText= select.getFirstSelectedOption().getText();
        String expectedOption="California";

        Assert.assertEquals(selectedOptionText,expectedOption);

    }

}
