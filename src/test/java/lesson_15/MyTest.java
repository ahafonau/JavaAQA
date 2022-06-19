package lesson_15;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebElement;
import page.AndersenLabMainPage;

public class MyTest {
    private AndersenLabMainPage andersenLabMainPage;

    @BeforeEach
    public void init(){
        this.andersenLabMainPage = new AndersenLabMainPage();
    }

    @Test
    public void findAndersenLogo() {
        RemoteWebElement andersenLogoResult = (RemoteWebElement) andersenLabMainPage.getLogoElement();
        Assert.assertEquals(TestData.EXPECTED_ANDERSEN_LOGO_CLASS, andersenLogoResult.getAttribute("class"));
    }

    @Test
    public void findAndersenMail() {
        RemoteWebElement andersenMailResult = (RemoteWebElement) andersenLabMainPage.getMailElement();
        Assert.assertEquals(TestData.EXPECTED_ANDERSEN_MAIL_CLASS, andersenMailResult.getAttribute("class"));
    }

    @AfterEach
    public void closeWindow(){
        andersenLabMainPage.close();
    }
}
