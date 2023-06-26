package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {

    public DynamicControlsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[@type='button']")
    public WebElement removeButton;

    @FindBy (xpath = "//p[@id='message']")
    public WebElement message;

    @FindBy (xpath = "//div[@id='loading']")
    public WebElement loadingBar;

    @FindBy(xpath = "//div[@id='checkbox']")
    public WebElement checkbox;

}
