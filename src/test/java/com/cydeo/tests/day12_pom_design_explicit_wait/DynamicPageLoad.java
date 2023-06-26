package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicPageLoad {

    @Test
    public void done_message_test(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        ////1. Go to https://practice.cydeo.com/dynamic_loading/7
        ////2. Wait until title is “Dynamic title”

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        ////3. Assert: Message “Done” is displayed.
        Assert.assertTrue(dynamicLoad7Page.alertDone.isDisplayed());

        ////4. Assert: Image is displayed
        Assert.assertTrue(dynamicLoad7Page.img.isDisplayed());
    }
}
