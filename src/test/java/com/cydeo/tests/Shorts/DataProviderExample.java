package com.cydeo.tests.Shorts;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    WebDriver driver;
    @Test(dataProvider = "searchData")
    public void Test1(String keyword,String expectedTitle){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https.//google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(keyword+ Keys.ENTER);
    }
    @DataProvider (name = "searchData")
    public Object [][] testData(){
        return new Object[][]{
                {"selenium","selenium - Google - Search"},
                {"java","java - Google - Search"},
                {"job","job - Google - Search"},
                {"cydeo","cydeo - Google - Search"},

        };

    }
}
