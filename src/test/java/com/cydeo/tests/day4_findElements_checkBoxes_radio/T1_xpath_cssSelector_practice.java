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

        //locate header using path and using web element text "forgot password"
        //WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label['@for=email']"));

        //d. E-mail input box
        //tagName[contains(@attribute='value')]
        WebElement inputBox = driver.findElement(By.xpath("//input['@name=email']"));

        //e. “Retrieve password” button
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//*[@id=\"form_submit\"]/i"));
        //f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//*[@id=\"page-footer\"]/div/div/a"));
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());



        //4. Verify all web elements are displayed.
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible

        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible

    }
}
