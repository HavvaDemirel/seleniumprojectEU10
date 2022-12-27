package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {
       //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        //lets locate home link using css locator_ex1 class value
        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //lets locate home link using css locator_ex2
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));

        //lets locate home link using css locator_ex3 href value
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));
        //b. “Forgot password” header
        //locate header using cssSelector: locate parent element and move down to h2
        WebElement header_ex1 = driver.findElement(By.cssSelector("a[href='/']"));





        //c. “E-mail” text
        //d. E-mail input box
        //e. “Retrieve password” button
        //f. “Powered by Cydeo text
        //4. Verify all web elements are displayed.
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible

        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible

    }
}
