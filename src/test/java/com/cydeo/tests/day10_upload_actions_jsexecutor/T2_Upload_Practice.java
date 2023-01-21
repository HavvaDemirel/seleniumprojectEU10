package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {


    @Test
    public void upload_test() {

        //TC #2 Upload Test
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        //2. Find some small file from your computer, and get the path of it.
        String path ="C:\\Users\\HAVVA\\Desktop\\scrlling.jpg";
        //3. Upload the file.
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));
        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);
        WebElement fileUploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        fileUploadButton.click();
        //4. Assert:
        //-File uploaded text is displayed on the page
        String actualHeader = Driver.getDriver().findElement(By.tagName("h3")).getText();

        String expectedHeader = "File Uploaded!";
        Assert.assertEquals(actualHeader,expectedHeader);



    }
}
