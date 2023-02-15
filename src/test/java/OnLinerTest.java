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
}
