package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.CRM_utilities;
import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN extends TestBase {

    //TC #3: Login scenario
    @Test
    public void crm_login_test(){
        // 1. Create new test and make set ups
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com");
        WebElement inputBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputBox.sendKeys("helpdesk1@cybertekschool.com");
        WebElement inputBoxPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputBoxPassword.sendKeys("UserUser");
         WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
         loginButton.click();
         BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(driver,"My tasks");

    }
  //3. Enter valid username
    //4. Enter valid password
    //5. Click to `Log In` button
    //6. Verify title is as expected:
    //Expected: Portal

    @Test
    public void crm_login_test_2(){

        driver.get("http://login1.nextbasecrm.com");
        CRM_utilities.crm_login(driver,"helpdesk1@cybertekschool.com","UserUser");
        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(driver,"My tasks");

    }
}
