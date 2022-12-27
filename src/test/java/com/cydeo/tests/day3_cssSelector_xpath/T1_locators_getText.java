package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {
    public static void main(String[] args) {
        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();

        // WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("Chrome");// this comes from utilities class
        //driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");
        //3- Enter incorrect username: “incorrect”
        WebElement inputUserName = driver.findElement(By.name("USER_LOGIN"));
        inputUserName.sendKeys("invalid@email");
        //4- Enter incorrect password: “incorrect”
        WebElement inputPassword = driver.findElement(By.className("login-inp"));
        inputPassword.sendKeys("123456");
        //5- Click to login button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //6- Verify error message text is as expected:

        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();
        //Expected: Incorrect login or password
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.

        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Error message verification Passed");
        } else {
            System.out.println("Error message verification Failed");
        }
    }
}
