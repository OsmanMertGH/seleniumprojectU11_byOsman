package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        String currentTitle= driver.getTitle();

        driver.close();

        if (currentTitle.contains("Yahoo")){
            System.out.println("Excepted");
        }else System.out.println("Not Excepted");

    }
}
