package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T1_WindowHandling extends TestBase {

    @Test
    public void window_handling_test() {

//TC #1: Window Handle practice
// 1. Create new test and make set ups
//2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");
//3. Copy paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
        BrowserUtils.switchWindowAndVerify(driver,"etsy","Etsy");


/**instead of all this code we use this method  BrowserUtils.switchWindowAndVerify(driver,"etsy","Etsy");*/

//4. Create a logic to switch to the tab where Etsy.com is open
     /*   Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains("etsy")) {
                break;
            }

        }
        //5. Assert: Title contains “Etsy”
        String actualTitle = driver.getTitle();
        String expectedTitleIn = "etsy";

       // Assert.assertTrue(actualTitle.contains(expectedTitleIn));
        //Assert.assertTrue(driver.getTitle().contains("etsy"));    can be used
//
//Lines to be pasted:
//((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
//((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
//((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
//
//These lines will simply open new tabs using something called JavascriptExecutor
//and get those pages. We will learn JavascriptExecutor later as well.


    */
    }

}
