import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
    @Test
    public void testOnLinerLoginFormWithEmptyCredentials() {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OnLinerPage.URL);

        By btnEnter = By.xpath(OnLinerPage.BTN_ENTER);
        WebElement BTN_ENTER_WEB = driver.findElement(btnEnter);
        BTN_ENTER_WEB.click();

        By btnAuthorization = By.xpath(OnLinerPage.BTN_AUTH);
        WebElement BTN_AUTH_WEB = driver.findElement(btnAuthorization);
        BTN_AUTH_WEB.click();

        new WebDriverWait(driver,Duration.ofSeconds(7)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(OnLinerPage.ERROR_MSG_LOGIN)));

        WebElement LOGIN_ERROR_Element = driver.findElement(By.xpath(OnLinerPage.ERROR_MSG_LOGIN));
        Assert.assertEquals(OnLinerPage.ERROR_MSG_LOGIN_EXPECTED, LOGIN_ERROR_Element.getText());
        WebElement PASSWORD_ERROR_Element = driver.findElement(By.xpath(OnLinerPage.ERROR_MSG_PASSWORD));
        Assert.assertEquals(OnLinerPage.ERROR_MSG_PASSWORD_EXPECTED, PASSWORD_ERROR_Element.getText());
        driver.quit();

    }

}
