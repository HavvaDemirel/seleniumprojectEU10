package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_alertPractices {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //TC #1: Information alert practice
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }
    @Test
    public void alert_test1(){
    //3. Click to “Click for JS Alert” button
        WebElement alertButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        alertButton.click();

    //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
    //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        String expectedResultText = "You successfully clicked an alert";
        String actualResultText = resultText.getText();
        Assert.assertEquals(expectedResultText,actualResultText,"actual result text is not as expected!!!" );

      //OR  Assert.assertTrue(resultText.isDisplayed(),"Resul text is not displayed");
}






}
