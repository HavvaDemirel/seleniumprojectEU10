package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //TC #5: windows practice
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to website: http://practice.cydeo.com/windows
        driver.get("http://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_window_test() {
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        //4asset title is "Windows"
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("Title before click = " + actualTitle);
        //5 click to = "click here " link
        WebElement clickHereButton = driver.findElement(By.linkText("Click Here"));
        clickHereButton.click();


        //6switch to new window
        for(String each: driver.getWindowHandles()){
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: "+driver.getTitle());
        }

        //7 asser title is "New Window"
        String expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitleAfterClick);
        System.out.println("Title after click = " + actualTitle);

        //if we want to switch back to main page
        driver.switchTo().window(mainHandle);


    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
