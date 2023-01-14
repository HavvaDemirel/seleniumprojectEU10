package com.cydeo.tests.day8_proparties_config_reader;

import com.cydeo.Utilities.WebTableUtils;
import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_WebTable_order_Verify extends TestBase {

    @Test

    public void order_name_verify_test() {

        //TC #1: Web table practice
        // 1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");

        //2. Verify Bob’s name is listed as expected.

        WebElement bobMartin = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        System.out.println("bobMartin.getText() = " + bobMartin.getText());
        String expectedBobname = "Bob Martin";
        String actualBobName = bobMartin.getText();
        Assert.assertEquals(actualBobName, expectedBobname);

        WebElement orderDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        System.out.println("orderDate.getText() = " + orderDate.getText());
        String expectedOrderDate = "12/31/2021";
        String actualOrderDate = orderDate.getText();
        Assert.assertEquals(actualOrderDate, expectedOrderDate);
        //Expected: “Bob Martin”
        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021
    }

    @Test
    public void test2() {
        driver.get("https://practice.cydeo.com/web-tables");

        String customerOrderDate = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");
        System.out.println("customerOrderDate = " + customerOrderDate);


    }


    //using WebUtils orderverify method
    @Test
    public void test3(){
        driver.get("https://practice.cydeo.com/web-tables");
       WebTableUtils.orderVerify(driver,"Bart Fisher","01/16/2021");

    }




}
