import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
    @Test
    public void testOpenAmazon() {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AmazonPage.URL);

        By copyright = By.xpath(AmazonPage.COPYRIGHT);
        WebElement COPYRIGHT = driver.findElement(copyright);
        Assert.assertEquals(AmazonPage.TEXT, COPYRIGHT.getText());

        driver.quit();
    }
    @Test
    public void testOpenAmazonCart(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AmazonPage.URL);

        By btnCart = By.xpath(AmazonPage.BTN_CART);
        WebElement BTN_CART_WEB = driver.findElement(btnCart);
        BTN_CART_WEB.click();
        By titleCartText = By.xpath(AmazonPage.TITLE_CART_TEXT);
        WebElement TITLE_CART_TEXT_WEB = driver.findElement(titleCartText);

        Assert.assertEquals(AmazonPage.TITLE_CART_TEXT_EXPECTED, TITLE_CART_TEXT_WEB.getText());

        driver.quit();
    }
    @Test
    public void testOpenAmazonLoginForm() {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AmazonPage.URL);

        By btnCart = By.xpath(AmazonPage.BTN_CART);
        WebElement BTN_CART_WEB = driver.findElement(btnCart);
        BTN_CART_WEB.click();

        By btnSignIn = By.xpath(AmazonPage.BTN_SIGN_IN);
        WebElement BTN_SIGN_IN_WEB = driver.findElement(btnSignIn);
        BTN_SIGN_IN_WEB.click();

        By titleSingIn = By.xpath(AmazonPage.TITLE_SIGN_IN_TEXT);
        WebElement TITLE_SIGN_IN_TEXT_WEB = driver.findElement(titleSingIn);

        Assert.assertEquals(AmazonPage.TITLE_SIGN_IN_TEXT_EXPECTED, TITLE_SIGN_IN_TEXT_WEB.getText());

        driver.quit();
    }
}
