package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_Crm_Login extends TestBase {

    //1. Create new test and make set ups
    //2. Go to : http://login1.nextbasecrm.com/

    @Test
    public void CRM_Login() {
        driver.get("http://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement loginName = driver.findElement(By.cssSelector("input[class='login-inp']"));
        loginName.sendKeys("helpdesk1@cybertekschool.com");
        //4. Enter valid password
        WebElement loginPassword = driver.findElement(By.cssSelector("input[type='password']"));
        loginPassword.sendKeys("UserUser");
        //5. Click to `Log In` button
        WebElement logInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        logInButton.click();

        //6. Verify title is as expected:
        //Expected: Portal

        BrowserUtils.verifyTitle(driver, "My tasks");


    }

    @Test
    public void crm_login_test_2() {

        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //Calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver);

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "My tasks");

    }


    @Test
    public void crm_login_test_3() {

        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //Calling my utility method to login helpdesk
        CRM_Utilities.crm_login(driver, "helpdesk2@cybertekschool.com", "UserUser");

        //6. Verify title is as expected:
        //Expected: Portal
        //BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(driver, "Portal");

    }

}
