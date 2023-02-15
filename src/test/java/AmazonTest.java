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
}
