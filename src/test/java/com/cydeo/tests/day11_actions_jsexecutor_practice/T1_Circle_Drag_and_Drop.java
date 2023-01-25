package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_and_Drop {
    @Test
    public void drag_and_drop_test(){



        //TC #: Drag and drop
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        BrowserUtils.sleep(3);
        //2. Drag and drop the small circle to bigger circle.
        WebElement acceptButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptButton.click();
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle,bigCircle).perform();
        actions.click(smallCircle).moveToElement(bigCircle).release().perform();
        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        String actualText =  bigCircle.getText();
       String  expectedText = "You did great!";
        Assert.assertEquals(actualText,expectedText);
        Driver.getDriver().close();
}
}