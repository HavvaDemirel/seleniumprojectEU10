package com.cydeo.tests.day5_TestNG_intro_dropdowns;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //do browser driver setup
        //open browser
        driver = WebDriverFactory.getDriver("chrome");
    }

    @Test
    public void selenium_test() {
        //maximize page
        //  driver.manage().window().maximize();
        //implicitWait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get "https://google.com
        driver.get("https://google.com");
        //assert: title is "google"
        WebElement acceptAllButton = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        acceptAllButton.click();
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching");


    }
}
