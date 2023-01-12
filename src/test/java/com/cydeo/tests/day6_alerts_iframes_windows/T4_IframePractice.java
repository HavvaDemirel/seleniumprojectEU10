package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class T4_IframePractice {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //TC #: iframe practice
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to website: http://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
    }
    @Test
    public void iframeTest(){

        // we need to switch drivers focus to iframe
        // option1 switching to iframe using id attribute value
       driver.switchTo().frame("mce_0_ifr");
       //option2 passing index number of iframe
       // driver.switchTo().frame(0);
       // option3
       // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //locate the p tag
        WebElement yourContentGoesHereTText = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesHereTText.isDisplayed());
         //verify "An iFrame containing the TinyMCE WYSIWYG Editor
        //to be able to verify header, we must switch back to "main html"
        driver.switchTo().parentFrame();
        WebElement headerText = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed());//verifying




    }







}
