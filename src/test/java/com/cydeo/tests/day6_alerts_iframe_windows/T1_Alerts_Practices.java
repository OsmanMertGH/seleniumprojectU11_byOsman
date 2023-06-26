package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alerts_Practices {


    WebDriver driver;

    @BeforeMethod
    public void setUP() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    //TC #1: Information alert practice
    //1. Open browser
    //2. Go to website: http://practice.cydeo.com/javascript_alerts
    //3. Click to “Click for JS Alert” button
    //4. Click to OK button from the alert
    //5. Verify “You successfully clicked an alert” text is displayed
    @Test
    public void alerts_T1() {
        WebElement jsAlertBtn = driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
        jsAlertBtn.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement actualTextMessage = driver.findElement(By.cssSelector("p[id='result']"));
        String actualText = actualTextMessage.getText();
        String expectedTextMessage = "You successfully clicked an alert";

        Assert.assertEquals(actualText, expectedTextMessage);

        Assert.assertTrue(actualTextMessage.isDisplayed(), "Text Message dont DISPLAYED!!!");

    }


    //TC #2: Confirmation alert practice
    //1. Open browser
    //2. Go to website: http://practice.cydeo.com/javascript_alerts
    //3. Click to “Click for JS Confirm” button
    //4. Click to OK button from the alert
    //5. Verify “You clicked: Ok” text is displayed

    @Test
    public void confirmationAlert_T2() {
        WebElement confirmationBtn = driver.findElement(By.cssSelector("button[onclick='jsConfirm()'"));
        confirmationBtn.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement actualTextMessage = driver.findElement(By.cssSelector("p[id='result']"));
        String actualText = actualTextMessage.getText();
        String expectedTextMessage = "You clicked: Ok";

        Assert.assertEquals(actualText, expectedTextMessage);

        Assert.assertTrue(actualTextMessage.isDisplayed(), "Text Message dont DISPLAYED!!!");
    }
}
