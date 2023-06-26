package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5_New_Window {

    //TC #5: Window Handle practice
    //1. Create a new class called: T5_WindowsPractice
    //2. Create new test and make set ups
    //3. Go to : https://practice.cydeo.com/windows

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void windows_T5() {
        //4. Assert: Title is “Windows”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle, expectedTitle);

        //5. Click to: “Click Here” link
        WebElement clickHere = driver.findElement(By.cssSelector("a[href='/windows/new']"));
        clickHere.click();

        //6. Switch to new Window.
        Set<String> allWindows = driver.getWindowHandles();

        for (String each : allWindows) {
            driver.switchTo().window(each);
        }
        //7. Assert: Title is “New Window”
        String actualNewTitle = driver.getTitle();
        String expectedNewTitle = "New Window";
        Assert.assertEquals(actualNewTitle, expectedNewTitle);

    }
}
