package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicPageLoadTest {

    @Test
    public void dynamic_download_test(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        //2. Click to start
        dynamicLoad1Page.startButton.click();

        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingProgressBar));



        //4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicLoad1Page.username.isDisplayed());

        //5. Enter username: tomsmith
        dynamicLoad1Page.username.sendKeys("tomsmith");

        //6. Enter password: incorrectpassword
        dynamicLoad1Page.password.sendKeys("somethingwrong");

        //7. Click to Submit button
        dynamicLoad1Page.submitButton.click();

        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());

    }

}
