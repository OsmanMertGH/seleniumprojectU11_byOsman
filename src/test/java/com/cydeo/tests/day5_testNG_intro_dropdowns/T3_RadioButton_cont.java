package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {

    public static void main(String[] args) {
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        //3. Click to “Hockey” radio button

        //WebElement buttonHockey = driver.findElement(By.xpath("//input[@id='hockey']"));

        clickAndVerifyRadioButton(driver,"sport","hockey");
    }


    // //Create a utility method to handle above logic.
    //        //Method name: clickAndVerifyRadioButton
    //        //Return type: void or boolean
    //        //Method args:
    //        //1. WebDriver
    //        //2. Name attribute as String (for providing which group of radio buttons)
    //        //3. Id attribute as String (for providing which radio button to be clicked)
    //        //Method should loop through the given group of radio buttons. When it finds the
    //        //matching option, it should click and verify option is Selected.
    //        //Print out verification: tru
    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {

        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        for (WebElement each : radioButtons) {
            String eachId = each.getAttribute("id");

            if (eachId.equals(idValue)) {
                each.click();
                System.out.println("each.isSelected() = " + each.isSelected());
                break;
            }
        }
    }


}
