package com.cydeo.MyPractice;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static com.cydeo.MyPractice.smartBearUtils.logInSmartBear;

public class dene extends TestBase {

    @Test
    public void test(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    logInSmartBear(driver);
        WebElement familyAlbum = driver.findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']"));
        Select select = new Select(familyAlbum);
        select.selectByVisibleText("FamilyAlbum");
        WebElement quantityInput = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']"));
        quantityInput.sendKeys("2");
        //8. Click to “Calculate” button
        WebElement calculateButton = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();

}
}
