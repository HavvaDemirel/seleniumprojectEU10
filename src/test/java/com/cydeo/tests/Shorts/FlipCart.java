package com.cydeo.tests.Shorts;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FlipCart extends TestBase {


//If you can find the locator you can share it with us.

    @Test
    public void tsort() throws InterruptedException {
        //-  Go to https://www.flipkart.com/
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        WebElement crossButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        crossButton.click();
        WebElement inputBox = driver.findElement(By.xpath("//input[@name='q']"));
        inputBox.click();
        WebElement subMenu = driver.findElement(By.xpath("//li[@class='Y5N33s'][4]"));
       Thread.sleep(1000);
        subMenu.click();
    }
}
