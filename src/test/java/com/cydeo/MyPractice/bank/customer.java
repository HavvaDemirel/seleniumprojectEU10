package com.cydeo.MyPractice.bank;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class customer  {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }

    @Test
    public void deposit() {
        WebElement customerLoginButton = driver.findElement(By.xpath("//button[.='Customer Login']"));
        customerLoginButton.click();
        WebElement nameDropDown = driver.findElement(By.xpath("//select[@name='userSelect']"));
        Select select = new Select(nameDropDown);
        select.selectByVisibleText("Harry Potter");
        WebElement loginButton = driver.findElement(By.xpath("//button[.='Login']"));
        loginButton.click();
        WebElement depositButton = driver.findElement(By.xpath("//button[@ng-class='btnClass2']"));
        depositButton.click();

        WebElement amountToBeDepositedInput = driver.findElement(By.xpath("//input[@type='number']"));
        amountToBeDepositedInput.sendKeys("100.000");

        WebElement depositButtonEnter = driver.findElement(By.xpath("//button[.='Deposit']"));
        depositButtonEnter.click();
        BrowserUtils.sleep(2);
        WebElement withDrawlButton = driver.findElement(By.xpath("//button[@ng-class='btnClass3']"));
        withDrawlButton.click();
        BrowserUtils.sleep(2);
        WebElement amountToBeWithdrawn = driver.findElement(By.xpath("//input[@placeholder='amount']"));
        amountToBeWithdrawn.sendKeys("50.000");
        BrowserUtils.sleep(2);
        WebElement withDrawSubmitButton = driver.findElement(By.xpath("//button[.='Withdraw']"));
        withDrawSubmitButton.click();



    }

    @Test
    public void TransactionsTest() {
        WebElement customerLoginButton = driver.findElement(By.xpath("//button[.='Customer Login']"));
        customerLoginButton.click();
        WebElement nameDropDown = driver.findElement(By.xpath("//select[@name='userSelect']"));
        Select select = new Select(nameDropDown);
        select.selectByVisibleText("Harry Potter");
        WebElement loginButton = driver.findElement(By.xpath("//button[.='Login']"));
        loginButton.click();
        WebElement depositButton = driver.findElement(By.xpath("//button[@ng-class='btnClass2']"));
        depositButton.click();
        WebElement amountToBeDepositedInput = driver.findElement(By.xpath("//input[@type='number']"));
        amountToBeDepositedInput.sendKeys("100.000");
        WebElement depositButtonEnter = driver.findElement(By.xpath("//button[.='Deposit']"));
        depositButtonEnter.click();
        WebElement transactions = driver.findElement(By.xpath("//button[@class='btn btn-lg tab']"));
        transactions.click();
        WebElement checkAmount = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped']//tbody//tr//td[2]"));
        double actualAmount = Double.parseDouble(checkAmount.getText());
        double expectedAmount = 100.000;
        Assert.assertEquals(actualAmount, expectedAmount);



    }
    @Test
    public void withDraw(){
  WebElement customerLoginButton = driver.findElement(By.xpath("//button[.='Customer Login']"));
        customerLoginButton.click();

        WebElement nameDropDown = driver.findElement(By.xpath("//select[@name='userSelect']"));
        Select select = new Select(nameDropDown);
        select.selectByVisibleText("Harry Potter");

        WebElement loginButton = driver.findElement(By.xpath("//button[.='Login']"));
        loginButton.click();

        WebElement withDrawlButton = driver.findElement(By.xpath("//button[@ng-class='btnClass3']"));
        withDrawlButton.click();

        WebElement amountToBeWithdrawn = driver.findElement(By.xpath("//input[@placeholder='amount']"));
        amountToBeWithdrawn.sendKeys("50.000");

        WebElement withDrawSubmitButton = driver.findElement(By.xpath("//button[.='Withdraw']"));
        withDrawSubmitButton.click();
    }




}
