package com.cydeo.tests.Shorts;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class IFrame extends TestBase {


    @Test
    public void IframeTest() {
        driver.get("http://practice.cydeo.com/iframe");
        //  WebElement iframe = driver.findElement(By.id("mce_o_ifr"));
        //driver.switchTo().frame(iframe);

        //driver.switchTo().frame(0);
        driver.switchTo().frame("mce_0_ifr");

        WebElement textArea = driver.findElement(By.tagName("p"));
        assertTrue(textArea.isDisplayed());
        driver.switchTo().parentFrame();

    }


}
