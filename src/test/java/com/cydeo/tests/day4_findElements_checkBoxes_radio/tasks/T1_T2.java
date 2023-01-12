package com.cydeo.tests.day4_findElements_checkBoxes_radio.tasks;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_T2 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("Chrome");
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void emailInputTest() {
        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)

        //d. E-mail input box
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
        //inputBox.sendKeys("havseymeldemirel@gmail.com");
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());

        //e. “Retrieve password” button
        WebElement retrievePassButton = driver.findElement(By.xpath("//button[@id='form_submit']"));
        System.out.println("retrievePassButton.isDisplayed() = " + retrievePassButton.isDisplayed());

        //a. “Home” link
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());

        //b. “Forgot password” header
        WebElement forgotPasswordHeader = driver.findElement
                (By.xpath("//h2[.='Forgot Password']"));
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());

        //c. “E-mail” text
        WebElement emailText = driver.findElement(By.xpath("//label[@for='email']"));
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        //f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());
        //4. Verify all web elements are displayed.

    }



    //First solve the task with using cssSelector only. Try to create 2 different
    //cssSelector if possible
    //
    //Then solve the task using XPATH only. Try to create 2 different
    //XPATH locator if possible
    //


}
