package lesson_9;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTests {
    private WebDriver driver;
    private WebElement signInButton;
    private WebElement loginInput;
    private WebElement passwordInput;
    private WebElement submitButton;

    @Before
    public void init() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ivana\\IdeaProjects\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(TestData.URL);
    }

    @Test
    public void happyPath() throws InterruptedException {
        signInButton = driver.findElement(By.xpath(TestData.SIGN_IN_BUTTON_XPATH));
        signInButton.click();

        loginInput = driver.findElement(By.xpath(TestData.LOGIN_INPUT_XPATH));
        loginInput.click();
        loginInput.sendKeys(TestData.USER_EMAIL);

        passwordInput = driver.findElement(By.xpath(TestData.PASSWORD_INPUT_XPATH));
        passwordInput.click();
        passwordInput.sendKeys(TestData.USER_PASSWORD);

        submitButton = driver.findElement(By.xpath(TestData.SUBMIT_BUTTON));
        submitButton.click();

        driver.close();
    }

    @Test
    public void failPath() throws InterruptedException {
        signInButton = driver.findElement(By.xpath(TestData.SIGN_IN_BUTTON_XPATH));
        signInButton.click();

        loginInput = driver.findElement(By.xpath(TestData.LOGIN_INPUT_XPATH));
        loginInput.click();
        loginInput.sendKeys(TestData.USER_EMAIL);

        passwordInput = driver.findElement(By.xpath(TestData.PASSWORD_INPUT_XPATH));
        passwordInput.click();
        passwordInput.sendKeys(TestData.USER_FAIL_PASSWORD);

        submitButton = driver.findElement(By.xpath(TestData.SUBMIT_BUTTON));
        submitButton.click();

        driver.findElement(By.xpath(TestData.FAIL_PATH_TEXT));

        driver.close();
    }
}
