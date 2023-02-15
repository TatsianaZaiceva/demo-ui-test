import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestShort {
    WebDriver driver;

    @Before
    public void setUpAmazon() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AmazonPage.URL);
    }
    @Test
    public void testOpenAmazon() {
        Assert.assertEquals(AmazonPage.TEXT, driver.findElement(By.xpath(AmazonPage.COPYRIGHT)).getText());
    }
    @Test
    public void testOpenAmazonCart() {
        driver.findElement(By.xpath(AmazonPage.BTN_CART)).click();
        Assert.assertEquals(AmazonPage.TITLE_CART_TEXT_EXPECTED, driver.findElement(By.xpath(AmazonPage.TITLE_CART_TEXT)).getText());
    }
    @Test
    public void testOpenAmazonLoginForm() {
        driver.findElement(By.xpath(AmazonPage.BTN_CART)).click();
        driver.findElement(By.xpath(AmazonPage.BTN_SIGN_IN)).click();
        Assert.assertEquals(AmazonPage.TITLE_SIGN_IN_TEXT_EXPECTED, driver.findElement(By.xpath(AmazonPage.TITLE_SIGN_IN_TEXT)).getText());
    }
    @Test
    public void testOpenAmazonLoginFormWithEmptyCredentials() {
        driver.findElement(By.xpath(AmazonPage.BTN_CART)).click();
        driver.findElement(By.xpath(AmazonPage.BTN_SIGN_IN)).click();
        driver.findElement(By.xpath(AmazonPage.BTN_CONTINUE_SIGN_IN)).click();
        Assert.assertEquals(AmazonPage.ERROR_MSG_SIGN_IN_TEXT, driver.findElement(By.xpath(AmazonPage.ERROR_MSG_SIGN_IN)).getText());
    }
    @After
    public void closeDownAmazon() {
        driver.quit();
    }
}
