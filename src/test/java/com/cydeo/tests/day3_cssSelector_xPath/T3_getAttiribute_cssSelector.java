package com.cydeo.tests.day3_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttiribute_cssSelector {

    public static void main(String[] args) {

        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");
        driver.manage().window().maximize();
        //3- Verify “Log in” button text is as expected:

        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String actualSignInButton = signInButton.getAttribute("value");
        String expectedSignInButton = "Log In";

        if (actualSignInButton.equals(expectedSignInButton)) {

            System.out.println("expectedSignInButton = " + expectedSignInButton);
            System.out.println("actualSignInButton = " + actualSignInButton);
            System.out.println("Sign In button text is PASSED!!!");
        } else
            System.out.println("Sign In button text is FAILED!!!");

        //Expected: Log In
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button fro
    }
}
