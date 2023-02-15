import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OnLinerTestShort {
    WebDriver driver;
    @Before
    public void setUpOnLiner(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OnLinerPage.URL);
    }
    @Test
    public void testOpenOnLiner() {
        Assert.assertEquals(OnLinerPage.TEXT, driver.findElement(By.xpath(OnLinerPage.COPYRIGHT)).getText());
    }
    @Test
    public void testOpenOnLinerLoginForm() {
        driver.findElement(By.xpath(OnLinerPage.BTN_ENTER)).click();
        Assert.assertEquals(OnLinerPage.TITLE_ENTER_TEXT_EXPECTED, driver.findElement(By.xpath(OnLinerPage.TITLE_ENTER_TEXT)).getText());
    }
    @Test
    public void testOnLinerLoginFormWithEmptyCredentials() {
        driver.findElement(By.xpath(OnLinerPage.BTN_ENTER)).click();
        driver.findElement(By.xpath(OnLinerPage.BTN_AUTH)).click();
        new WebDriverWait(driver, Duration.ofSeconds(7)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(OnLinerPage.ERROR_MSG_LOGIN)));
        Assert.assertEquals(OnLinerPage.ERROR_MSG_LOGIN_EXPECTED, driver.findElement(By.xpath(OnLinerPage.ERROR_MSG_LOGIN)).getText());
        Assert.assertEquals(OnLinerPage.ERROR_MSG_PASSWORD_EXPECTED, driver.findElement(By.xpath(OnLinerPage.ERROR_MSG_PASSWORD)).getText());
    }
    @Test
    public void testOnLinerLoginFormWithEmptyPassword() {
        driver.findElement(By.xpath(OnLinerPage.BTN_ENTER)).click();
        driver.findElement(By.xpath(OnLinerPage.LOGIN_PLACEHOLDER)).sendKeys(OnLinerPage.ENTERING_EMAIL);
        driver.findElement(By.xpath(OnLinerPage.BTN_AUTH)).click();
        new WebDriverWait(driver,Duration.ofSeconds(7)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(OnLinerPage.ERROR_MSG_PASSWORD)));
        Assert.assertEquals(OnLinerPage.ERROR_MSG_PASSWORD_EXPECTED, driver.findElement(By.xpath(OnLinerPage.ERROR_MSG_PASSWORD)).getText());
    }
    @After
    public void closeDownOnLiner(){
        driver.quit();
    }
}
