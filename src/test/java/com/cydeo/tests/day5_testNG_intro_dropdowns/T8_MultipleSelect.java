package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class T8_MultipleSelect {

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
    public void multipleText() throws InterruptedException {
        Select multipleSelect=new Select(driver.findElement(By.cssSelector("select[name='Languages']")));
        multipleSelect.selectByIndex(0);
        multipleSelect.selectByIndex(1);
        Thread.sleep(2000);
        multipleSelect.selectByIndex(2);
        Thread.sleep(2000);
        multipleSelect.selectByIndex(3);
        Thread.sleep(2000);
        multipleSelect.selectByIndex(4);
        Thread.sleep(2000);
        multipleSelect.selectByIndex(5);

        List<WebElement> list = new ArrayList<>();
        list.addAll(multipleSelect.getAllSelectedOptions());

        for (WebElement each : list) {
            System.out.println(each.getText());
        }

        multipleSelect.deselectAll();

    }

    //TC #8: Selecting value from multiple select dropdown
    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/dropdown
    //3. Select all the options from multiple select dropdown.
    //4. Print out all selected values.
    //5. Deselect all values
}
