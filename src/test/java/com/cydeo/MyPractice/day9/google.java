package com.cydeo.MyPractice.day9;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class google extends TestBase {


    @Test
    public void google(){
        driver.get("https://www.google.com/");

        WebElement acceptButton = driver.findElement(By.id("L2AGLb"));
        acceptButton.click();
    }
}
