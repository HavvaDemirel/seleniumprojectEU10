package com.cydeo.tests.day5_TestNG_intro_dropdowns.taks;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC7 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //TC #7: Selecting value from non-select dropdown
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void nonSelectDropdown() throws InterruptedException {
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
        //3. Click to non-select dropdown
        WebElement nonSelectDropdown = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
        nonSelectDropdown.click();
        //4. Select Facebook from dropdown
        WebElement Facebook = driver.findElement(By.xpath("//a[.='Facebook']"));
        Facebook.click();
        //5. Verify title is “Facebook - Log In or Sign Up”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook";
        Thread.sleep(3000);
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification is Passed");
        } else {
            System.out.println("Title verification Failed");
        }
    }
    @AfterMethod
    public void tearDownMethod() {

      // driver.close();

    }

}
