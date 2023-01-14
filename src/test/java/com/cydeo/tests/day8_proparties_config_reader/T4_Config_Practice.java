package com.cydeo.tests.day8_proparties_config_reader;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.WebDriverFactory;
import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice extends TestBase {
    @BeforeMethod
    public void setUp() {

        String browserType = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }


    @Test
    public void google_search_test() {
        WebElement googleSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
        WebElement alertButton = driver.findElement(By.xpath("//div[.='Accept all']"));
        alertButton.click();
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);
        String expectedTitle = "apple - Google Search";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
