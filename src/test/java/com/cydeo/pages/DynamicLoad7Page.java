package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad7Page {

    public DynamicLoad7Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='alert']")
    public WebElement alertDone;

    @FindBy(xpath ="//img[@src='/img/a-few-moments.jpg']")
    public WebElement img;
}


//1. Go to https://practice.cydeo.com/dynamic_loading/7
//2. Wait until title is “Dynamic title”
//3. Assert: Message “Done” is displayed.
//4. Assert: Image is displayed