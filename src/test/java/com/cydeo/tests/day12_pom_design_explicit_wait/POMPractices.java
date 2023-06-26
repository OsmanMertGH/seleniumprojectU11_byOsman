package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POMPractices {
    @Test
    public void required_field_error_message_test(){


        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");

        //3- Do not enter any information
        //4- Click to “Sign in” button
        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.signInButton.click();

        //5- Verify expected error is displayed:
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());
        //Expected: This field is required
    }

    @Test
    public void invalid_email_format_error_message_test(){
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");

        //3- Enter invalid email format
        LibraryLoginPage libraryLoginPage=new LibraryLoginPage();
        libraryLoginPage.inputUsername.sendKeys("aaaaaa");
        libraryLoginPage.signInButton.click();
        //4- Verify expected error is displayed:
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());
        //Expected: Please enter a valid email address
    }

    @Test
    public void library_negative_login(){
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");

        //3- Enter incorrect username or incorrect password
        LibraryLoginPage libraryLoginPage=new LibraryLoginPage();
        libraryLoginPage.inputUsername.sendKeys("fasfasf");
        libraryLoginPage.inputPassword.sendKeys("agfasgasga");
        libraryLoginPage.signInButton.click();
        //4- Verify title expected error is displayed:
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());
        //Expected: Sorry, Wrong Email or Password
    }
}
