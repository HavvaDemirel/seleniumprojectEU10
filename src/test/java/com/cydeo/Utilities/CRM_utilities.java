package com.cydeo.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_utilities {
    //this method will login with helpdesk@cybertekschool.com  when it is called

    public static void crm_login(WebDriver driver){
        WebElement inputBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputBox.sendKeys("helpdesk1@cybertekschool.com");
        WebElement inputBoxPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputBoxPassword.sendKeys("UserUser");
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

    }
//we overload the previous method
    public static void crm_login(WebDriver driver, String username, String userPassword){
        WebElement inputBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputBox.sendKeys(username);
        WebElement inputBoxPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputBoxPassword.sendKeys(userPassword);
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

    }






}
