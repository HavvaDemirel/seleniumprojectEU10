package com.cydeo.Utilities;

// task: new method creation
// merhod name
// static method
// acceot string args: browser type
// - this arg will determine what type of browser is opened
// - if chrome passes ==> it will open chrome
// - if chrome failes ==>

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        }else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else{
            System.out.println("given browser does not exist / or is nor current supported");
            System.out.println("driver=null");
            return null;
        }

    }

}
