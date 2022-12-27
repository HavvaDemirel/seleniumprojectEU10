package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {


     //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
    //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
      // driver.manage().window().maximize();
      //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");

      //3- Verify “Log in” button text is as expected:
        //Expected: Log In
       // way1  =>   WebElement logIngButtonText = driver.findElement(By.className("login-btn"));

       //way2   =>   WebElement logIngButtonText = driver.findElement(By.cssSelector("input[class='login-btn']"));
        WebElement logIngButtonText = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedLoginButton= "Log In";
        String actualLoginButton=   logIngButtonText.getAttribute("value");

        if(actualLoginButton.equals(expectedLoginButton)){
            System.out.println("Login button text verification passed");
        }else{
            System.out.println("Login button text verification failed");
        }

        //way3  =>

     //PS: Inspect and decide which locator you should be using to locate web
     //elements.
     //PS2: Pay attention to where to get the text of this button from



    }
}
