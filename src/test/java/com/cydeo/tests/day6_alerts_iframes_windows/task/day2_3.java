package com.cydeo.tests.day6_alerts_iframes_windows.task;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class day2_3 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void alert() {
        //TC #2: Confirmation alert practice
        //1. Open browser
        driver.get("http://practice.cydeo.com/javascript_alerts");
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        WebElement clickJSConfirm = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        clickJSConfirm.click();
        //3. Click to “Click for JS Confirm” button
        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        String expectedText = "You clicked: Ok";
        String actualText = resultText.getText();
        //5. Verify “You clicked: Ok” text is displayed.
        Assert.assertEquals(actualText, expectedText);
        // Assert.assertEquals("You successfully clicked an alert",resultText.getText());

    }


    @Test
    public void promtAlertTest() {
        //TC #3: Prompt alert practice
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
        WebElement clickJSPrompt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        //3. Click to “Click for JS Prompt” button
        clickJSPrompt.click();
        //4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
        //5. Click to OK button from the alert
        alert.accept();
         WebElement text = driver.findElement(By.xpath("//p[.='You entered: hello']"));
        String expextedText = "You entered: hello";
        String actualText = text.getText();
        Assert.assertEquals(actualText, expextedText);
        //6. Verify “You entered: hello” text is displayed.
    }
}
