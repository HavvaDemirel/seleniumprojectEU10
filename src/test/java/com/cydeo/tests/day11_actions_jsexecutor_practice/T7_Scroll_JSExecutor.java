package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T7_Scroll_JSExecutor {
    @Test
    public void task7_scroll_test(){
        //TC #7: Scroll using JavascriptExecutor
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");
        //3- Scroll down to “Cydeo” link
        Actions actions = new Actions(Driver.getDriver());
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        JavascriptExecutor  js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);
       js.executeScript("arguments[1].scrollIntoView(true)",cydeoLink,homeLink);

        //4- Scroll up to “Home” link
        //5- Use below provided JS method only
        //
        //JavaScript method to use : arguments[0].scrollIntoView(true)
        //
        //Note: You need to locate the links as web elements and pass them as
        //arguments into executeScript() method

    }
}
