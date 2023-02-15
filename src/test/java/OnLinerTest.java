import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnLinerTest {
    @Test
    public void testOpenOnLiner() {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OnLinerPage.URL);

        By copyright = By.xpath(OnLinerPage.COPYRIGHT);
        WebElement COPYRIGHT = driver.findElement(copyright);
        Assert.assertEquals(OnLinerPage.TEXT, COPYRIGHT.getText());

        driver.quit();
    }
    @Test
    public void testOpenOnLinerLoginForm() {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OnLinerPage.URL);

        By btnEnter = By.xpath(OnLinerPage.BTN_ENTER);
        WebElement BTN_ENTER_WEB = driver.findElement(btnEnter);
        BTN_ENTER_WEB.click();
        By titleEnterText = By.xpath(OnLinerPage.TITLE_ENTER_TEXT);
        WebElement TITLE_ENTER_TEXT_WEB = driver.findElement(titleEnterText);

        Assert.assertEquals(OnLinerPage.TITLE_ENTER_TEXT_EXPECTED, TITLE_ENTER_TEXT_WEB.getText());

        driver.quit();
    }

}
