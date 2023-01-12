package com.cydeo.tests.day4_findElements_checkBoxes_radio.tasks;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3 {
    WebDriver driver;

    @BeforeMethod
    public void SetupMethod() {
        //TC #6:  XPATH LOCATOR practice
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void ClickButtonTest() {
        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");
        //3. Click on Button 1
        WebElement clickButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        clickButton.click();
        //4. Verify text displayed is as expected:
        String expectedClickButton = "Clicked on button one!";
        //Expected: “Clicked on button one!”
        WebElement ClickedButtonText = driver.findElement(By.xpath("//p[.='Clicked on button one!']"));
        String actualClickingButton = ClickedButtonText.getText();
        Assert.assertEquals(actualClickingButton, expectedClickButton);
        //
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}