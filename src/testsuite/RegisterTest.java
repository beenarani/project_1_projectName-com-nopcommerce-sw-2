package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * 5. Write down the following test into ‘RegisterTest’ class
 * 1. userShouldNavigateToRegisterPageSuccessfully
 * * click on the ‘Register’ link
 * * Verify the text ‘Register’
 * 2. userShouldRegisterAccountSuccessfully * click on the ‘Register’ link
 * * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on REGISTER button
 * * Verify the text 'Your registration completed’
 */
public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    //Annotation
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    //Annotation
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {

        //click on the ‘Register’ link
        driver.findElement(By.className("ico-register")).click();

        //Verify the text ‘Register’
        String expectedText = "Register";
        WebElement registerElement = driver.findElement(By.xpath("//h1"));
        String actualText = registerElement.getText();
        Assert.assertEquals(" ", expectedText, actualText);

    }

    //Annotation
    @Test
    public void userShouldRegisterAccountSuccessfully() {

        //click on the ‘Register’ link
        driver.findElement(By.className("ico-register")).click();

        //Select gender radio button
        driver.findElement(By.id("gender-female")).click();

        //Enter First Name
        driver.findElement(By.id("FirstName")).sendKeys("Beena");

        //Enter Last Name
        driver.findElement(By.id("LastName")).sendKeys("Rani");

        //Enter Date of Birth
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("25");

        //Enter Month Of Birth
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("2");

        //Enter Year of Birth
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1991");

        //Enter Email-id
        driver.findElement(By.id("Email")).sendKeys("beenarani45@gmail.com");

        //Enter Password
        driver.findElement(By.id("Password")).sendKeys("password");

        //Confirm Password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("password");

        //Click on register
        driver.findElement(By.name("register-button")).click();


        //Verify the text ‘Register’
        String expectedText = "Your registration completed";
        WebElement registration = driver.findElement(By.xpath("//div[@class='result']"));
        String actualText = registration.getText();
        Assert.assertEquals(" ", expectedText, actualText);
    }

    //Annotation
    @After
    public void tearDown() {
        driver.close();
    }
}

