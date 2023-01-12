package com.cydeo.tests.day5_TestNG_intro_dropdowns.taks;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC5 {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
       // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void dropdownTest(){

        Select staleSelectDropdown = new Select(driver.findElement(By.id("state")));
        //System.out.println("staleSelectDropdown.getFirstSelectedOption() = " + staleSelectDropdown.getFirstSelectedOption());
        //3. Select Illinois
        staleSelectDropdown.selectByVisibleText("Illinois");
        //4. Select Virginia
        staleSelectDropdown.selectByVisibleText("Virginia");
        //5. Select California
        staleSelectDropdown.selectByVisibleText("California");
        //6. Verify final selected option is California.
        System.out.println("staleSelectDropdown.getFirstSelectedOption().getText().equals(\"California\") = " + staleSelectDropdown.getFirstSelectedOption().getText().equals("California"));

        //Use all Select options. (visible text, value, index)









    }






}
