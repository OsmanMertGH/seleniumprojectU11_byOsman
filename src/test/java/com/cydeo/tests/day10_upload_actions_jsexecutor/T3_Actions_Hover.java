package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hover {

    @Test
    public void hovering_test() {
        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        WebElement user1 = Driver.getDriver().findElement(By.xpath("(//h5)[1]"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("(//h5)[2]"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("(//h5)[3]"));

        Actions actions = new Actions(Driver.getDriver());
        //2. Hover over to first image
        actions.moveToElement(img1).perform();
        //3. Assert:
        //a. “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());

        //4. Hover over to second image
        //5. Assert:
        //a. “name: user2” is displayed
        //b. “view profile” is displayed
        //6. Hover over to third image
        //7. Confirm:
        //a. “name: user3” is displayed
        //b. “view profile” is displaye

    }
}
