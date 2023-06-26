package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_iframe_Practice {

    //TC #4: Iframe practice
    //1. Create a new class called: T4_Iframes
    //2. Create new test and make set ups
    //3. Go to: https://practice.cydeo.com/iframe
    //4. Assert: “Your content goes here.” Text is displayed.
    //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void iframeT4() {
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[id='mce_0_ifr']")));

        WebElement iframeText = driver.findElement(By.xpath("//p"));
        String actualText = iframeText.getText();
        //4. Assert: “Your content goes here.” Text is displayed.
        String expectedText = "Your content goes here.";

        Assert.assertEquals(actualText, expectedText);

        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
        driver.switchTo().parentFrame();
        WebElement mainFrameText = driver.findElement(By.xpath("//h3"));
        String actualMainText = mainFrameText.getText();
        String expectedMainText = "An iFrame containing the TinyMCE WYSIWYG Editor";

        Assert.assertEquals(actualMainText, expectedMainText);

    }

}
