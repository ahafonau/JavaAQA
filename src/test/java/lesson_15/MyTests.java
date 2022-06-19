package lesson_15;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebElement;
import page.AndersenLabMainPage;

public class MyTests {
    private AndersenLabMainPage andersenLabMainPage;

    @Before
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

    @After
    public void closeWindow(){
        andersenLabMainPage.close();
    }
}
