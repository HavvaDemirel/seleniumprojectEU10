package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavascriptExecuter {
    @Test
    public void Javascript_executor_test(){
        //TC #6: Scroll using JavascriptExecutor
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll ");

        //3- Use below JavaScript method and scroll
        //((JavascriptExecutor)Driver.getDriver()).executeScript(""); we can use this way as well
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(2);
            js.executeScript("window.scroll(0,7500)");
        }

        //a.  750 pixels down 10 times.
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(2);
            js.executeScript("window.scroll(0,-7500)");
        }
        //b.  750 pixels up 10 times
        //JavaScript method to use : window.scrollBy(0,0)

    }
}
