package com.cydeo.tests.day5_TestNG_intro_dropdowns.taks;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC6 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //TC #6: Selecting date on dropdown and verifying
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

        @Test
        public void dropdownTest(){

            //TC #6: Selecting date on dropdown and verifying
            //1. Open Chrome browser
            //2. Go to https://practice.cydeo.com/dropdown      <-------------in @beforeTest method
            //3. Select “December 1st, 1923” and verify it is selected.
            Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
            Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
            Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
            //Select year using  : visible text
            yearDropdown.selectByVisibleText("1923");
            //Select month using   : value attribute
            monthDropdown.selectByValue("11");
            //Select day using : index number
            dayDropdown.selectByIndex(0);

            String expectedYear = "1923";
            String expectedMonth = "December";
            String expectedDay = "1";
            //getting actual values from browser
            String actualYear = yearDropdown.getFirstSelectedOption().getText();
            String actualMont = monthDropdown.getFirstSelectedOption().getText();
            String actualDay = dayDropdown.getFirstSelectedOption().getText();
            // verify
            Assert.assertEquals(expectedYear,actualYear);
            Assert.assertEquals(expectedMonth,actualMont);
            Assert.assertTrue((expectedDay.equals(actualDay)));

        }
        @AfterMethod
        public void teardownMethod(){

            //driver.close();
        }}
