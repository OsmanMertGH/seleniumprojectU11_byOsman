package com.cydeo.tests.day3_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T2_getText_getAttiribute {

    public static void main(String[] args) {

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.navigate().to("https://login1.nextbasecrm.com/");
        //3- Verify “remember me” label text is as expected:

        String expectedResult="Remember me on this computer";
        String actualResult=driver.findElement(By.className("login-item-checkbox-label")).getText();
        //Expected: Remember me on this computer
        if (actualResult.equals(expectedResult)){
            System.out.println("Remember me verification is PASSED!!!");
        } else
            System.out.println("Remember me verification is FAILED!!!");

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        String expectedForgetPassword="Forgot your password?";
        String actualForgetPassword=driver.findElement(By.className("login-link-forgot-pass")).getText();

        if (actualForgetPassword.equals(expectedForgetPassword)){
            System.out.println("Forget password verification is PASSED!!!");
        } else
            System.out.println("Forget password verification is FAILED!!!");
        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes

        String expectedForgetPasswordHref = "/?forgot_password=yes";
        String actualForgetPasswordHref = driver.findElement(By.className("login-link-forgot-pass")).getAttribute("href");
        if (expectedForgetPasswordHref.equals(actualForgetPasswordHref)){
            System.out.println("Forget password verification is PASSED!!!");
        } else
            System.out.println("Forget password verification is FAILED!!!");


        //PS: Inspect and decide which locator you should be using to locate web
        //elements
    }
}