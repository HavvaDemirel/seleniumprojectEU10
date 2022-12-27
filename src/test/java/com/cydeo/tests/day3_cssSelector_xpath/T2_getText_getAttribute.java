package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");

        //3- Verify “remember me” label text is as expected:
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        //Expected: Remember me on this computer
        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();
        if (actualRememberMeLabel.equals(expectedRememberMeLabel)) {
            System.out.println("Remember me label verification PASSED!");
        } else {
            System.out.println("Remember me label verification FAILED!");
        }

        //4- Verify “forgot password” link text is as expected:
       WebElement ForgotYourPasswordLink =  driver.findElement(By.className("login-link-forgot-pass"));
      // ForgotYourPasswordLink.click();
        //Expected: Forgot your password?
        String expectedForgotPasswordLink = "Forgot your password?";
        String actualForgotPasswordLink =  ForgotYourPasswordLink.getText();
        if (actualForgotPasswordLink.equalsIgnoreCase(expectedForgotPasswordLink)){
            System.out.println("Forgot Password link verification PASSED!");
        }else{
            System.out.println("Forgot Password link verification FAILED!");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue =ForgotYourPasswordLink.getAttribute("href");
        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);
        if (actualHrefAttributeValue.contains(expectedInHref)){
            System.out.println("HREF attribute verification PASSED!");
        }else{
            System.out.println("HREF attribute verification PASSED!");
        }

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
    }
}
