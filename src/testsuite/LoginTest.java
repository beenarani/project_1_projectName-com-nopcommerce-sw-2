package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;

/**
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully * click on the ‘Login’ link
 * * Verify the text ‘Welcome, Please Sign In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials
 * * click on the ‘Login’ link
 * * Enter valid username
 * * Enter valid password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Log out’ text is display
 * 3. verifyTheErrorMessage
 * * click on the ‘Login’ link
 * * Enter invalid username
 * * Enter invalid password
 * * Click on Login button
 * * Verify the error message ‘Login was unsuccessful.Please correct the errors and try again. No customer account found’
 */
public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        //Find the login link and click on login link
        driver.findElement(By.linkText("Log in")).click();

        //Verify the text ‘Welcome, Please Sign In!’
        String expectedText = "Welcome, Please Sign In!";
        WebElement welcomeTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = welcomeTextElement.getText();
        Assert.assertEquals("welcome", expectedText, actualText);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        //click on the ‘Login’ link
        driver.findElement(By.linkText("Log in")).click();

        //Enter valid username
        driver.findElement(By.id("Email")).sendKeys("beenarani45@gmail.com");

        //Enter valid Password
        driver.findElement(By.id("Password")).sendKeys("password");

        //click on login
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        //Verify the ‘Log out’ text is display
        String expectedText = "Log out";
        WebElement logOut = driver.findElement(By.className("ico-logout"));
        String actualText = logOut.getText();
        Assert.assertEquals("Log out", expectedText, actualText);
    }

    @Test
    public void verifyTheErrorMessage() {

        //click on login
        driver.findElement(By.linkText("Log in")).click();

        //Enter invalid username
        driver.findElement(By.id("Email")).sendKeys("beenarani45@gmail.com");

        //Enter invalid password
        driver.findElement(By.id("Password")).sendKeys("password");

        //Click on login
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        //Verify the Error massage
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class = 'message-error validation-summary-errors']")).getText();
        Assert.assertEquals("error message not displayed", expectedErrorMessage, actualErrorMessage);
    }

    @After
    public void tearDown() {
        driver.close();

    }

}
