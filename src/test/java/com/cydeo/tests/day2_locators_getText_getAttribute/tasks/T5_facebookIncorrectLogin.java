package com.cydeo.tests.day2_locators_getText_getAttribute.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_facebookIncorrectLogin {
    public static void main(String[] args) {
        // TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]")).click();

        //3. Enter incorrect username
        WebElement usernameInput = driver.findElement(By.name("email"));
        usernameInput.sendKeys("incorrectmail");

        //4. Enter incorrect password
        WebElement Password = driver.findElement(By.name("pass"));
        Password.sendKeys("incorrectPass");
        // 5. Verify title changed to:
        //Expected: “Log into Facebook”
        WebElement signIn = driver.findElement(By.tagName("button"));
        signIn.click();
        String expectedTitle = "Log into Facebook";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title Verification PASS");
        } else {
            System.out.println("Title Verification FAILED");
        }
    }
}
