package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 4. Write down the following test into ‘TopMenuTest’ class
 * 1. userShouldNavigateToComputerPageSuccessfully
 * * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 * * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully
 * * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’
 * 4.userShouldNavigateToDigitalDownloadsPageSuccessfully
 * * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully
 * * click on the ‘Books’ Tab
 * * Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully
 * * click on the ‘Jewelry’ Tab
 * * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 * * click on the ‘Gift Cards’ Tab
 * * Verify the text ‘Gift Cards’
 */
public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    //Annotation
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    //Annotation
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        //click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//a[contains(text(), 'Computers')]")).click();

        //Verify the computer text
        String expectedText = "Computers";
        WebElement computersElement = driver.findElement(By.xpath("//h1"));
        String actualText = computersElement.getText();
        Assert.assertEquals("", expectedText, actualText);


    }

    //Annotation
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        //click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//a[contains(text(), 'Electronics')]")).click();

        //Verify the computer text
        String expectedText = "Electronics";
        WebElement electronicsElement = driver.findElement(By.xpath("//h1"));
        String actualText = electronicsElement.getText();
        Assert.assertEquals("", expectedText, actualText);
    }

    //Annotation
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {

        //click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//a[contains(text(), 'Apparel')]")).click();

        //Verify the computer text
        String expectedText = "Apparel";
        WebElement apparelElement = driver.findElement(By.xpath("//h1"));
        String actualText = apparelElement.getText();
        Assert.assertEquals("", expectedText, actualText);

    }

    //Annotation
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        //click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//a[contains(text(), 'Digital downloads')]")).click();

        //Verify the computer text
        String expectedText = "Digital downloads";
        WebElement digitaldownloadsElement = driver.findElement(By.xpath("//h1"));
        String actualText = digitaldownloadsElement.getText();
        Assert.assertEquals("", expectedText, actualText);

    }

    //Annotation
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {

        //click on the ‘Books’ Tab
        driver.findElement(By.xpath("//a[contains(text(), 'Books')]")).click();

        //Verify the computer text
        String expectedText = "Books";
        WebElement booksElement = driver.findElement(By.xpath("//h1"));
        String actualText = booksElement.getText();
        Assert.assertEquals("", expectedText, actualText);

    }

    //Annotation
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {

        //click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//a[contains(text(), 'Jewelry')]")).click();

        //Verify the computer text
        String expectedText = "Jewelry";
        WebElement jewelryElement = driver.findElement(By.xpath("//h1"));
        String actualText = jewelryElement.getText();
        Assert.assertEquals("", expectedText, actualText);

    }

    //Annotation
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {

        //click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//a[contains(text(), 'Gift Cards')]")).click();

        //Verify the computer text
        String expectedText = "Gift Cards";
        WebElement giftCardsElement = driver.findElement(By.xpath("//h1"));
        String actualText = giftCardsElement.getText();
        Assert.assertEquals("", expectedText, actualText);
    }

    //Annotation
    @After
    public void tearDown() {
        driver.close();

    }
}