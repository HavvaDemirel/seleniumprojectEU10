package com.cydeo.Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {
    /**
     * in this class only general utility methods that are not related to some specific page
     */

    //this method will accept int (in second )and execute Thread.sleep for given duration
    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }

    //this method is switching window and verify the title
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle) {
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("Current url: " + driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }
        //5. Assert: Title contains expectingInTitle
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
        //Assert.assertTrue(driver.getTitle().contains("etsy"));    can be used
    }

    //this method accepts a string "expected title and asserts if it is true
    public static void verifyTitle(WebDriver driver, String expectedTitle) {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }


}
