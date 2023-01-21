package com.cydeo.MyPractice.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class smartBearUtils {
   public static void logInSmartBear(WebDriver driver) {
     //Mini-Task: CREATE A CLASS à SmartBearUtils
        //• Create a method called loginToSmartBear
        //• This method simply logs in to SmartBear when you call it.
        //• Accepts WebDriver type as parameter
        WebElement userInputBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userInputBox.sendKeys("Tester");
        WebElement passInputBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        passInputBox.sendKeys("test");
        WebElement logInButton = driver.findElement(By.xpath("//input[@type='submit']"));
        logInButton.click();
    }



}
