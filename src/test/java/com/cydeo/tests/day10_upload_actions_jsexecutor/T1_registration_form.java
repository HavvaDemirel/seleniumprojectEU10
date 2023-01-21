package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_registration_form {
    WebDriver driver;

  /*  @BeforeMethod
    public void beforeTest() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }*/

    @Test
    public void registration_form_test() {
        //TC#1: Registration form confirmation
        //Note: Use JavaFaker OR read from configuration.properties file when possible.
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        // driver.get("https://practice.cydeo.com/registration_form");   instead of this line we can call configuration proparties
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));//singlton
        //3. Enter first name
        WebElement firsNameInputbox = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        Faker faker = new Faker();
        firsNameInputbox.sendKeys(faker.name().firstName());
        //4. Enter last name
        WebElement lastNameInputBox = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastNameInputBox.sendKeys(faker.name().lastName());
        //5. Enter username
        String user = faker.bothify("helpdesk###");
        WebElement userNameInputbox = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        userNameInputbox.sendKeys(faker.bothify(user));
        //6. Enter email address
        WebElement emailInputBox = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        emailInputBox.sendKeys(user + "@email.com");
        //7. Enter password
        WebElement passwordInputBox = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        passwordInputBox.sendKeys(faker.bothify("???##??#"));//faker.internet().password
        //8. Enter phone number
        WebElement phoneNumInputBox = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumInputBox.sendKeys(faker.numerify("###-###-####"));
        //9. Select a gender from radio buttons
        WebElement genderRadioButton = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        //10. Enter date of birth
        WebElement birthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        birthday.sendKeys("11/12/2000");
        //11. Select Department/Office
        WebElement depertmentDropdown = Driver.getDriver().findElement(By.xpath("//input[@name='department']"));
        Select select = new Select(depertmentDropdown);
        select.selectByVisibleText("Accounting Office");
        //12. Select Job Title
        WebElement jobTitleDropdown = Driver.getDriver().findElement(By.xpath("//input[@name='job_title']"));
        Select select1 = new Select(jobTitleDropdown);
        select1.selectByIndex(2);
        //13. Select programming language from checkboxes
        WebElement programmingLanguageCheckbox = Driver.getDriver().findElement(By.xpath("//label[@class='col-sm-3 control-label']"));
       // Select select2 = new Select(programmingLanguageCheckbox);
       // select2.selectByIndex(2);
        //14. Click to sign up button
        //15. Verify success message “You’ve successfully completed registration.” is
        //displayed.
        //
        //
        //Note:
        //1. Use new Driver utility class and method
        //2. User JavaFaker when possible
        //3. User ConfigurationReader when it makes sense

    }
}