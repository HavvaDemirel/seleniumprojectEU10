package com.cydeo.tests.Shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class week4Review {
    @Test

    public static void clickBtn(String btnName){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.tutorialstonight.com/html-radio-button");

        WebElement btn ;

        switch (btnName){
            case(" Email "):
                btn=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
                btn.click();
                break;
            case(" Phone "):
                btn=driver.findElement(By.xpath("//input[@type='radio'][2]"));
                btn.click();
                break;
            case(" Mail "):
                btn=driver.findElement(By.xpath("//input[@type='radio'][3]"));
                btn.click();
                break;
        }
}
}