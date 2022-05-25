package lesson_11;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static lesson_11.TestData.*;

public class DiaryRegistrationTests {
    private WebDriver driver;
    private WebElement loginInput;
    private WebElement passwordInput;
    private WebElement emailInput;
    private WebElement confirmButton;
    private WebElement signupButton;

    @Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ivana\\IdeaProjects\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(TestData.URL);
    }

    @Test
    public void happyPathSignUp() throws InterruptedException {

        loginInput = driver.findElement(By.xpath(TestData.LOGIN_INPUT_XPATH));
        loginInput.click();
        loginInput.sendKeys(TestData.USER_LOGIN);

        passwordInput = driver.findElement(By.xpath(TestData.PASSWORD_INPUT_XPATH));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(TestData.USER_PASSWORD);

        emailInput = driver.findElement(By.xpath(TestData.EMAIL_INPUT_XPATH));
        emailInput.click();
        emailInput.sendKeys(TestData.USER_EMAIL);

        confirmButton = driver.findElement(By.xpath(TestData.CONFIRM_BUTTON));
        confirmButton.click();

        signupButton = driver.findElement(By.xpath(TestData.SIGNUP_BUTTON));
        signupButton.click();

        Thread.sleep(5000);
        driver.findElement(By.xpath(HAPPY_PATH_LOCATOR));

        driver.close();
    }

    @Test
    public void failPathSignUpByWrongEmail() {

        loginInput = driver.findElement(By.xpath(TestData.LOGIN_INPUT_XPATH));
        loginInput.click();
        loginInput.sendKeys(TestData.USER_LOGIN);

        passwordInput = driver.findElement(By.xpath(TestData.PASSWORD_INPUT_XPATH));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(TestData.USER_PASSWORD);

        emailInput = driver.findElement(By.xpath(TestData.EMAIL_INPUT_XPATH));
        emailInput.click();
        emailInput.sendKeys(TestData.USER_WRONG_EMAIL);

        confirmButton = driver.findElement(By.xpath(TestData.CONFIRM_BUTTON));
        confirmButton.click();

        signupButton = driver.findElement(By.xpath(TestData.SIGNUP_BUTTON));
        signupButton.click();

        driver.findElement(By.xpath(FAIL_PATH_WRONG_EMAIL_LOCATOR));

        driver.close();
    }

    @Test
    public void failPathSignUpByWrongLogin() {

        loginInput = driver.findElement(By.xpath(TestData.LOGIN_INPUT_XPATH));
        loginInput.click();
        loginInput.sendKeys(TestData.USER_WRONG_LOGIN);

        passwordInput = driver.findElement(By.xpath(TestData.PASSWORD_INPUT_XPATH));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(TestData.USER_PASSWORD);

        emailInput = driver.findElement(By.xpath(TestData.EMAIL_INPUT_XPATH));
        emailInput.click();
        emailInput.sendKeys(TestData.USER_EMAIL);

        confirmButton = driver.findElement(By.xpath(TestData.CONFIRM_BUTTON));
        confirmButton.click();

        signupButton = driver.findElement(By.xpath(TestData.SIGNUP_BUTTON));
        signupButton.click();

        driver.findElement(By.xpath(FAIL_PATH_WRONG_LOGIN_LOCATOR));

        driver.close();
    }
}