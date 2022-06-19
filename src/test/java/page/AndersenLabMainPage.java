package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AndersenLabMainPage {
    By andersenLogoLocator = By.xpath("//a/*[1]");
    By andersenMailLocator = By.xpath("//a[@href='mailto:vn@andersenlab.com']");

    private final WebDriver driver;

    public AndersenLabMainPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ivana\\IdeaProjects\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get("https://andersenlab.com/");
    }

    public WebElement getLogoElement() {
        return driver.findElement(andersenLogoLocator);
    }

    public WebElement getMailElement() {
        return driver.findElement(andersenMailLocator);
    }

    public void close(){
        this.driver.close();
    }
}
