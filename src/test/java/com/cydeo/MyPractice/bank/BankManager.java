package com.cydeo.MyPractice.bank;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BankManager {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }


    @Test

    public void bank_manager_login() {

        WebElement cutomerLoginButton = driver.findElement(By.xpath("//button[.='Bank Manager Login']"));
        cutomerLoginButton.click();
        WebElement addCustomerButton = driver.findElement(By.xpath("//button[@ng-class='btnClass1']"));
        addCustomerButton.click();
        WebElement firstNameInputBox = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstNameInputBox.sendKeys("Havva");
        WebElement LastNameInputBox = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        LastNameInputBox.sendKeys("Demirel");
        WebElement postCodeInputBox = driver.findElement(By.xpath("//input[@placeholder='Post Code']"));
        postCodeInputBox.sendKeys("DH4 7LT");
        WebElement addCustomerSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
        addCustomerSubmit.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.close();

    }

    @Test
    public void openAccountTest() {
        WebElement cutomerLoginButton = driver.findElement(By.xpath("//button[.='Bank Manager Login']"));
        cutomerLoginButton.click();
        WebElement openAccountButton = driver.findElement(By.xpath("//button[@ng-class='btnClass2']"));
        openAccountButton.click();
        WebElement customerDropdown = driver.findElement(By.xpath("//select[@name='userSelect']"));
        //customerDropdown.click();
        Select customerName = new Select(customerDropdown);
        customerName.selectByVisibleText("Hermoine Granger");

        WebElement currencyDropdown = driver.findElement(By.xpath("//select[@name='currency']"));
        Select currency = new Select(currencyDropdown);
        currency.selectByIndex(2);

        WebElement processButton = driver.findElement(By.xpath("//button[@type='submit']"));
        processButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    @Test
    public void customerDeleteTable() {
        WebElement cutomerLoginButton = driver.findElement(By.xpath("//button[.='Bank Manager Login']"));
        cutomerLoginButton.click();
        WebElement customersButton = driver.findElement(By.xpath("//button[@ng-class='btnClass3']"));
        customersButton.click();
        WebElement harryPotterDeleteButton = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped']//tbody//tr[2]//td[5]//button"));
        harryPotterDeleteButton.click();
        driver.close();
    }
    //WebElement harryPotterDeleteButton = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped']//tbody//tr["+2+"]//td[5]//button"));

    public void customerDeleteMethod(WebDriver driver, int numberOfCustomer) {

     //   driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        WebElement cutomerLoginButton = driver.findElement(By.xpath("//button[.='Bank Manager Login']"));
        cutomerLoginButton.click();
        WebElement customersButton = driver.findElement(By.xpath("//button[@ng-class='btnClass3']"));
        customersButton.click();

        String locator = "//table[@class='table table-bordered table-striped']//tbody//tr[" + numberOfCustomer + "]//td[5]//button";
        WebElement deleteButton = driver.findElement(By.xpath(locator));
        deleteButton.click();


    }

    @Test
    public void deneme() {

        customerDeleteMethod(driver, 1);

    }


}



