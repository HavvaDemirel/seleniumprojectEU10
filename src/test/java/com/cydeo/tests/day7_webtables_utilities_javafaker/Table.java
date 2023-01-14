package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Table extends TestBase {

    //http://practice.cydeo.com/tables

    @Test
    public void TableTest() {
        driver.get("https://practice.cydeo.com/tables");

        //write a locator that returns the table 1 itself
        WebElement table1 = driver.findElement(By.xpath("//table[@id='table1']"));
        //write a locator that returns all of the rows inside of the table 1
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        //write a locator that returns all of the rows inside of the body table 1
        List<WebElement> rowsInsideBody = driver.findElements(By.xpath("//table[@id='table1']/tbody//tr"));
        //write a locator that returns third row inside of the body
        WebElement thirdRow = driver.findElement(By.xpath("//table[@id='table1']/tbody//tr[3]"));
        //System.out.println("thirdRow.getText() = " + thirdRow.getText());
        //write a locator that returns all of the cells all of the rows
        List<WebElement> allCells = driver.findElements(By.xpath("//table[@id='table1']/tbody//tr//td"));
        System.out.println("allCells.size() = " + allCells.size());
        //write a locator that returns all of the firstname
        List<WebElement> allFirstNames = driver.findElements(By.xpath("//table[@id='table1']/tbody//tr//td[2]"));
        //write a locator that returns Franks cell specifically
        WebElement FranksCell = driver.findElement(By.xpath("//table[@id='table1']/tbody//tr[2]//td[2]"));
        System.out.println("FranksCell.getText() = " + FranksCell.getText());
        //tr[2] says get me the second row in the <tbody>
        //td[2] says get me the second cell in the 2nd row
        //write a locator that returns Franks cell specifically use franks text
        WebElement franksCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Frank']"));
        //if you can create locators with text it will be more dependent against the dynamism of the table
        WebElement hundredDolar = driver.findElement(By.xpath("//table[@id='table1']//td[.='$100.00']"));
        //write a locator that returns jason due amount based on jasons name
        WebElement jasons = driver.findElement(By.xpath("//table[@id='table1']//td[.='Jason']/../td[4]"));
        //opt1   we located jason and go to paren row, and come back in the same row to get due cell
        WebElement jasonsOPT2 = driver.findElement(By.xpath("//table[@id='table1']//td[.='Jason']/following-sibling::td[2]"));
        //opt2 we located the sibling
        //Write a locator that returns tims last name based on tims name
        WebElement timsLastName = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/preceding-sibling::td[1]"));
        System.out.println("timsLasName.getText() = " + timsLastName.getText());
        //to find the last name of tim we can go parent too
        WebElement timsLastname = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[1]"));
        System.out.println("timsLastname.getText() from parent= " + timsLastname.getText());






    }
}
