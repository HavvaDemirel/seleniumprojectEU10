package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractice {
    @Test
    public void task_4_and_5_test() {

        //TC #4: Scroll practice
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");
        //3- Scroll down to “Powered by CYDEO”
        //create object of actions and pass our driver instance

        Actions actions = new Actions(Driver.getDriver());
        //4- Scroll using Actions class “moveTo(element)” method
        WebElement cydeoLinkButton = Driver.getDriver().findElement(By.linkText("CYDEO"));
        //
        //TC #5: Scroll practice 2
        /** actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform(); **/ //this is another way that we should know
        actions.moveToElement(cydeoLinkButton).pause(2000).perform();
        //1- Continue from where the Task 4 is left in the same test.
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        //2- Scroll back up to “Home” link using PageUP button
        actions.moveToElement(homeLink).pause(4000).perform();

       // Driver.getDriver().close();
        Driver.closeDriver();
    }

    @Test
    public void test2() {

        Driver.getDriver().get("https://practice.cydeo.com/");
    }

}
