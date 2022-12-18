package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1-setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2-create instance of the driver
        WebDriver driver = new ChromeDriver();

        //3- go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");
        String currentTitle = driver.getTitle();
        System.out.println("title : "+currentTitle);
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //stop execution for 3 second
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();

        //stop execution for 3 second
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //stop execution for 3 second
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().refresh();

        //use navigate().to():
        driver.navigate().to("https://www.google.com");

        //get title
        String currentTitlee = driver.getTitle();
        System.out.println("Title : "+currentTitlee);


        //get current url using selenium
        String url = driver.getCurrentUrl();
        System.out.println("currentURL = " + url);

         //this will close the current opened window
          driver.close();

          //this will close all of opened page
         // driver.quit();




    }
}
