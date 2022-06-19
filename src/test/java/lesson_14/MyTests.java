package lesson_14;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class MyTests {
    private WebDriver driver;
    private WebElement andersenLogo;
    private WebElement andersenMail;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ivana\\IdeaProjects\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(TestData.URL);
    }

    @Test
    public void findAndersenLogo() {
        andersenLogo = driver.findElement(By.xpath(TestData.ANDERSEN_LOGO_XPATH));
        RemoteWebElement andersenLogoResult = (RemoteWebElement) andersenLogo;
        Assert.assertEquals(TestData.EXPECTED_ANDERSEN_LOGO_CLASS, andersenLogoResult.getAttribute("class"));

        driver.close();
    }

    @Test
    public void findAndersenMail() {
        andersenMail = driver.findElement(By.xpath(TestData.ANDERSEN_MAIL));
        RemoteWebElement andersenMailResult = (RemoteWebElement) andersenMail;
        Assert.assertEquals(TestData.EXPECTED_ANDERSEN_MAIL_CLASS, andersenMailResult.getAttribute("class"));
        driver.close();
    }
}
