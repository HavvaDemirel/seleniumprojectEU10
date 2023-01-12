package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

         String expectedUrl = "cydeo";
         String actualUrl = driver.getCurrentUrl();

         if (actualUrl.contains(expectedUrl)){
             System.out.println("url verification passed");
         }else {
             System.out.println("url verification failed");
         }
         String expectedTitle = "practice";
         String actualTitle = driver.getTitle();
         if (actualTitle.equalsIgnoreCase(expectedTitle)){
             System.out.println("title verification passed");
         }else {
             System.out.println("url verification failed");
         }
         driver.close();


    }
}
